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

public class Fragment1G1 extends Fragment {

    interfaceFragment iListener;

    //metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof interfaceFragment){
            iListener = (interfaceFragment) activity;
        }else{
            iListener = null;
        }
    }


    //INTERFACCIA
    public interface interfaceFragment{

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1g1, null);

        Button btn_cambiaTurno = view.findViewById(R.id.btn_cambiaTurno);


        TextView tv_nomeGiocatore = view.findViewById(R.id.tv_nomeGiocatore);


        btn_cambiaTurno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //iListener.setTextAct("Premuto fragment");
            }
        });





        return view;
    }





}
