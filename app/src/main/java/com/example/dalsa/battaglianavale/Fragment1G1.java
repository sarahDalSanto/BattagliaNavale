package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1G1 extends Fragment {

    boolean A1, A2, A3, A4, A5, A6, A7;
    boolean B1, B2, B3, B4, B5, B6, B7;
    boolean C1, C2, C3, C4, C5, C6, C7;
    boolean D1, D2, D3, D4, D5, D6, D7;
    boolean E1, E2, E3, E4, E5, E6, E7;
    boolean F1, F2, F3, F4, F5, F6, F7;
    boolean G1, G2, G3, G4, G5, G6, G7;

    interfaceFragment iListener_f1g1;

    //Per salvare il fragment
    View view;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof interfaceFragment) {
            iListener_f1g1 = (interfaceFragment) activity;
        } else {
            iListener_f1g1 = null;
        }
    }

    //Interfaccia
    public interface interfaceFragment {
        public void setTextAct_f1g1();

        public void cambiaFrag_f1g1();

        public void vediBarche_f1g1();

        public boolean selezionato_f1g1(int i);

        public void toastColpito_f1g1();

        public void toastNonColpito_f1g1();

        public View colpito(View v, int i);

        public View nonColpito(View v, int i);

        public boolean giaSelezionati_f1g1(int i);
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
        view = inflater.inflate(R.layout.fragment1g1, container, false);

        Button btn_concludiTurno_g1 = view.findViewById(R.id.btn_concludiTurno_g1);
        btn_concludiTurno_g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iListener_f1g1.setTextAct_f1g1();
                iListener_f1g1.cambiaFrag_f1g1();

            }
        });

        Button btn_vediBarche_g1 = view.findViewById(R.id.btn_vediBarche_g1);
        btn_vediBarche_g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f1g1.vediBarche_f1g1();
            }
        });

        //Creo tutti i bottoni F1G1
        Button f1g1_A1 = view.findViewById(R.id.f1g1_A1);
        final Button f1g1_A2 = view.findViewById(R.id.f1g1_A2);
        Button f1g1_A3 = view.findViewById(R.id.f1g1_A3);
        Button f1g1_A4 = view.findViewById(R.id.f1g1_A4);
        Button f1g1_A5 = view.findViewById(R.id.f1g1_A5);
        Button f1g1_A6 = view.findViewById(R.id.f1g1_A6);
        Button f1g1_A7 = view.findViewById(R.id.f1g1_A7);

        Button f1g1_B1 = view.findViewById(R.id.f1g1_B1);
        Button f1g1_B2 = view.findViewById(R.id.f1g1_B2);
        Button f1g1_B3 = view.findViewById(R.id.f1g1_B3);
        Button f1g1_B4 = view.findViewById(R.id.f1g1_B4);
        Button f1g1_B5 = view.findViewById(R.id.f1g1_B5);
        Button f1g1_B6 = view.findViewById(R.id.f1g1_B6);
        Button f1g1_B7 = view.findViewById(R.id.f1g1_B7);

        Button f1g1_C1 = view.findViewById(R.id.f1g1_C1);
        Button f1g1_C2 = view.findViewById(R.id.f1g1_C2);
        Button f1g1_C3 = view.findViewById(R.id.f1g1_C3);
        Button f1g1_C4 = view.findViewById(R.id.f1g1_C4);
        Button f1g1_C5 = view.findViewById(R.id.f1g1_C5);
        Button f1g1_C6 = view.findViewById(R.id.f1g1_C6);
        Button f1g1_C7 = view.findViewById(R.id.f1g1_C7);

        Button f1g1_D1 = view.findViewById(R.id.f1g1_D1);
        Button f1g1_D2 = view.findViewById(R.id.f1g1_D2);
        Button f1g1_D3 = view.findViewById(R.id.f1g1_D3);
        Button f1g1_D4 = view.findViewById(R.id.f1g1_D4);
        Button f1g1_D5 = view.findViewById(R.id.f1g1_D5);
        Button f1g1_D6 = view.findViewById(R.id.f1g1_D6);
        Button f1g1_D7 = view.findViewById(R.id.f1g1_D7);

        Button f1g1_E1 = view.findViewById(R.id.f1g1_E1);
        Button f1g1_E2 = view.findViewById(R.id.f1g1_E2);
        Button f1g1_E3 = view.findViewById(R.id.f1g1_E3);
        Button f1g1_E4 = view.findViewById(R.id.f1g1_E4);
        Button f1g1_E5 = view.findViewById(R.id.f1g1_E5);
        Button f1g1_E6 = view.findViewById(R.id.f1g1_E6);
        Button f1g1_E7 = view.findViewById(R.id.f1g1_E7);

        Button f1g1_F1 = view.findViewById(R.id.f1g1_F1);
        Button f1g1_F2 = view.findViewById(R.id.f1g1_F2);
        Button f1g1_F3 = view.findViewById(R.id.f1g1_F3);
        Button f1g1_F4 = view.findViewById(R.id.f1g1_F4);
        Button f1g1_F5 = view.findViewById(R.id.f1g1_F5);
        Button f1g1_F6 = view.findViewById(R.id.f1g1_F6);
        Button f1g1_F7 = view.findViewById(R.id.f1g1_F7);

        Button f1g1_G1 = view.findViewById(R.id.f1g1_G1);
        Button f1g1_G2 = view.findViewById(R.id.f1g1_G2);
        Button f1g1_G3 = view.findViewById(R.id.f1g1_G3);
        Button f1g1_G4 = view.findViewById(R.id.f1g1_G4);
        Button f1g1_G5 = view.findViewById(R.id.f1g1_G5);
        Button f1g1_G6 = view.findViewById(R.id.f1g1_G6);
        Button f1g1_G7 = view.findViewById(R.id.f1g1_G7);

        //Uso i bottoni F1G1
        f1g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metodo per controllare se f2g2_A1 è selezionato o no
                A1 = iListener_f1g1.selezionato_f1g1(0);
                funziona(A1);
            }
        });

        f1g1_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A2 = iListener_f1g1.selezionato_f1g1(1);
                iListener_f1g1.giaSelezionati_f1g1(1);
                funziona(A2);
                /*
                if (!A2) {
                    iListener_f1g1.toastNonColpito_f1g1();
                    iListener_f1g1.nonColpito(f1g1_A2, 1);

                } else {
                    iListener_f1g1.toastColpito_f1g1();
                    iListener_f1g1.colpito(f1g1_A2, 1);
                }
                */
            }
        });

            /*
            //per mantenere il colore
            if(iListener_f1g1.giaSelezionatiF1G1(1)== true){
                if (!A2){
                    iListener_f1g1.nonColpito(f1g1_A2,1);
                }else {
                    iListener_f1g1.colpito(f1g1_A2, 1);
                }
            }
            */

        f1g1_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A3 = iListener_f1g1.selezionato_f1g1(2);
                funziona(A3);
            }
        });

        f1g1_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A4 = iListener_f1g1.selezionato_f1g1(3);
                funziona(A4);
            }
        });

        f1g1_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A5 = iListener_f1g1.selezionato_f1g1(4);
                funziona(A5);
            }
        });

        f1g1_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A6 = iListener_f1g1.selezionato_f1g1(5);
                funziona(A6);
            }
        });

        f1g1_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A7 = iListener_f1g1.selezionato_f1g1(6);
                funziona(A7);
            }
        });

        f1g1_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1 = iListener_f1g1.selezionato_f1g1(7);
                funziona(B1);
            }
        });

        f1g1_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2 = iListener_f1g1.selezionato_f1g1(8);
                funziona(B2);
            }
        });

        f1g1_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3 = iListener_f1g1.selezionato_f1g1(9);
                funziona(B3);
            }
        });

        f1g1_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4 = iListener_f1g1.selezionato_f1g1(10);
                funziona(B4);
            }
        });

        f1g1_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5 = iListener_f1g1.selezionato_f1g1(11);
                funziona(B5);
            }
        });

        f1g1_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6 = iListener_f1g1.selezionato_f1g1(12);
                funziona(B6);
            }
        });

        f1g1_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7 = iListener_f1g1.selezionato_f1g1(13);
                funziona(B7);
            }
        });

        f1g1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C1 = iListener_f1g1.selezionato_f1g1(14);
                funziona(C1);
            }
        });

        f1g1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C2 = iListener_f1g1.selezionato_f1g1(15);
                funziona(C2);
            }
        });

        f1g1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C3 = iListener_f1g1.selezionato_f1g1(16);
                funziona(C3);
            }
        });

        f1g1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C4 = iListener_f1g1.selezionato_f1g1(17);
                funziona(C4);
            }
        });

        f1g1_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C5 = iListener_f1g1.selezionato_f1g1(18);
                funziona(C5);
            }
        });

        f1g1_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C6 = iListener_f1g1.selezionato_f1g1(19);
                funziona(C6);
            }
        });

        f1g1_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C7 = iListener_f1g1.selezionato_f1g1(20);
                funziona(C7);
            }
        });

        f1g1_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1 = iListener_f1g1.selezionato_f1g1(21);
                funziona(D1);
            }
        });

        f1g1_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D2 = iListener_f1g1.selezionato_f1g1(22);
                funziona(D2);
            }
        });

        f1g1_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D3 = iListener_f1g1.selezionato_f1g1(23);
                funziona(D3);
            }
        });

        f1g1_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D4 = iListener_f1g1.selezionato_f1g1(24);
                funziona(D4);
            }
        });

        f1g1_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D5 = iListener_f1g1.selezionato_f1g1(25);
                funziona(D5);
            }
        });

        f1g1_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D6 = iListener_f1g1.selezionato_f1g1(26);
                funziona(D6);
            }
        });

        f1g1_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D7 = iListener_f1g1.selezionato_f1g1(27);
                funziona(D7);
            }
        });

        f1g1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1 = iListener_f1g1.selezionato_f1g1(28);
                funziona(E1);
            }
        });

        f1g1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E2 = iListener_f1g1.selezionato_f1g1(29);
                funziona(E2);
            }
        });

        f1g1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E3 = iListener_f1g1.selezionato_f1g1(30);
                funziona(E3);
            }
        });

        f1g1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E4 = iListener_f1g1.selezionato_f1g1(31);
                funziona(E4);
            }
        });

        f1g1_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E5 = iListener_f1g1.selezionato_f1g1(32);
                funziona(E5);
            }
        });

        f1g1_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E6 = iListener_f1g1.selezionato_f1g1(33);
                funziona(E6);
            }
        });

        f1g1_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E7 = iListener_f1g1.selezionato_f1g1(34);
                funziona(E7);
            }
        });

        f1g1_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F1 = iListener_f1g1.selezionato_f1g1(35);
                funziona(F1);
            }
        });

        f1g1_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F2 = iListener_f1g1.selezionato_f1g1(36);
                funziona(F2);
            }
        });

        f1g1_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F3 = iListener_f1g1.selezionato_f1g1(37);
                funziona(F3);
            }
        });

        f1g1_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F4 = iListener_f1g1.selezionato_f1g1(38);
                funziona(F4);
            }
        });

        f1g1_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F5 = iListener_f1g1.selezionato_f1g1(39);
                funziona(F5);
            }
        });

        f1g1_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F6 = iListener_f1g1.selezionato_f1g1(40);
                funziona(F6);
            }
        });

        f1g1_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F7 = iListener_f1g1.selezionato_f1g1(41);
                funziona(F7);
            }
        });

        f1g1_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G1 = iListener_f1g1.selezionato_f1g1(42);
                funziona(G1);
            }
        });

        f1g1_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G2 = iListener_f1g1.selezionato_f1g1(43);
                funziona(G2);
            }
        });

        f1g1_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G3 = iListener_f1g1.selezionato_f1g1(44);
                funziona(G3);
            }
        });

        f1g1_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G4 = iListener_f1g1.selezionato_f1g1(45);
                funziona(G4);
            }
        });

        f1g1_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G5 = iListener_f1g1.selezionato_f1g1(46);
                funziona(G5);
            }
        });

        f1g1_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G6 = iListener_f1g1.selezionato_f1g1(47);
                funziona(G6);
            }
        });

        f1g1_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G7 = iListener_f1g1.selezionato_f1g1(48);
                funziona(G7);
            }
        });

        return view;
    }

    //Metodo da mettere su ogni pulsante
    public void funziona(boolean b) {
        if (!b) {
            iListener_f1g1.toastNonColpito_f1g1();
        } else {
            iListener_f1g1.toastColpito_f1g1();
        }
    }
}
