package com.example.dalsa.battaglianavale;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragment1G1.interfaceFragment, Fragment1G2.interfaceFragment2, Fragment2G1.interfaceFragment, Fragment2G2.interfaceFragment2 {

    String nomePlayer1, nomePlayer2;
    TextView tv_nomeGiocatore;
    android.support.v4.app.FragmentManager manager;

    boolean[] selezionatiF2G2 = new boolean[49];
    boolean[] selezionatiF2G1 = new boolean[49];

    int[] colpiti = new int[49];

    //Per salvare i calcoli
    public static final String SELEZIONATO = "SELEZIONATO";
    public static final String SELEZIONATO2 = "SELEZIONATO2";
    public static final String COLPITI = "COLPITI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        for (int i = 0; i < 49; i++) {
            selezionatiF2G2[i] = false;
            selezionatiF2G1[i] = false;
        }

        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            nomePlayer1 = bundle.get("numero1") + "";
            nomePlayer2 = bundle.get("numero2") + "";
            //Toast.makeText(Main2Activity.this, nomePlayer1+nomePlayer2, Toast.LENGTH_LONG).show();
        }

        tv_nomeGiocatore = findViewById(R.id.tv_nomeGiocatore);
        tv_nomeGiocatore.setText("Turno di " + nomePlayer1);

        //Creo tutti i Fragment
        final Fragment1G1 fragment1g1 = new Fragment1G1();
        Fragment2G1 fragment2g1 = new Fragment2G1();
        Fragment1G2 fragment1g2 = new Fragment1G2();
        Fragment2G2 fragment2g2 = new Fragment2G2();

        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g1);
        transaction.commit();

        //Salva i contenuti anche se giro lo schermo o cambio activity
        if (savedInstanceState != null) {
            selezionatiF2G2 = savedInstanceState.getBooleanArray(SELEZIONATO);
            selezionatiF2G1 = savedInstanceState.getBooleanArray(SELEZIONATO2);
            colpiti = savedInstanceState.getIntArray(COLPITI);
        }
    }

    //Per salvare i dati quando cambio activity
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBooleanArray(SELEZIONATO, selezionatiF2G2);
        outState.putBooleanArray(SELEZIONATO2, selezionatiF2G1);
        outState.putIntArray(COLPITI, colpiti);
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

        final Fragment1G2 fragment2 = new Fragment1G2();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2);
        transaction.commit();
    }

    @Override
    public void vediBarche_f1g1() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment2G1 fragment3 = new Fragment2G1();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment3);
        transaction.commit();
    }

    @Override
    public void indietro_f2g1() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G1 fragment1 = new Fragment1G1();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1);
        transaction.commit();
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

        final Fragment1G1 fragment1 = new Fragment1G1();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1);
        transaction.commit();
    }

    @Override
    public void vediBarche_f1g2() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment2G2 fragment4 = new Fragment2G2();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment4);
        transaction.commit();
    }

    @Override
    public void indietro_f2g2() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G2 fragment2 = new Fragment1G2();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2);
        transaction.commit();
    }
}
