package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2G1 extends Fragment {

    interfaceFragment iListener3;

    //metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof Fragment2G1.interfaceFragment){
            iListener3 = (Fragment2G1.interfaceFragment) activity;
        }else{
            iListener3 = null;
        }
    }


    //INTERFACCIA
    public interface interfaceFragment{
        public void indietro();
        public void selezionatoTrue2(int i);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2g1, null);

        Button btn_indietro = view.findViewById(R.id.btn_indietro);
        btn_indietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener3.indietro();
            }
        });


        /*
        CREO I BOTTONI F2G1 (leo falli tu)
         */
        Button f2g1_A1 = view.findViewById(R.id.f2g1_A1);
        Button f2g1_A2 = view.findViewById(R.id.f2g1_A2);


        /*
        USO I BOTTONI F2G1 (leo falli tuuuuuu per l'ordine dei numeri basta che guardi F2G2)
         */
        f2g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener3.selezionatoTrue2(0);
            }
        });


        return view;
    }

}
