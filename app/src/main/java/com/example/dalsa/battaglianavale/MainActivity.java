package com.example.dalsa.battaglianavale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_iniziaPartita, btn_comeSiGioca;
    EditText et_giocatore1, et_giocatore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_giocatore1 = findViewById(R.id.et_giocatore1);
        et_giocatore2 = findViewById(R.id.et_giocatore2);
        btn_iniziaPartita = findViewById(R.id.btn_iniziaPartita);
        btn_comeSiGioca = findViewById(R.id.btn_comeSiGioca);

        btn_iniziaPartita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("player1", et_giocatore1.getText().toString());
                intent.putExtra("player2", et_giocatore2.getText().toString());
                startActivity(intent);
            }
        });

        btn_comeSiGioca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IstruzioniActivity.class);
                startActivity(intent);
            }
        });
    }
}
