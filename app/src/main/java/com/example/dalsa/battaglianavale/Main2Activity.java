package com.example.dalsa.battaglianavale;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragment1G1.interfaceFragment{

    String nome1, nome2;
    TextView tv_nomeGiocatore;
    android.support.v4.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            nome1 = bundle.get("numero1")+"";
            nome2 = bundle.get("numero2")+"";
            //Toast.makeText(Main2Activity.this, nome1+nome2, Toast.LENGTH_LONG).show();
        }

        tv_nomeGiocatore = findViewById(R.id.tv_nomeGiocatore);
        tv_nomeGiocatore.setText(nome1+" posiziona le barche");

        manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();

        final Fragment1G1 fragment = new Fragment1G1();
        //replace perchè alrimenti si sovrappone
        transaction.replace(R.id.container, fragment);
        transaction.commit();


    }
}
