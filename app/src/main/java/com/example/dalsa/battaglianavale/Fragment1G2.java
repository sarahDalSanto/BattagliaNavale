package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1G2 extends Fragment {

   interfaceFragment2 iListener2;

    //metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof Fragment1G2.interfaceFragment2){
            iListener2 = (Fragment1G2.interfaceFragment2) activity;
        }else{
            iListener2 = null;
        }
    }


    //INTERFACCIA
    public interface interfaceFragment2{

        public void setTextAct2();
        public void cambiaFrag2();
        public void vediBarche2();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1g2, null);

        Button btn_cambiaTurno2 = view.findViewById(R.id.btn_cambiaTurno2);

        btn_cambiaTurno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iListener2.setTextAct2();
                iListener2.cambiaFrag2();


            }
        });



        Button btn_vediBarche2 = view.findViewById(R.id.btn_vediBarche2);
        btn_vediBarche2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener2.vediBarche2();
            }
        });


            return view;
            }



    }
