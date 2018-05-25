package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2G2 extends Fragment {

    interfaceFragment2 iListener4;

    //metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof Fragment2G2.interfaceFragment2){
            iListener4 = (Fragment2G2.interfaceFragment2) activity;
        }else{
            iListener4 = null;
        }
    }


    //INTERFACCIA
    public interface interfaceFragment2{
        public void indietro2();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2g2, null);

       Button btn_indietro2 = view.findViewById(R.id.btn_indietro2);
       btn_indietro2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               iListener4.indietro2();
           }
       });


        return view;
    }



}
