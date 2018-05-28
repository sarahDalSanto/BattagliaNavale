package com.example.dalsa.battaglianavale;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragment1G1.interfaceFragment, Fragment1G2.interfaceFragment2, Fragment2G1.interfaceFragment, Fragment2G2.interfaceFragment2 {

    Fragment1G1 fragment1g1;
    Fragment2G1 fragment2g1;
    Fragment1G2 fragment1g2;
    Fragment2G2 fragment2g2;



    String nomePlayer1, nomePlayer2;
    TextView tv_nomeGiocatore;
    android.support.v4.app.FragmentManager manager;

    boolean[] selezionatiF2G2 = new boolean[49];
    boolean[] selezionatiF2G1 = new boolean[49];

    int[] colpiti = new int[49];

    boolean[] giaSelezionatiF1G1 = new boolean[49];

    //Per salvare i calcoli
    public static final String SELEZIONATO = "SELEZIONATO";
    public static final String SELEZIONATO2 = "SELEZIONATO2";
    public static final String COLPITI = "COLPITI";
    public static final String GIASELEZIONATIF1G1 = "GIASELEZIONATIF1G1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        for (int i = 0; i < 49; i++) {
            selezionatiF2G2[i] = false;
            selezionatiF2G1[i] = false;
            giaSelezionatiF1G1[i] = false;
        }

        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            nomePlayer1 = bundle.get("numero1") + "";
            nomePlayer2 = bundle.get("numero2") + "";
        }

        tv_nomeGiocatore = findViewById(R.id.tv_nomeGiocatore);
        tv_nomeGiocatore.setText( nomePlayer1 + " posiziona le tue barche");

        //Creo tutti i Fragment
        fragment1g1 = new Fragment1G1();
        fragment2g1 = new Fragment2G1();
        fragment1g2 = new Fragment1G2();
        fragment2g2 = new Fragment2G2();

        //Per il fragment2G1
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g1);
        transaction.commit();

        //Salva i contenuti anche se giro lo schermo o cambio activity
        if (savedInstanceState != null) {
            selezionatiF2G2 = savedInstanceState.getBooleanArray(SELEZIONATO);
            selezionatiF2G1 = savedInstanceState.getBooleanArray(SELEZIONATO2);
            colpiti = savedInstanceState.getIntArray(COLPITI);
            giaSelezionatiF1G1 = savedInstanceState.getBooleanArray(GIASELEZIONATIF1G1);

        }
    }

    //Per salvare i dati quando cambio activity
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBooleanArray(SELEZIONATO, selezionatiF2G2);
        outState.putBooleanArray(SELEZIONATO2, selezionatiF2G1);
        outState.putIntArray(COLPITI, colpiti);
        outState.putBooleanArray(GIASELEZIONATIF1G1, giaSelezionatiF1G1);
    }

    //Metodo per i selezionati F2G2
    public void selezionatoTrue_f2g2(int i) {
        selezionatiF2G2[i] = true;
    }

    //Metodo per i selezionati F2G1
    public void selezionatoTrue_f2g1(int i) {
        selezionatiF2G1[i] = true;
    }




    //Metodo per controllare se è stato selezionato qualcosa F1G1
    @Override
    public boolean selezionato_f1g1(int i) {
        return selezionatiF2G2[i];
    }

    @Override
    public void toastColpito_f1g1() {
        Toast.makeText(this, "HAI COLPITO UNA BARCA", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void toastNonColpito_f1g1() {
        Toast.makeText(this, " NON HAI COLPITO NIENTE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View colpito(View v, int i) {
        colpiti[i] = getResources().getColor(R.color.colorColpito);
        v.setBackgroundColor(colpiti[i]);
        return v;
    }

    @Override
    public View nonColpito(View v, int i) {
        colpiti[i] = getResources().getColor(R.color.colorNonColpito);
        v.setBackgroundColor(colpiti[i]);
        return v;
    }

    @Override
    public boolean giaSelezionatiF1G1(int i) {
        return giaSelezionatiF1G1[i] = true;
    }

    //Metodo per controllare se è stato selezionato qualcosa F1G2
    @Override
    public boolean selezionato_f1g2(int i) {
        return selezionatiF2G1[i];
    }

    @Override
    public void toastColpito_f1g2() {
        Toast.makeText(this, "HAI COLPITO UNA BARCA", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void toastNonColpito_f1g2() {
        Toast.makeText(this, " NON HAI COLPITO NIENTE", Toast.LENGTH_SHORT).show();
    }

    //I metodi overrati dai fragment
    @Override
    public void setTextAct_f1g1() {
        tv_nomeGiocatore.setText("Turno di " + nomePlayer2);
    }

    @Override
    public void cambiaFrag_f1g1() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g2);
        transaction.commit();
    }

    @Override
    public void vediBarche_f1g1() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g1);
        transaction.commit();
    }

    @Override
    public void indietro_f2g1() {
            //per andare in F1G1
            manager = getSupportFragmentManager();
            final FragmentTransaction transaction = manager.beginTransaction();
            //Replace perchè alrimenti si sovrappone
            transaction.replace(R.id.container, fragment1g1);
            transaction.commit();

    }
    @Override
    public void avanti_f2g1(){
        //per andare in F2G2
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g2);
        transaction.commit();

    }



    @Override
    public void setTextAct_f2g1(){
        tv_nomeGiocatore.setText(nomePlayer2+" posiziona le tue barche");
    }




    @Override
    public void setTextAct_f1g2() {
        tv_nomeGiocatore.setText("Turno di " + nomePlayer1);
    }

    @Override
    public void cambiaFrag_f1g2() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g1);
        transaction.commit();
    }

    @Override
    public void vediBarche_f1g2() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g2);
        transaction.commit();
    }

    @Override
    public void indietro_f2g2() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g2);
        transaction.commit();
    }

    @Override
    public void avanti_f2g2(){
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g1);
        transaction.commit();
    }

    @Override
    public void setTextAct_f2g2(){
        tv_nomeGiocatore.setText("Turno di "+nomePlayer1);
    }
}
