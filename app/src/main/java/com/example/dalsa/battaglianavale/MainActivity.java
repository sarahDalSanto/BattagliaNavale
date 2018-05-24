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


    Button btn;
    EditText et_g1, et_g2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_g1 = findViewById(R.id.et_giocatore1);
        et_g2 = findViewById(R.id.et_giocatore2);
        btn = findViewById(R.id.btn);

        String nome1 = et_g1.getText()+"";
        String nome2 = et_g2.getText()+"";



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("numero1", et_g1.getText().toString());
                intent.putExtra("numero2", et_g2.getText().toString());
                startActivity(intent);
            }
        });


    }
}
