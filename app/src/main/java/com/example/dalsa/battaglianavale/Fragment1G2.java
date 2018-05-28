package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1G2 extends Fragment {

    boolean A1, A2, A3, A4, A5, A6, A7;
    boolean B1, B2, B3, B4, B5, B6, B7;
    boolean C1, C2, C3, C4, C5, C6, C7;
    boolean D1, D2, D3, D4, D5, D6, D7;
    boolean E1, E2, E3, E4, E5, E6, E7;
    boolean F1, F2, F3, F4, F5, F6, F7;
    boolean G1, G2, G3, G4, G5, G6, G7;

    interfaceFragment2 iListener_f1g2;

    //Per salvare il fragment
    View view;

    //Metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof interfaceFragment2) {
            iListener_f1g2 = (interfaceFragment2) activity;
        } else {
            iListener_f1g2 = null;
        }
    }

    //Interfaccia
    public interface interfaceFragment2 {
        public void setTextAct_f1g2();

        public void cambiaFrag_f1g2();

        public void vediBarche_f1g2();

        public boolean selezionato_f1g2(int i);

        public void toastColpito_f1g2();

        public void toastNonColpito_f1g2();
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
        view = inflater.inflate(R.layout.fragment1g2, container, false);

        Button btn_concludiTurno_g2 = view.findViewById(R.id.btn_concludiTurno_g2);
        btn_concludiTurno_g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iListener_f1g2.setTextAct_f1g2();
                iListener_f1g2.cambiaFrag_f1g2();

            }
        });

        Button btn_vediBarche_g2 = view.findViewById(R.id.btn_vediBarche_g2);
        btn_vediBarche_g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f1g2.vediBarche_f1g2();

            }
        });

        //Creo tutti i bottoni F1G2
        Button f1g2_A1 = view.findViewById(R.id.f1g2_A1);
        Button f1g2_A2 = view.findViewById(R.id.f1g2_A2);
        Button f1g2_A3 = view.findViewById(R.id.f1g2_A3);
        Button f1g2_A4 = view.findViewById(R.id.f1g2_A4);
        Button f1g2_A5 = view.findViewById(R.id.f1g2_A5);
        Button f1g2_A6 = view.findViewById(R.id.f1g2_A6);
        Button f1g2_A7 = view.findViewById(R.id.f1g2_A7);

        Button f1g2_B1 = view.findViewById(R.id.f1g2_B1);
        Button f1g2_B2 = view.findViewById(R.id.f1g2_B2);
        Button f1g2_B3 = view.findViewById(R.id.f1g2_B3);
        Button f1g2_B4 = view.findViewById(R.id.f1g2_B4);
        Button f1g2_B5 = view.findViewById(R.id.f1g2_B5);
        Button f1g2_B6 = view.findViewById(R.id.f1g2_B6);
        Button f1g2_B7 = view.findViewById(R.id.f1g2_B7);

        Button f1g2_C1 = view.findViewById(R.id.f1g2_C1);
        Button f1g2_C2 = view.findViewById(R.id.f1g2_C2);
        Button f1g2_C3 = view.findViewById(R.id.f1g2_C3);
        Button f1g2_C4 = view.findViewById(R.id.f1g2_C4);
        Button f1g2_C5 = view.findViewById(R.id.f1g2_C5);
        Button f1g2_C6 = view.findViewById(R.id.f1g2_C6);
        Button f1g2_C7 = view.findViewById(R.id.f1g2_C7);

        Button f1g2_D1 = view.findViewById(R.id.f1g2_D1);
        Button f1g2_D2 = view.findViewById(R.id.f1g2_D2);
        Button f1g2_D3 = view.findViewById(R.id.f1g2_D3);
        Button f1g2_D4 = view.findViewById(R.id.f1g2_D4);
        Button f1g2_D5 = view.findViewById(R.id.f1g2_D5);
        Button f1g2_D6 = view.findViewById(R.id.f1g2_D6);
        Button f1g2_D7 = view.findViewById(R.id.f1g2_D7);

        Button f1g2_E1 = view.findViewById(R.id.f1g2_E1);
        Button f1g2_E2 = view.findViewById(R.id.f1g2_E2);
        Button f1g2_E3 = view.findViewById(R.id.f1g2_E3);
        Button f1g2_E4 = view.findViewById(R.id.f1g2_E4);
        Button f1g2_E5 = view.findViewById(R.id.f1g2_E5);
        Button f1g2_E6 = view.findViewById(R.id.f1g2_E6);
        Button f1g2_E7 = view.findViewById(R.id.f1g2_E7);

        Button f1g2_F1 = view.findViewById(R.id.f1g2_F1);
        Button f1g2_F2 = view.findViewById(R.id.f1g2_F2);
        Button f1g2_F3 = view.findViewById(R.id.f1g2_F3);
        Button f1g2_F4 = view.findViewById(R.id.f1g2_F4);
        Button f1g2_F5 = view.findViewById(R.id.f1g2_F5);
        Button f1g2_F6 = view.findViewById(R.id.f1g2_F6);
        Button f1g2_F7 = view.findViewById(R.id.f1g2_F7);

        Button f1g2_G1 = view.findViewById(R.id.f1g2_G1);
        Button f1g2_G2 = view.findViewById(R.id.f1g2_G2);
        Button f1g2_G3 = view.findViewById(R.id.f1g2_G3);
        Button f1g2_G4 = view.findViewById(R.id.f1g2_G4);
        Button f1g2_G5 = view.findViewById(R.id.f1g2_G5);
        Button f1g2_G6 = view.findViewById(R.id.f1g2_G6);
        Button f1g2_G7 = view.findViewById(R.id.f1g2_G7);

        //Uso i pulsanti F1G2
        f1g2_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A1 = iListener_f1g2.selezionato_f1g2(0);
                funziona(A1);
            }
        });

        f1g2_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A2 = iListener_f1g2.selezionato_f1g2(1);
                funziona(A2);
            }
        });

        f1g2_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A3 = iListener_f1g2.selezionato_f1g2(2);
                funziona(A3);
            }
        });

        f1g2_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A4 = iListener_f1g2.selezionato_f1g2(3);
                funziona(A4);
            }
        });

        f1g2_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A5 = iListener_f1g2.selezionato_f1g2(4);
                funziona(A5);
            }
        });

        f1g2_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A6 = iListener_f1g2.selezionato_f1g2(5);
                funziona(A6);
            }
        });

        f1g2_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A7 = iListener_f1g2.selezionato_f1g2(6);
                funziona(A7);
            }
        });

        f1g2_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1 = iListener_f1g2.selezionato_f1g2(7);
                funziona(B1);
            }
        });

        f1g2_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2 = iListener_f1g2.selezionato_f1g2(8);
                funziona(B2);
            }
        });

        f1g2_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3 = iListener_f1g2.selezionato_f1g2(9);
                funziona(B3);
            }
        });

        f1g2_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4 = iListener_f1g2.selezionato_f1g2(10);
                funziona(B4);
            }
        });

        f1g2_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5 = iListener_f1g2.selezionato_f1g2(11);
                funziona(B5);
            }
        });

        f1g2_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6 = iListener_f1g2.selezionato_f1g2(12);
                funziona(B6);
            }
        });

        f1g2_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7 = iListener_f1g2.selezionato_f1g2(13);
                funziona(B7);
            }
        });

        f1g2_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C1 = iListener_f1g2.selezionato_f1g2(14);
                funziona(C1);
            }
        });

        f1g2_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C2 = iListener_f1g2.selezionato_f1g2(15);
                funziona(C2);
            }
        });

        f1g2_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C3 = iListener_f1g2.selezionato_f1g2(16);
                funziona(C3);
            }
        });

        f1g2_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C4 = iListener_f1g2.selezionato_f1g2(17);
                funziona(C4);
            }
        });

        f1g2_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C5 = iListener_f1g2.selezionato_f1g2(18);
                funziona(C5);
            }
        });

        f1g2_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C6 = iListener_f1g2.selezionato_f1g2(19);
                funziona(C6);
            }
        });

        f1g2_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C7 = iListener_f1g2.selezionato_f1g2(20);
                funziona(C7);
            }
        });

        f1g2_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1 = iListener_f1g2.selezionato_f1g2(21);
                funziona(D1);
            }
        });

        f1g2_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D2 = iListener_f1g2.selezionato_f1g2(22);
                funziona(D2);
            }
        });

        f1g2_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D3 = iListener_f1g2.selezionato_f1g2(23);
                funziona(D3);
            }
        });

        f1g2_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D4 = iListener_f1g2.selezionato_f1g2(24);
                funziona(D4);
            }
        });

        f1g2_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D5 = iListener_f1g2.selezionato_f1g2(25);
                funziona(D5);
            }
        });

        f1g2_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D6 = iListener_f1g2.selezionato_f1g2(26);
                funziona(D6);
            }
        });

        f1g2_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D7 = iListener_f1g2.selezionato_f1g2(27);
                funziona(D7);
            }
        });

        f1g2_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1 = iListener_f1g2.selezionato_f1g2(28);
                funziona(E1);
            }
        });

        f1g2_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E2 = iListener_f1g2.selezionato_f1g2(29);
                funziona(E2);
            }
        });

        f1g2_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E3 = iListener_f1g2.selezionato_f1g2(30);
                funziona(E3);
            }
        });

        f1g2_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E4 = iListener_f1g2.selezionato_f1g2(31);
                funziona(E4);
            }
        });

        f1g2_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E5 = iListener_f1g2.selezionato_f1g2(32);
                funziona(E5);
            }
        });

        f1g2_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E6 = iListener_f1g2.selezionato_f1g2(33);
                funziona(E6);
            }
        });

        f1g2_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E7 = iListener_f1g2.selezionato_f1g2(34);
                funziona(E7);
            }
        });

        f1g2_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F1 = iListener_f1g2.selezionato_f1g2(35);
                funziona(F1);
            }
        });

        f1g2_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F2 = iListener_f1g2.selezionato_f1g2(36);
                funziona(F2);
            }
        });

        f1g2_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F3 = iListener_f1g2.selezionato_f1g2(37);
                funziona(F3);
            }
        });

        f1g2_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F4 = iListener_f1g2.selezionato_f1g2(38);
                funziona(F4);
            }
        });

        f1g2_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F5 = iListener_f1g2.selezionato_f1g2(39);
                funziona(F5);
            }
        });

        f1g2_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F6 = iListener_f1g2.selezionato_f1g2(40);
                funziona(F6);
            }
        });

        f1g2_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F7 = iListener_f1g2.selezionato_f1g2(41);
                funziona(F7);
            }
        });

        f1g2_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G1 = iListener_f1g2.selezionato_f1g2(42);
                funziona(G1);
            }
        });

        f1g2_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G2 = iListener_f1g2.selezionato_f1g2(43);
                funziona(G2);
            }
        });

        f1g2_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G3 = iListener_f1g2.selezionato_f1g2(44);
                funziona(G3);
            }
        });

        f1g2_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G4 = iListener_f1g2.selezionato_f1g2(45);
                funziona(G4);
            }
        });

        f1g2_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G5 = iListener_f1g2.selezionato_f1g2(46);
                funziona(G5);
            }
        });

        f1g2_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G6 = iListener_f1g2.selezionato_f1g2(47);
                funziona(G6);
            }
        });

        f1g2_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G7 = iListener_f1g2.selezionato_f1g2(48);
                funziona(G7);
            }
        });

        return view;
    }

    //Metodo da mettere su ogni pulsante
    public void funziona(boolean b) {
        if (!b) {
            iListener_f1g2.toastNonColpito_f1g2();
        } else {
            iListener_f1g2.toastColpito_f1g2();
        }
    }
}
