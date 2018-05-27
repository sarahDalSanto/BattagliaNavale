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

    interfaceFragment iListener_f2g1;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof Fragment2G1.interfaceFragment) {
            iListener_f2g1 = (Fragment2G1.interfaceFragment) activity;
        } else {
            iListener_f2g1 = null;
        }
    }

    //Interfaccia
    public interface interfaceFragment {
        public void indietro_f2g1();

        public void selezionatoTrue_f2g1(int i);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2g1, null);

        Button btn_indietro_f2g1 = view.findViewById(R.id.btn_indietro_f2g1);
        btn_indietro_f2g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.indietro_f2g1();
            }
        });

        //Creo i bottoni F2G1
        Button f2g1_A1 = view.findViewById(R.id.f2g1_A1);
        Button f2g1_A2 = view.findViewById(R.id.f2g1_A2);
        Button f2g1_A3 = view.findViewById(R.id.f2g1_A3);
        Button f2g1_A4 = view.findViewById(R.id.f2g1_A4);
        Button f2g1_A5 = view.findViewById(R.id.f2g1_A5);
        Button f2g1_A6 = view.findViewById(R.id.f2g1_A6);
        Button f2g1_A7 = view.findViewById(R.id.f2g1_A7);

        Button f2g1_B1 = view.findViewById(R.id.f2g1_B1);
        Button f2g1_B2 = view.findViewById(R.id.f2g1_B2);
        Button f2g1_B3 = view.findViewById(R.id.f2g1_B3);
        Button f2g1_B4 = view.findViewById(R.id.f2g1_B4);
        Button f2g1_B5 = view.findViewById(R.id.f2g1_B5);
        Button f2g1_B6 = view.findViewById(R.id.f2g1_B6);
        Button f2g1_B7 = view.findViewById(R.id.f2g1_B7);

        Button f2g1_C1 = view.findViewById(R.id.f2g1_C1);
        Button f2g1_C2 = view.findViewById(R.id.f2g1_C2);
        Button f2g1_C3 = view.findViewById(R.id.f2g1_C3);
        Button f2g1_C4 = view.findViewById(R.id.f2g1_C4);
        Button f2g1_C5 = view.findViewById(R.id.f2g1_C5);
        Button f2g1_C6 = view.findViewById(R.id.f2g1_C6);
        Button f2g1_C7 = view.findViewById(R.id.f2g1_C7);

        Button f2g1_D1 = view.findViewById(R.id.f2g1_D1);
        Button f2g1_D2 = view.findViewById(R.id.f2g1_D2);
        Button f2g1_D3 = view.findViewById(R.id.f2g1_D3);
        Button f2g1_D4 = view.findViewById(R.id.f2g1_D4);
        Button f2g1_D5 = view.findViewById(R.id.f2g1_D5);
        Button f2g1_D6 = view.findViewById(R.id.f2g1_D6);
        Button f2g1_D7 = view.findViewById(R.id.f2g1_D7);

        Button f2g1_E1 = view.findViewById(R.id.f2g1_E1);
        Button f2g1_E2 = view.findViewById(R.id.f2g1_E2);
        Button f2g1_E3 = view.findViewById(R.id.f2g1_E3);
        Button f2g1_E4 = view.findViewById(R.id.f2g1_E4);
        Button f2g1_E5 = view.findViewById(R.id.f2g1_E5);
        Button f2g1_E6 = view.findViewById(R.id.f2g1_E6);
        Button f2g1_E7 = view.findViewById(R.id.f2g1_E7);

        Button f2g1_F1 = view.findViewById(R.id.f2g1_F1);
        Button f2g1_F2 = view.findViewById(R.id.f2g1_F2);
        Button f2g1_F3 = view.findViewById(R.id.f2g1_F3);
        Button f2g1_F4 = view.findViewById(R.id.f2g1_F4);
        Button f2g1_F5 = view.findViewById(R.id.f2g1_F5);
        Button f2g1_F6 = view.findViewById(R.id.f2g1_F6);
        Button f2g1_F7 = view.findViewById(R.id.f2g1_F7);

        Button f2g1_G1 = view.findViewById(R.id.f2g1_G1);
        Button f2g1_G2 = view.findViewById(R.id.f2g1_G2);
        Button f2g1_G3 = view.findViewById(R.id.f2g1_G3);
        Button f2g1_G4 = view.findViewById(R.id.f2g1_G4);
        Button f2g1_G5 = view.findViewById(R.id.f2g1_G5);
        Button f2g1_G6 = view.findViewById(R.id.f2g1_G6);
        Button f2g1_G7 = view.findViewById(R.id.f2g1_G7);

        //Uso i bottoni F2G1
        f2g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(0);
                //v.setBackgroundColor(getResources().getColor(R.color.colorColpito));
            }
        });

        f2g1_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(1);
            }
        });

        f2g1_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(2);
            }
        });

        f2g1_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(3);
            }
        });

        f2g1_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(4);
            }
        });

        f2g1_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(5);
            }
        });

        f2g1_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(6);
            }
        });

        f2g1_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(7);
            }
        });

        f2g1_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(8);
            }
        });

        f2g1_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(9);
            }
        });

        f2g1_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(10);
            }
        });

        f2g1_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(11);
            }
        });

        f2g1_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(12);
            }
        });

        f2g1_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(13);
            }
        });

        f2g1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(14);
            }
        });

        f2g1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(15);
            }
        });

        f2g1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(16);
            }
        });

        f2g1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(17);
            }
        });

        f2g1_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(18);
            }
        });

        f2g1_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(19);
            }
        });

        f2g1_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(20);
            }
        });

        f2g1_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(21);
            }
        });

        f2g1_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(22);
            }
        });

        f2g1_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(23);
            }
        });

        f2g1_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(24);
            }
        });

        f2g1_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(25);
            }
        });

        f2g1_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(26);
            }
        });

        f2g1_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(27);
            }
        });

        f2g1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(28);
            }
        });

        f2g1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(29);
            }
        });

        f2g1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(30);
            }
        });

        f2g1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(31);
            }
        });

        f2g1_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(32);
            }
        });

        f2g1_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(33);
            }
        });

        f2g1_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(34);
            }
        });

        f2g1_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(35);
            }
        });

        f2g1_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(36);
            }
        });

        f2g1_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(37);
            }
        });

        f2g1_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(38);
            }
        });

        f2g1_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(39);
            }
        });

        f2g1_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(40);
            }
        });

        f2g1_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(41);
            }
        });

        f2g1_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(42);
            }
        });

        f2g1_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(43);
            }
        });

        f2g1_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(44);
            }
        });

        f2g1_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(45);
            }
        });

        f2g1_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(46);
            }
        });

        f2g1_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(47);
            }
        });

        f2g1_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(48);
            }
        });

        return view;
    }
}
