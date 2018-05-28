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

    //Variabile booleana per vedere se è stato selezionato il pulsante

    interfaceFragment2 iListener_f2g2;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof Fragment2G2.interfaceFragment2) {
            iListener_f2g2 = (Fragment2G2.interfaceFragment2) activity;
        } else {
            iListener_f2g2 = null;
        }
    }

    //Interfaccia
    public interface interfaceFragment2 {
        public void indietro_f2g2();

        public void selezionatoTrue_f2g2(int i);

        public void avanti_f2g2();

        public void setTextAct_f2g2();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2g2, null);

        final Button btn_indietro_f2g2 = view.findViewById(R.id.btn_indietro_f2g2);
        btn_indietro_f2g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.indietro_f2g2();
            }
        });

        final Button btn_avanti_f2g2 = view.findViewById(R.id.btn_avanti_f2g2);
        btn_avanti_f2g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.avanti_f2g2();
                btn_indietro_f2g2.setVisibility(View.VISIBLE);
                btn_avanti_f2g2.setVisibility(View.INVISIBLE);
                iListener_f2g2.setTextAct_f2g2();
            }
        });

        //Creo tutti i bottoni F2G2
        Button f2g2_A1 = view.findViewById(R.id.f2g2_A1);
        Button f2g2_A2 = view.findViewById(R.id.f2g2_A2);
        Button f2g2_A3 = view.findViewById(R.id.f2g2_A3);
        Button f2g2_A4 = view.findViewById(R.id.f2g2_A4);
        Button f2g2_A5 = view.findViewById(R.id.f2g2_A5);
        Button f2g2_A6 = view.findViewById(R.id.f2g2_A6);
        Button f2g2_A7 = view.findViewById(R.id.f2g2_A7);

        Button f2g2_B1 = view.findViewById(R.id.f2g2_B1);
        Button f2g2_B2 = view.findViewById(R.id.f2g2_B2);
        Button f2g2_B3 = view.findViewById(R.id.f2g2_B3);
        Button f2g2_B4 = view.findViewById(R.id.f2g2_B4);
        Button f2g2_B5 = view.findViewById(R.id.f2g2_B5);
        Button f2g2_B6 = view.findViewById(R.id.f2g2_B6);
        Button f2g2_B7 = view.findViewById(R.id.f2g2_B7);

        Button f2g2_C1 = view.findViewById(R.id.f2g2_C1);
        Button f2g2_C2 = view.findViewById(R.id.f2g2_C2);
        Button f2g2_C3 = view.findViewById(R.id.f2g2_C3);
        Button f2g2_C4 = view.findViewById(R.id.f2g2_C4);
        Button f2g2_C5 = view.findViewById(R.id.f2g2_C5);
        Button f2g2_C6 = view.findViewById(R.id.f2g2_C6);
        Button f2g2_C7 = view.findViewById(R.id.f2g2_C7);

        Button f2g2_D1 = view.findViewById(R.id.f2g2_D1);
        Button f2g2_D2 = view.findViewById(R.id.f2g2_D2);
        Button f2g2_D3 = view.findViewById(R.id.f2g2_D3);
        Button f2g2_D4 = view.findViewById(R.id.f2g2_D4);
        Button f2g2_D5 = view.findViewById(R.id.f2g2_D5);
        Button f2g2_D6 = view.findViewById(R.id.f2g2_D6);
        Button f2g2_D7 = view.findViewById(R.id.f2g2_D7);

        Button f2g2_E1 = view.findViewById(R.id.f2g2_E1);
        Button f2g2_E2 = view.findViewById(R.id.f2g2_E2);
        Button f2g2_E3 = view.findViewById(R.id.f2g2_E3);
        Button f2g2_E4 = view.findViewById(R.id.f2g2_E4);
        Button f2g2_E5 = view.findViewById(R.id.f2g2_E5);
        Button f2g2_E6 = view.findViewById(R.id.f2g2_E6);
        Button f2g2_E7 = view.findViewById(R.id.f2g2_E7);

        Button f2g2_F1 = view.findViewById(R.id.f2g2_F1);
        Button f2g2_F2 = view.findViewById(R.id.f2g2_F2);
        Button f2g2_F3 = view.findViewById(R.id.f2g2_F3);
        Button f2g2_F4 = view.findViewById(R.id.f2g2_F4);
        Button f2g2_F5 = view.findViewById(R.id.f2g2_F5);
        Button f2g2_F6 = view.findViewById(R.id.f2g2_F6);
        Button f2g2_F7 = view.findViewById(R.id.f2g2_F7);

        Button f2g2_G1 = view.findViewById(R.id.f2g2_G1);
        Button f2g2_G2 = view.findViewById(R.id.f2g2_G2);
        Button f2g2_G3 = view.findViewById(R.id.f2g2_G3);
        Button f2g2_G4 = view.findViewById(R.id.f2g2_G4);
        Button f2g2_G5 = view.findViewById(R.id.f2g2_G5);
        Button f2g2_G6 = view.findViewById(R.id.f2g2_G6);
        Button f2g2_G7 = view.findViewById(R.id.f2g2_G7);

        //Uso i bottoni F2G2
        f2g2_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metodo per far vedere se è stato selezionato
                iListener_f2g2.selezionatoTrue_f2g2(0);
            }
        });

        f2g2_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(1);
            }
        });

        f2g2_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(2);
            }
        });

        f2g2_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(3);
            }
        });

        f2g2_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(4);
            }
        });

        f2g2_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(5);
            }
        });

        f2g2_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(6);
            }
        });

        f2g2_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(7);
            }
        });

        f2g2_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(8);
            }
        });

        f2g2_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(9);
            }
        });

        f2g2_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(10);
            }
        });

        f2g2_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(11);
            }
        });

        f2g2_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(12);
            }
        });

        f2g2_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(13);
            }
        });

        f2g2_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(14);
            }
        });

        f2g2_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(15);
            }
        });

        f2g2_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(16);
            }
        });

        f2g2_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(17);
            }
        });

        f2g2_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(18);
            }
        });

        f2g2_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(19);
            }
        });

        f2g2_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(20);
            }
        });

        f2g2_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(21);
            }
        });

        f2g2_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(22);
            }
        });

        f2g2_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(23);
            }
        });

        f2g2_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(24);
            }
        });

        f2g2_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(25);
            }
        });

        f2g2_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(26);
            }
        });

        f2g2_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(27);
            }
        });

        f2g2_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(28);
            }
        });

        f2g2_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(29);
            }
        });

        f2g2_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(30);
            }
        });

        f2g2_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(31);
            }
        });

        f2g2_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(32);
            }
        });

        f2g2_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(33);
            }
        });

        f2g2_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(34);
            }
        });

        f2g2_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(35);
            }
        });

        f2g2_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(36);
            }
        });

        f2g2_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(37);
            }
        });

        f2g2_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(38);
            }
        });

        f2g2_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(39);
            }
        });

        f2g2_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(40);
            }
        });

        f2g2_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(41);
            }
        });

        f2g2_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(42);
            }
        });

        f2g2_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(43);
            }
        });

        f2g2_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(44);
            }
        });

        f2g2_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(45);
            }
        });

        f2g2_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(46);
            }
        });

        f2g2_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(47);
            }
        });

        f2g2_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(48);
            }
        });

        return view;
    }
}
