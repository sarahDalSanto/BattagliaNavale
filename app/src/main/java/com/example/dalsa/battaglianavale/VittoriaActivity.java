package com.example.dalsa.battaglianavale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VittoriaActivity extends AppCompatActivity {

    Button btn_vittoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vittoria);

        btn_vittoria = findViewById(R.id.btn_vittoria);
        btn_vittoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VittoriaActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
