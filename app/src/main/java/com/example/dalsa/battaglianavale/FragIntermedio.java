package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragIntermedio extends Fragment {

    interfaceFrag iListener_fi;
    Button btn_intermedio;
    boolean frag;

    //Per salvare il fragment
    View view;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof FragIntermedio.interfaceFrag) {
            iListener_fi = (FragIntermedio.interfaceFrag) activity;
        } else {
            iListener_fi = null;
        }
    }

    //Interfaccia
    public interface interfaceFrag {
        public void passaTurno(boolean frag);

        public boolean cheFrag();
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

        frag = true;

        btn_intermedio = view.findViewById(R.id.btn_intermedio);
        btn_intermedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = iListener_fi.cheFrag();
                iListener_fi.passaTurno(frag);
            }
        });

        return view;
    }
}
