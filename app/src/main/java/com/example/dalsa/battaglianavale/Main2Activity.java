package com.example.dalsa.battaglianavale;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragment1G1.interfaceFragment, Fragment1G2.interfaceFragment2, Fragment2G1.interfaceFragment, Fragment2G2.interfaceFragment2{

    Boolean selezionato;
    String nome1, nome2;
    TextView tv_nomeGiocatore;
    android.support.v4.app.FragmentManager manager;

    //per salvare i calcoli
    public static final String SELEZIONATO = "SELEZIONATO";
    //public static final int COLORE = (R.color.colorAccent);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        selezionato = false;

        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            nome1 = bundle.get("numero1")+"";
            nome2 = bundle.get("numero2")+"";
            //Toast.makeText(Main2Activity.this, nome1+nome2, Toast.LENGTH_LONG).show();
        }

        tv_nomeGiocatore = findViewById(R.id.tv_nomeGiocatore);
        tv_nomeGiocatore.setText("Turno di "+nome1);


        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G1 fragment1 = new Fragment1G1();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1);
        transaction.commit();



        //salva i contenuti anche se giro lo schermo o cambio activity
        if(savedInstanceState != null){
            selezionato = savedInstanceState.getBoolean(SELEZIONATO);
            //int colore = savedInstanceState.getInt(COLORE);
        }
    }

    //metodi per le barche
    public void onSelect(View view){
        selezionato = true;
        if(selezionato) {
            ((Button) view).setBackgroundColor(getResources().getColor(R.color.colorAccent));

        }
    }


    //i metodi overrati dai fragment

    @Override
    public void setTextAct() {
        tv_nomeGiocatore.setText("Turno di "+nome2);
    }

    @Override
    public void cambiaFrag() {
        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G2 fragment2 = new Fragment1G2();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2);
        transaction.commit();
    }

    @Override
    public void vediBarche() {
        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment2G1 fragment3 = new Fragment2G1();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment3);
        transaction.commit();
    }


    @Override
    public void setTextAct2() {
        tv_nomeGiocatore.setText("Turno di "+nome1);
    }

    @Override
    public void cambiaFrag2() {
        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G1 fragment1 = new Fragment1G1();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1);
        transaction.commit();
    }

    @Override
    public void vediBarche2() {
        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment2G2 fragment4 = new Fragment2G2();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment4);
        transaction.commit();
    }

    @Override
    public void indietro() {
        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G1 fragment1 = new Fragment1G1();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment1);
        transaction.commit();
    }

    @Override
    public void indietro2() {
        //per il fragment
        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G2 fragment2 = new Fragment1G2();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment2);
        transaction.commit();
    }


}
