package com.example.dalsa.battaglianavale;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragment1G1.interfaceFragment, Fragment1G2.interfaceFragment2, Fragment2G1.interfaceFragment, Fragment2G2.interfaceFragment2, DialogFragmentVittoria.IDialogFragment, FragIntermedio.interfaceFrag{

    Fragment1G1 fragment1g1;
    Fragment2G1 fragment2g1;
    Fragment1G2 fragment1g2;
    Fragment2G2 fragment2g2;

    DialogFragmentVittoria dialog1, dialog2;
    boolean dialog, frag;

    String nomePlayer1, nomePlayer2;
    TextView tv_nomeGiocatore;
    android.support.v4.app.FragmentManager manager;

    boolean[] selezionatiF2G2 = new boolean[49];
    boolean[] selezionatiF2G1 = new boolean[49];

    //Per salvare i calcoli
    public static final String SELEZIONATO_g1 = "SELEZIONATO_G1";
    public static final String SELEZIONATO_g2 = "SELEZIONATO_G2";
    public static final String FRAG = "frag?";


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
            nomePlayer1 = bundle.get("player1") + "";
            nomePlayer2 = bundle.get("player2") + "";
        }

        tv_nomeGiocatore = findViewById(R.id.tv_nomeGiocatore);
        tv_nomeGiocatore.setText(nomePlayer1 + " place your ships!");

        //Creo tutti i Fragment
        fragment1g1 = new Fragment1G1();
        fragment2g1 = new Fragment2G1();
        fragment1g2 = new Fragment1G2();
        fragment2g2 = new Fragment2G2();

        //Per il fragment2G1
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g1);
        transaction.commit();

        //Salva i contenuti anche se giro lo schermo o cambio activity
        if (savedInstanceState != null) {
            selezionatiF2G2 = savedInstanceState.getBooleanArray(SELEZIONATO_g1);
            selezionatiF2G1 = savedInstanceState.getBooleanArray(SELEZIONATO_g2);
            frag = savedInstanceState.getBoolean(FRAG);
        }
    }

    //Per salvare i dati quando cambio activity
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBooleanArray(SELEZIONATO_g1, selezionatiF2G2);
        outState.putBooleanArray(SELEZIONATO_g1, selezionatiF2G1);
        outState.putBoolean(FRAG, frag);
    }

    //Metodo per i selezionati F2G1
    public void selezionatoTrue_f2g1(int i) {
        selezionatiF2G1[i] = true;
    }

    //Metodo per i selezionati F2G2
    public void selezionatoTrue_f2g2(int i) {
        selezionatiF2G2[i] = true;
    }

    //Metodo per controllare se è stato selezionato qualcosa F1G1
    @Override
    public boolean selezionato_f1g1(int i) {
        return selezionatiF2G2[i];
    }

    //Metodo per controllare se è stato selezionato qualcosa F1G2
    @Override
    public boolean selezionato_f1g2(int i) {
        return selezionatiF2G1[i];
    }

    @Override
    public void toastColpito_f1g1() {
        Snackbar.make(findViewById(R.id.container), "You hit a ship!", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void toastColpito_f1g2() {
        Snackbar.make(findViewById(R.id.container), "You hit a ship!", Snackbar.LENGTH_SHORT).show();

    }

    @Override
    public void toastNonColpito_f1g1() {
        Snackbar.make(findViewById(R.id.container), "You didn't hit anything!", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public String passName_f1g1() {
        return nomePlayer1;
    }

    @Override
    public void toastNonColpito_f1g2() {
        Snackbar.make(findViewById(R.id.container), "You didn't hit anything!", Snackbar.LENGTH_SHORT).show();
    }

    //I metodi overrati dai fragment
    @Override
    public void setTextAct_f1g1() {
        tv_nomeGiocatore.setText("This is your turn " + nomePlayer2 + "!");
    }

    @Override
    public void setTextAct_f1g2() {
        tv_nomeGiocatore.setText("This is your turn " + nomePlayer1 + "!");
    }

    @Override
    public void setTextAct_f2g1() {
        tv_nomeGiocatore.setText(nomePlayer2 + " place your ships!");
    }

    @Override
    public void setTextAct_f2g2() {
        tv_nomeGiocatore.setText("This is your turn " + nomePlayer1 + "!");
    }

    @Override
    public void toastLimiteBarche_f2g1() {
        Snackbar.make(findViewById(R.id.container), "You must select 12 ships only!", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void toastLimiteBarche_f2g2() {
        Snackbar.make(findViewById(R.id.container), "You must select 12 ships only!", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void cambiaFrag_f1g1(boolean frag) {

                    FragIntermedio fi = new FragIntermedio();
                    manager = getSupportFragmentManager();
                    final FragmentTransaction transaction = manager.beginTransaction();
                    //Replace perchè alrimenti si sovrappone
                    transaction.replace(R.id.container, fi);
                    transaction.commit();
                    this.frag = frag;
    }

    @Override
    public void cambiaFrag_f1g2(boolean frag) {
        FragIntermedio fi = new FragIntermedio();
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fi);
        transaction.commit();
        this.frag= frag;
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
    public void vediBarche_f1g2() {
        //Per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g2);
        transaction.commit();
    }

    @Override
    public void indietro_f2g1() {
        //Per andare in F1G1
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g1);
        transaction.commit();
    }

    @Override
    public void indietro_f2g2() {
        //Per andare in F1G2
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g2);
        transaction.commit();
    }

    @Override
    public void avanti_f2g1() {
        //Per andare in F2G2
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2g2);
        transaction.commit();
    }

    @Override
    public void avanti_f2g2() {
        //Per andare in F1G1
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        //Replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1g1);
        transaction.commit();
    }

    @Override
    public void startNewActivity() {
        Intent intent = new Intent(Main2Activity.this, VittoriaActivity.class);
        if(dialog){
            intent.putExtra("player", nomePlayer1);
        }else{
            intent.putExtra("player", nomePlayer2);
        }
        startActivity(intent);
    }

    //Dialog fragment vittoria
    @Override
    public void createDialog_f1g1() {
         dialog1 = new DialogFragmentVittoria("HAI VINTO!!!!", "iniziare una nuova partita?");
        dialog1.show(getFragmentManager(), "dialog1");
        dialog = true;
    }

    /*
    @Override
    public void createDialog_f1g2() {
       dialog2 = new DialogFragmentVittoria("HAI VINTO!!!!", "iniziare una nuova partita?");
        dialog2.show(getFragmentManager(), "dialog2");
        dialog = false;
    }
    */

    @Override
    public String passName_f1g2() {
        return nomePlayer2;
    }

    @Override
    public void passaTurno(boolean frag) {
        if(frag){
            //Per il fragment
            manager = getSupportFragmentManager();
            final FragmentTransaction transaction = manager.beginTransaction();
            //Replace perchè alrimenti si sovrappone
            transaction.replace(R.id.container, fragment1g2);
            transaction.commit();
        }else{
            //Per il fragment
            manager = getSupportFragmentManager();
            final FragmentTransaction transaction = manager.beginTransaction();
            //Replace perchè alrimenti si sovrappone
            transaction.replace(R.id.container, fragment1g1);
            transaction.commit();
        }
    }

    @Override
    public boolean cheFrag() {
        return frag;
    }
}
