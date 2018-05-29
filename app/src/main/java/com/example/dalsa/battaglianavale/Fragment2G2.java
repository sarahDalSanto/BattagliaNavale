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

    interfaceFragment2 iListener_f2g2;

    Button f2g2_A1, f2g2_A2, f2g2_A3, f2g2_A4, f2g2_A5, f2g2_A6, f2g2_A7;
    Button f2g2_B1, f2g2_B2, f2g2_B3, f2g2_B4, f2g2_B5, f2g2_B6, f2g2_B7;
    Button f2g2_C1, f2g2_C2, f2g2_C3, f2g2_C4, f2g2_C5, f2g2_C6, f2g2_C7;
    Button f2g2_D1, f2g2_D2, f2g2_D3, f2g2_D4, f2g2_D5, f2g2_D6, f2g2_D7;
    Button f2g2_E1, f2g2_E2, f2g2_E3, f2g2_E4, f2g2_E5, f2g2_E6, f2g2_E7;
    Button f2g2_F1, f2g2_F2, f2g2_F3, f2g2_F4, f2g2_F5, f2g2_F6, f2g2_F7;
    Button f2g2_G1, f2g2_G2, f2g2_G3, f2g2_G4, f2g2_G5, f2g2_G6, f2g2_G7;

    //Per salvare il fragment
    View view;

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

        //Per salvare il fragment
        if (view != null) {
            if ((ViewGroup) view.getParent() != null)
                ((ViewGroup) view.getParent()).removeView(view);
            return view;
        }
        view = inflater.inflate(R.layout.fragment2g2, container, false);

        //Creo tutti i bottoni F2G2
        f2g2_A1 = view.findViewById(R.id.f2g2_A1);
        f2g2_A2 = view.findViewById(R.id.f2g2_A2);
        f2g2_A3 = view.findViewById(R.id.f2g2_A3);
        f2g2_A4 = view.findViewById(R.id.f2g2_A4);
        f2g2_A5 = view.findViewById(R.id.f2g2_A5);
        f2g2_A6 = view.findViewById(R.id.f2g2_A6);
        f2g2_A7 = view.findViewById(R.id.f2g2_A7);

        f2g2_B1 = view.findViewById(R.id.f2g2_B1);
        f2g2_B2 = view.findViewById(R.id.f2g2_B2);
        f2g2_B3 = view.findViewById(R.id.f2g2_B3);
        f2g2_B4 = view.findViewById(R.id.f2g2_B4);
        f2g2_B5 = view.findViewById(R.id.f2g2_B5);
        f2g2_B6 = view.findViewById(R.id.f2g2_B6);
        f2g2_B7 = view.findViewById(R.id.f2g2_B7);

        f2g2_C1 = view.findViewById(R.id.f2g2_C1);
        f2g2_C2 = view.findViewById(R.id.f2g2_C2);
        f2g2_C3 = view.findViewById(R.id.f2g2_C3);
        f2g2_C4 = view.findViewById(R.id.f2g2_C4);
        f2g2_C5 = view.findViewById(R.id.f2g2_C5);
        f2g2_C6 = view.findViewById(R.id.f2g2_C6);
        f2g2_C7 = view.findViewById(R.id.f2g2_C7);

        f2g2_D1 = view.findViewById(R.id.f2g2_D1);
        f2g2_D2 = view.findViewById(R.id.f2g2_D2);
        f2g2_D3 = view.findViewById(R.id.f2g2_D3);
        f2g2_D4 = view.findViewById(R.id.f2g2_D4);
        f2g2_D5 = view.findViewById(R.id.f2g2_D5);
        f2g2_D6 = view.findViewById(R.id.f2g2_D6);
        f2g2_D7 = view.findViewById(R.id.f2g2_D7);

        f2g2_E1 = view.findViewById(R.id.f2g2_E1);
        f2g2_E2 = view.findViewById(R.id.f2g2_E2);
        f2g2_E3 = view.findViewById(R.id.f2g2_E3);
        f2g2_E4 = view.findViewById(R.id.f2g2_E4);
        f2g2_E5 = view.findViewById(R.id.f2g2_E5);
        f2g2_E6 = view.findViewById(R.id.f2g2_E6);
        f2g2_E7 = view.findViewById(R.id.f2g2_E7);

        f2g2_F1 = view.findViewById(R.id.f2g2_F1);
        f2g2_F2 = view.findViewById(R.id.f2g2_F2);
        f2g2_F3 = view.findViewById(R.id.f2g2_F3);
        f2g2_F4 = view.findViewById(R.id.f2g2_F4);
        f2g2_F5 = view.findViewById(R.id.f2g2_F5);
        f2g2_F6 = view.findViewById(R.id.f2g2_F6);
        f2g2_F7 = view.findViewById(R.id.f2g2_F7);

        f2g2_G1 = view.findViewById(R.id.f2g2_G1);
        f2g2_G2 = view.findViewById(R.id.f2g2_G2);
        f2g2_G3 = view.findViewById(R.id.f2g2_G3);
        f2g2_G4 = view.findViewById(R.id.f2g2_G4);
        f2g2_G5 = view.findViewById(R.id.f2g2_G5);
        f2g2_G6 = view.findViewById(R.id.f2g2_G6);
        f2g2_G7 = view.findViewById(R.id.f2g2_G7);

        final Button btn_indietro_f2g2 = view.findViewById(R.id.btn_indietro_f2g2);
        final Button btn_avanti_f2g2 = view.findViewById(R.id.btn_avanti_f2g2);
        btn_indietro_f2g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.indietro_f2g2();

            }
        });

        btn_avanti_f2g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.avanti_f2g2();
                iListener_f2g2.setTextAct_f2g2();

                btn_indietro_f2g2.setVisibility(View.VISIBLE);
                btn_avanti_f2g2.setVisibility(View.INVISIBLE);

            }
        });

        //Uso i bottoni F2G2
        f2g2_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(0);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A1.setText("");
            }
        });

        f2g2_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(1);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A2.setText("");
            }
        });

        f2g2_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(2);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A3.setText("");
            }
        });

        f2g2_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(3);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A4.setText("");
            }
        });

        f2g2_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(4);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A5.setText("");
            }
        });

        f2g2_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(5);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A6.setText("");
            }
        });

        f2g2_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(6);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_A7.setText("");
            }
        });

        f2g2_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(7);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B1.setText("");
            }
        });

        f2g2_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(8);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B2.setText("");
            }
        });

        f2g2_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(9);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B3.setText("");
            }
        });

        f2g2_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(10);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B4.setText("");
            }
        });

        f2g2_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(11);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B5.setText("");
            }
        });

        f2g2_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(12);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B6.setText("");
            }
        });

        f2g2_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(13);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_B7.setText("");
            }
        });

        f2g2_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(14);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C1.setText("");
            }
        });

        f2g2_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(15);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C2.setText("");
            }
        });

        f2g2_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(16);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C3.setText("");
            }
        });

        f2g2_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(17);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C4.setText("");
            }
        });

        f2g2_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(18);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C5.setText("");
            }
        });

        f2g2_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(19);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C6.setText("");
            }
        });

        f2g2_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(20);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_C7.setText("");
            }
        });

        f2g2_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(21);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D1.setText("");
            }
        });

        f2g2_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(22);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D2.setText("");
            }
        });

        f2g2_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(23);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D3.setText("");
            }
        });

        f2g2_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(24);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D4.setText("");
            }
        });

        f2g2_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(25);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D5.setText("");
            }
        });

        f2g2_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(26);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D6.setText("");
            }
        });

        f2g2_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(27);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_D7.setText("");
            }
        });

        f2g2_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(28);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E1.setText("");
            }
        });

        f2g2_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(29);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E2.setText("");
            }
        });

        f2g2_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(30);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E3.setText("");
            }
        });

        f2g2_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(31);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E4.setText("");
            }
        });

        f2g2_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(32);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E5.setText("");
            }
        });

        f2g2_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(33);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E6.setText("");
            }
        });

        f2g2_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(34);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_E7.setText("");
            }
        });

        f2g2_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(35);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F1.setText("");
            }
        });

        f2g2_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(36);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F2.setText("");
            }
        });

        f2g2_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(37);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F3.setText("");
            }
        });

        f2g2_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(38);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F4.setText("");
            }
        });

        f2g2_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(39);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F5.setText("");
            }
        });

        f2g2_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(40);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F6.setText("");
            }
        });

        f2g2_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(41);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_F7.setText("");
            }
        });

        f2g2_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(42);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G1.setText("");
            }
        });

        f2g2_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(43);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G2.setText("");
            }
        });

        f2g2_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(44);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G3.setText("");
            }
        });

        f2g2_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(45);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G4.setText("");
            }
        });

        f2g2_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(46);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G5.setText("");
            }
        });

        f2g2_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(47);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G6.setText("");
            }
        });

        f2g2_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g2.selezionatoTrue_f2g2(48);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g2);
                f2g2_G7.setText("");
            }
        });

        return view;
    }
}
