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

    int contaBarche_f2g1 = 0;

    boolean doppioClickA1=true, doppioClickA2= true, doppioClickA3, doppioClickA4, doppioClickA5, doppioClickA6, doppioClickA7;
    boolean doppioClickB1, doppioClickB2, doppioClickB3, doppioClickB4, doppioClickB5, doppioClickB6, doppioClickB7;
    boolean doppioClickC1, doppioClickC2, doppioClickC3, doppioClickC4, doppioClickC5, doppioClickC6, doppioClickC7;
    boolean doppioClickD1, doppioClickD2, doppioClickD3, doppioClickD4, doppioClickD5, doppioClickD6, doppioClickD7;
    boolean doppioClickE1, doppioClickE2, doppioClickE3, doppioClickE4, doppioClickE5, doppioClickE6, doppioClickE7;
    boolean doppioClickF1, doppioClickF2, doppioClickF3, doppioClickF4, doppioClickF5, doppioClickF6, doppioClickF7;
    boolean doppioClickG1, doppioClickG2, doppioClickG3, doppioClickG4, doppioClickG5, doppioClickG6, doppioClickG7;


    interfaceFragment iListener_f2g1;

    Button f2g1_A1, f2g1_A2, f2g1_A3, f2g1_A4, f2g1_A5, f2g1_A6, f2g1_A7;
    Button f2g1_B1, f2g1_B2, f2g1_B3, f2g1_B4, f2g1_B5, f2g1_B6, f2g1_B7;
    Button f2g1_C1, f2g1_C2, f2g1_C3, f2g1_C4, f2g1_C5, f2g1_C6, f2g1_C7;
    Button f2g1_D1, f2g1_D2, f2g1_D3, f2g1_D4, f2g1_D5, f2g1_D6, f2g1_D7;
    Button f2g1_E1, f2g1_E2, f2g1_E3, f2g1_E4, f2g1_E5, f2g1_E6, f2g1_E7;
    Button f2g1_F1, f2g1_F2, f2g1_F3, f2g1_F4, f2g1_F5, f2g1_F6, f2g1_F7;
    Button f2g1_G1, f2g1_G2, f2g1_G3, f2g1_G4, f2g1_G5, f2g1_G6, f2g1_G7;

    //Per salvare il fragment
    View view;

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

        public void avanti_f2g1();

        public void setTextAct_f2g1();

        public void toastLimiteBarche_f2g1();

        public  void selezionatoFalse(int i);
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
        view = inflater.inflate(R.layout.fragment2g1, container, false);



        //Creo i bottoni F2G1
        f2g1_A1 = view.findViewById(R.id.f2g1_A1);
        f2g1_A2 = view.findViewById(R.id.f2g1_A2);
        f2g1_A3 = view.findViewById(R.id.f2g1_A3);
        f2g1_A4 = view.findViewById(R.id.f2g1_A4);
        f2g1_A5 = view.findViewById(R.id.f2g1_A5);
        f2g1_A6 = view.findViewById(R.id.f2g1_A6);
        f2g1_A7 = view.findViewById(R.id.f2g1_A7);

        f2g1_B1 = view.findViewById(R.id.f2g1_B1);
        f2g1_B2 = view.findViewById(R.id.f2g1_B2);
        f2g1_B3 = view.findViewById(R.id.f2g1_B3);
        f2g1_B4 = view.findViewById(R.id.f2g1_B4);
        f2g1_B5 = view.findViewById(R.id.f2g1_B5);
        f2g1_B6 = view.findViewById(R.id.f2g1_B6);
        f2g1_B7 = view.findViewById(R.id.f2g1_B7);

        f2g1_C1 = view.findViewById(R.id.f2g1_C1);
        f2g1_C2 = view.findViewById(R.id.f2g1_C2);
        f2g1_C3 = view.findViewById(R.id.f2g1_C3);
        f2g1_C4 = view.findViewById(R.id.f2g1_C4);
        f2g1_C5 = view.findViewById(R.id.f2g1_C5);
        f2g1_C6 = view.findViewById(R.id.f2g1_C6);
        f2g1_C7 = view.findViewById(R.id.f2g1_C7);

        f2g1_D1 = view.findViewById(R.id.f2g1_D1);
        f2g1_D2 = view.findViewById(R.id.f2g1_D2);
        f2g1_D3 = view.findViewById(R.id.f2g1_D3);
        f2g1_D4 = view.findViewById(R.id.f2g1_D4);
        f2g1_D5 = view.findViewById(R.id.f2g1_D5);
        f2g1_D6 = view.findViewById(R.id.f2g1_D6);
        f2g1_D7 = view.findViewById(R.id.f2g1_D7);

        f2g1_E1 = view.findViewById(R.id.f2g1_E1);
        f2g1_E2 = view.findViewById(R.id.f2g1_E2);
        f2g1_E3 = view.findViewById(R.id.f2g1_E3);
        f2g1_E4 = view.findViewById(R.id.f2g1_E4);
        f2g1_E5 = view.findViewById(R.id.f2g1_E5);
        f2g1_E6 = view.findViewById(R.id.f2g1_E6);
        f2g1_E7 = view.findViewById(R.id.f2g1_E7);

        f2g1_F1 = view.findViewById(R.id.f2g1_F1);
        f2g1_F2 = view.findViewById(R.id.f2g1_F2);
        f2g1_F3 = view.findViewById(R.id.f2g1_F3);
        f2g1_F4 = view.findViewById(R.id.f2g1_F4);
        f2g1_F5 = view.findViewById(R.id.f2g1_F5);
        f2g1_F6 = view.findViewById(R.id.f2g1_F6);
        f2g1_F7 = view.findViewById(R.id.f2g1_F7);

        f2g1_G1 = view.findViewById(R.id.f2g1_G1);
        f2g1_G2 = view.findViewById(R.id.f2g1_G2);
        f2g1_G3 = view.findViewById(R.id.f2g1_G3);
        f2g1_G4 = view.findViewById(R.id.f2g1_G4);
        f2g1_G5 = view.findViewById(R.id.f2g1_G5);
        f2g1_G6 = view.findViewById(R.id.f2g1_G6);
        f2g1_G7 = view.findViewById(R.id.f2g1_G7);

        final Button btn_avanti_f2g1 = view.findViewById(R.id.btn_avanti_f2g1);
        final Button btn_indietro_f2g1 = view.findViewById(R.id.btn_indietro_f2g1);
        btn_indietro_f2g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.indietro_f2g1();

            }
        });

        btn_avanti_f2g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contaBarche_f2g1 == 12) {
                    iListener_f2g1.avanti_f2g1();
                    iListener_f2g1.setTextAct_f2g1();

                    f2g1_A1.setEnabled(false);
                    f2g1_A2.setEnabled(false);
                    f2g1_A3.setEnabled(false);
                    f2g1_A4.setEnabled(false);
                    f2g1_A5.setEnabled(false);
                    f2g1_A6.setEnabled(false);
                    f2g1_A7.setEnabled(false);
                    f2g1_B1.setEnabled(false);
                    f2g1_B2.setEnabled(false);
                    f2g1_B3.setEnabled(false);
                    f2g1_B4.setEnabled(false);
                    f2g1_B5.setEnabled(false);
                    f2g1_B6.setEnabled(false);
                    f2g1_B7.setEnabled(false);
                    f2g1_C1.setEnabled(false);
                    f2g1_C2.setEnabled(false);
                    f2g1_C3.setEnabled(false);
                    f2g1_C4.setEnabled(false);
                    f2g1_C5.setEnabled(false);
                    f2g1_C6.setEnabled(false);
                    f2g1_C7.setEnabled(false);
                    f2g1_D1.setEnabled(false);
                    f2g1_D2.setEnabled(false);
                    f2g1_D3.setEnabled(false);
                    f2g1_D4.setEnabled(false);
                    f2g1_D5.setEnabled(false);
                    f2g1_D6.setEnabled(false);
                    f2g1_D7.setEnabled(false);
                    f2g1_E1.setEnabled(false);
                    f2g1_E2.setEnabled(false);
                    f2g1_E3.setEnabled(false);
                    f2g1_E4.setEnabled(false);
                    f2g1_E5.setEnabled(false);
                    f2g1_E6.setEnabled(false);
                    f2g1_E7.setEnabled(false);
                    f2g1_F1.setEnabled(false);
                    f2g1_F2.setEnabled(false);
                    f2g1_F3.setEnabled(false);
                    f2g1_F4.setEnabled(false);
                    f2g1_F5.setEnabled(false);
                    f2g1_F6.setEnabled(false);
                    f2g1_F7.setEnabled(false);
                    f2g1_G1.setEnabled(false);
                    f2g1_G2.setEnabled(false);
                    f2g1_G3.setEnabled(false);
                    f2g1_G4.setEnabled(false);
                    f2g1_G5.setEnabled(false);
                    f2g1_G6.setEnabled(false);
                    f2g1_G7.setEnabled(false);

                    btn_indietro_f2g1.setVisibility(View.VISIBLE);
                    btn_avanti_f2g1.setVisibility(View.INVISIBLE);
                } else {
                    iListener_f2g1.toastLimiteBarche_f2g1();
                }
            }
        });

        //Uso i bottoni F2G1
        f2g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doppioClickA1) {
                    //Metodo per controllare se f2g1_A1 è selezionato o no
                    iListener_f2g1.selezionatoTrue_f2g1(0);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA1 = false;
                }else{
                    iListener_f2g1.selezionatoFalse(0);
                    v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    contaBarche_f2g1--;
                    doppioClickA1 = true;
                }

                bloccaButtons_f2g1();
            }
        });

        f2g1_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doppioClickA2) {
                    iListener_f2g1.selezionatoTrue_f2g1(1);
                    v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                    contaBarche_f2g1++;
                    doppioClickA2= false;
                    bloccaButtons_f2g1();
                }else{
                    iListener_f2g1.selezionatoFalse(1);
                    v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    contaBarche_f2g1--;
                    doppioClickA2 = true;
                }
            }
        });

        f2g1_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(2);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_A3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(3);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_A4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(4);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_A5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(5);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_A6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(6);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_A7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(7);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B1.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(8);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B2.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(9);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(10);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(11);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(12);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(13);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_B7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(14);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C1.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(15);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C2.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(16);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(17);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(18);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(19);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(20);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_C7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(21);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D1.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(22);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D2.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(23);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(24);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(25);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(26);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(27);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_D7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(28);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E1.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(29);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E2.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(30);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(31);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(32);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(33);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(34);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_E7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(35);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F1.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(36);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F2.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(37);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(38);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(39);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(40);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(41);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_F7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(42);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G1.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(43);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G2.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(44);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G3.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(45);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G4.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(46);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G5.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(47);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G6.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        f2g1_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f2g1.selezionatoTrue_f2g1(48);
                v.setBackgroundResource(R.drawable.ship_select_and_found_g1);
                contaBarche_f2g1++;
                f2g1_G7.setEnabled(false);
                bloccaButtons_f2g1();
            }
        });

        return view;
    }

    public void bloccaButtons_f2g1() {
        if (contaBarche_f2g1 == 12) {
            f2g1_A1.setEnabled(false);
            f2g1_A2.setEnabled(false);
            f2g1_A3.setEnabled(false);
            f2g1_A4.setEnabled(false);
            f2g1_A5.setEnabled(false);
            f2g1_A6.setEnabled(false);
            f2g1_A7.setEnabled(false);
            f2g1_B1.setEnabled(false);
            f2g1_B2.setEnabled(false);
            f2g1_B3.setEnabled(false);
            f2g1_B4.setEnabled(false);
            f2g1_B5.setEnabled(false);
            f2g1_B6.setEnabled(false);
            f2g1_B7.setEnabled(false);
            f2g1_C1.setEnabled(false);
            f2g1_C2.setEnabled(false);
            f2g1_C3.setEnabled(false);
            f2g1_C4.setEnabled(false);
            f2g1_C5.setEnabled(false);
            f2g1_C6.setEnabled(false);
            f2g1_C7.setEnabled(false);
            f2g1_D1.setEnabled(false);
            f2g1_D2.setEnabled(false);
            f2g1_D3.setEnabled(false);
            f2g1_D4.setEnabled(false);
            f2g1_D5.setEnabled(false);
            f2g1_D6.setEnabled(false);
            f2g1_D7.setEnabled(false);
            f2g1_E1.setEnabled(false);
            f2g1_E2.setEnabled(false);
            f2g1_E3.setEnabled(false);
            f2g1_E4.setEnabled(false);
            f2g1_E5.setEnabled(false);
            f2g1_E6.setEnabled(false);
            f2g1_E7.setEnabled(false);
            f2g1_F1.setEnabled(false);
            f2g1_F2.setEnabled(false);
            f2g1_F3.setEnabled(false);
            f2g1_F4.setEnabled(false);
            f2g1_F5.setEnabled(false);
            f2g1_F6.setEnabled(false);
            f2g1_F7.setEnabled(false);
            f2g1_G1.setEnabled(false);
            f2g1_G2.setEnabled(false);
            f2g1_G3.setEnabled(false);
            f2g1_G4.setEnabled(false);
            f2g1_G5.setEnabled(false);
            f2g1_G6.setEnabled(false);
            f2g1_G7.setEnabled(false);
            iListener_f2g1.toastLimiteBarche_f2g1();
        }
    }
}
