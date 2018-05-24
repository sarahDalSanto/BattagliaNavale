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

        return view;
    }

}
