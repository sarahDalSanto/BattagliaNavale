package com.example.dalsa.battaglianavale.Helpers;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dalsa.battaglianavale.R;

public class FragmentCambioTurno extends Fragment {

    interfaceFrag iListener_fi;
    Button btn_intermedio;
    boolean sceltaFrag;

    //Per salvare il fragment
    View view;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof FragmentCambioTurno.interfaceFrag) {
            iListener_fi = (FragmentCambioTurno.interfaceFrag) activity;
        } else {
            iListener_fi = null;
        }
    }

    //Interfaccia
    public interface interfaceFrag {
        public void passaTurno(boolean frag);

        public boolean fragmentG1orG2();
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //Per salvare il fragment
        if (view != null) {
            if ((ViewGroup) view.getParent() != null)
                ((ViewGroup) view.getParent()).removeView(view);
            return view;
        }
        view = inflater.inflate(R.layout.frag_intermedio, container, false);

        sceltaFrag = true;

        btn_intermedio = view.findViewById(R.id.btn_intermedio);
        btn_intermedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sceltaFrag = iListener_fi.fragmentG1orG2();
                iListener_fi.passaTurno(sceltaFrag);
            }
        });

        return view;
    }
}
