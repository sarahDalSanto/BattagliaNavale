package com.example.dalsa.battaglianavale.Player1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dalsa.battaglianavale.R;
import com.example.dalsa.battaglianavale.Helpers.VittoriaActivity;

public class Fragment1G1 extends Fragment {

    private int contaBarche_f1g1 = 0;
    private boolean frag_f1g1 = true;
    private String nomePlayer1;

    private boolean A1, A2, A3, A4, A5, A6, A7;
    private boolean B1, B2, B3, B4, B5, B6, B7;
    private boolean C1, C2, C3, C4, C5, C6, C7;
    private boolean D1, D2, D3, D4, D5, D6, D7;
    private boolean E1, E2, E3, E4, E5, E6, E7;
    private boolean F1, F2, F3, F4, F5, F6, F7;
    private boolean G1, G2, G3, G4, G5, G6, G7;

    private Button f1g1_A1, f1g1_A2, f1g1_A3, f1g1_A4, f1g1_A5, f1g1_A6, f1g1_A7;
    private Button f1g1_B1, f1g1_B2, f1g1_B3, f1g1_B4, f1g1_B5, f1g1_B6, f1g1_B7;
    private Button f1g1_C1, f1g1_C2, f1g1_C3, f1g1_C4, f1g1_C5, f1g1_C6, f1g1_C7;
    private Button f1g1_D1, f1g1_D2, f1g1_D3, f1g1_D4, f1g1_D5, f1g1_D6, f1g1_D7;
    private Button f1g1_E1, f1g1_E2, f1g1_E3, f1g1_E4, f1g1_E5, f1g1_E6, f1g1_E7;
    private Button f1g1_F1, f1g1_F2, f1g1_F3, f1g1_F4, f1g1_F5, f1g1_F6, f1g1_F7;
    private Button f1g1_G1, f1g1_G2, f1g1_G3, f1g1_G4, f1g1_G5, f1g1_G6, f1g1_G7;

    private interfaceFragment iListener_f1g1;

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

        public void cambiaFrag_f1g1(boolean frag);

        public void vediBarche_f1g1();

        public boolean selezionato_f1g1(int i);

        public void toastColpito_f1g1();

        public void toastNonColpito_f1g1();

        public String passName_f1g1();

        public int passContaBarche_f1g1(int contaBarche);
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

        //Creo tutti i bottoni F1G1
        f1g1_A1 = view.findViewById(R.id.f1g1_A1);
        f1g1_A2 = view.findViewById(R.id.f1g1_A2);
        f1g1_A3 = view.findViewById(R.id.f1g1_A3);
        f1g1_A4 = view.findViewById(R.id.f1g1_A4);
        f1g1_A5 = view.findViewById(R.id.f1g1_A5);
        f1g1_A6 = view.findViewById(R.id.f1g1_A6);
        f1g1_A7 = view.findViewById(R.id.f1g1_A7);

        f1g1_B1 = view.findViewById(R.id.f1g1_B1);
        f1g1_B2 = view.findViewById(R.id.f1g1_B2);
        f1g1_B3 = view.findViewById(R.id.f1g1_B3);
        f1g1_B4 = view.findViewById(R.id.f1g1_B4);
        f1g1_B5 = view.findViewById(R.id.f1g1_B5);
        f1g1_B6 = view.findViewById(R.id.f1g1_B6);
        f1g1_B7 = view.findViewById(R.id.f1g1_B7);

        f1g1_C1 = view.findViewById(R.id.f1g1_C1);
        f1g1_C2 = view.findViewById(R.id.f1g1_C2);
        f1g1_C3 = view.findViewById(R.id.f1g1_C3);
        f1g1_C4 = view.findViewById(R.id.f1g1_C4);
        f1g1_C5 = view.findViewById(R.id.f1g1_C5);
        f1g1_C6 = view.findViewById(R.id.f1g1_C6);
        f1g1_C7 = view.findViewById(R.id.f1g1_C7);

        f1g1_D1 = view.findViewById(R.id.f1g1_D1);
        f1g1_D2 = view.findViewById(R.id.f1g1_D2);
        f1g1_D3 = view.findViewById(R.id.f1g1_D3);
        f1g1_D4 = view.findViewById(R.id.f1g1_D4);
        f1g1_D5 = view.findViewById(R.id.f1g1_D5);
        f1g1_D6 = view.findViewById(R.id.f1g1_D6);
        f1g1_D7 = view.findViewById(R.id.f1g1_D7);

        f1g1_E1 = view.findViewById(R.id.f1g1_E1);
        f1g1_E2 = view.findViewById(R.id.f1g1_E2);
        f1g1_E3 = view.findViewById(R.id.f1g1_E3);
        f1g1_E4 = view.findViewById(R.id.f1g1_E4);
        f1g1_E5 = view.findViewById(R.id.f1g1_E5);
        f1g1_E6 = view.findViewById(R.id.f1g1_E6);
        f1g1_E7 = view.findViewById(R.id.f1g1_E7);

        f1g1_F1 = view.findViewById(R.id.f1g1_F1);
        f1g1_F2 = view.findViewById(R.id.f1g1_F2);
        f1g1_F3 = view.findViewById(R.id.f1g1_F3);
        f1g1_F4 = view.findViewById(R.id.f1g1_F4);
        f1g1_F5 = view.findViewById(R.id.f1g1_F5);
        f1g1_F6 = view.findViewById(R.id.f1g1_F6);
        f1g1_F7 = view.findViewById(R.id.f1g1_F7);

        f1g1_G1 = view.findViewById(R.id.f1g1_G1);
        f1g1_G2 = view.findViewById(R.id.f1g1_G2);
        f1g1_G3 = view.findViewById(R.id.f1g1_G3);
        f1g1_G4 = view.findViewById(R.id.f1g1_G4);
        f1g1_G5 = view.findViewById(R.id.f1g1_G5);
        f1g1_G6 = view.findViewById(R.id.f1g1_G6);
        f1g1_G7 = view.findViewById(R.id.f1g1_G7);

        Button btn_concludiTurno_g1 = view.findViewById(R.id.btn_concludiTurno_g1);
        btn_concludiTurno_g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iListener_f1g1.setTextAct_f1g1();
                iListener_f1g1.cambiaFrag_f1g1(frag_f1g1);
                sbloccaButtons_f1g1();
                iListener_f1g1.passName_f1g1();
                iListener_f1g1.passContaBarche_f1g1(contaBarche_f1g1);
            }
        });

        Button btn_vediBarche_g1 = view.findViewById(R.id.btn_vediBarche_g1);
        btn_vediBarche_g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener_f1g1.vediBarche_f1g1();
            }
        });

        //Uso i bottoni F1G1
        f1g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Metodo per controllare se f2g2_A1 è selezionato o no
                A1 = iListener_f1g1.selezionato_f1g1(0);
                checkBoat_f1g1(A1, f1g1_A1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A2 = iListener_f1g1.selezionato_f1g1(1);
                checkBoat_f1g1(A2, f1g1_A2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A3 = iListener_f1g1.selezionato_f1g1(2);
                checkBoat_f1g1(A3, f1g1_A3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A4 = iListener_f1g1.selezionato_f1g1(3);
                checkBoat_f1g1(A4, f1g1_A4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A5 = iListener_f1g1.selezionato_f1g1(4);
                checkBoat_f1g1(A5, f1g1_A5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A6 = iListener_f1g1.selezionato_f1g1(5);
                checkBoat_f1g1(A6, f1g1_A6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A7 = iListener_f1g1.selezionato_f1g1(6);
                checkBoat_f1g1(A7, f1g1_A7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1 = iListener_f1g1.selezionato_f1g1(7);
                checkBoat_f1g1(B1, f1g1_B1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2 = iListener_f1g1.selezionato_f1g1(8);
                checkBoat_f1g1(B2, f1g1_B2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3 = iListener_f1g1.selezionato_f1g1(9);
                checkBoat_f1g1(B3, f1g1_B3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4 = iListener_f1g1.selezionato_f1g1(10);
                checkBoat_f1g1(B4, f1g1_B4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5 = iListener_f1g1.selezionato_f1g1(11);
                checkBoat_f1g1(B5, f1g1_B5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6 = iListener_f1g1.selezionato_f1g1(12);
                checkBoat_f1g1(B6, f1g1_B6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7 = iListener_f1g1.selezionato_f1g1(13);
                checkBoat_f1g1(B7, f1g1_B7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C1 = iListener_f1g1.selezionato_f1g1(14);
                checkBoat_f1g1(C1, f1g1_C1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C2 = iListener_f1g1.selezionato_f1g1(15);
                checkBoat_f1g1(C2, f1g1_C2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C3 = iListener_f1g1.selezionato_f1g1(16);
                checkBoat_f1g1(C3, f1g1_C3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C4 = iListener_f1g1.selezionato_f1g1(17);
                checkBoat_f1g1(C4, f1g1_C4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C5 = iListener_f1g1.selezionato_f1g1(18);
                checkBoat_f1g1(C5, f1g1_C5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C6 = iListener_f1g1.selezionato_f1g1(19);
                checkBoat_f1g1(C6, f1g1_C6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C7 = iListener_f1g1.selezionato_f1g1(20);
                checkBoat_f1g1(C7, f1g1_C7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1 = iListener_f1g1.selezionato_f1g1(21);
                checkBoat_f1g1(D1, f1g1_D1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D2 = iListener_f1g1.selezionato_f1g1(22);
                checkBoat_f1g1(D2, f1g1_D2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D3 = iListener_f1g1.selezionato_f1g1(23);
                checkBoat_f1g1(D3, f1g1_D3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D4 = iListener_f1g1.selezionato_f1g1(24);
                checkBoat_f1g1(D4, f1g1_D4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D5 = iListener_f1g1.selezionato_f1g1(25);
                checkBoat_f1g1(D5, f1g1_D5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D6 = iListener_f1g1.selezionato_f1g1(26);
                checkBoat_f1g1(D6, f1g1_D6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D7 = iListener_f1g1.selezionato_f1g1(27);
                checkBoat_f1g1(D7, f1g1_D7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1 = iListener_f1g1.selezionato_f1g1(28);
                checkBoat_f1g1(E1, f1g1_E1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E2 = iListener_f1g1.selezionato_f1g1(29);
                checkBoat_f1g1(E2, f1g1_E2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E3 = iListener_f1g1.selezionato_f1g1(30);
                checkBoat_f1g1(E3, f1g1_E3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E4 = iListener_f1g1.selezionato_f1g1(31);
                checkBoat_f1g1(E4, f1g1_E4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E5 = iListener_f1g1.selezionato_f1g1(32);
                checkBoat_f1g1(E5, f1g1_E5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E6 = iListener_f1g1.selezionato_f1g1(33);
                checkBoat_f1g1(E6, f1g1_E6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E7 = iListener_f1g1.selezionato_f1g1(34);
                checkBoat_f1g1(E7, f1g1_E7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F1 = iListener_f1g1.selezionato_f1g1(35);
                checkBoat_f1g1(F1, f1g1_F1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F2 = iListener_f1g1.selezionato_f1g1(36);
                checkBoat_f1g1(F2, f1g1_F2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F3 = iListener_f1g1.selezionato_f1g1(37);
                checkBoat_f1g1(F3, f1g1_F3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F4 = iListener_f1g1.selezionato_f1g1(38);
                checkBoat_f1g1(F4, f1g1_F4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F5 = iListener_f1g1.selezionato_f1g1(39);
                checkBoat_f1g1(F5, f1g1_F5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F6 = iListener_f1g1.selezionato_f1g1(40);
                checkBoat_f1g1(F6, f1g1_F6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F7 = iListener_f1g1.selezionato_f1g1(41);
                checkBoat_f1g1(F7, f1g1_F7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G1 = iListener_f1g1.selezionato_f1g1(42);
                checkBoat_f1g1(G1, f1g1_G1);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G2 = iListener_f1g1.selezionato_f1g1(43);
                checkBoat_f1g1(G2, f1g1_G2);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G3 = iListener_f1g1.selezionato_f1g1(44);
                checkBoat_f1g1(G3, f1g1_G3);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G4 = iListener_f1g1.selezionato_f1g1(45);
                checkBoat_f1g1(G4, f1g1_G4);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G5 = iListener_f1g1.selezionato_f1g1(46);
                checkBoat_f1g1(G5, f1g1_G5);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G6 = iListener_f1g1.selezionato_f1g1(47);
                checkBoat_f1g1(G6, f1g1_G6);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        f1g1_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G7 = iListener_f1g1.selezionato_f1g1(48);
                checkBoat_f1g1(G7, f1g1_G7);
                metodoContaBarche_f1g1();
                bloccaButtons_f1g1();
            }
        });

        return view;
    }

    public void metodoContaBarche_f1g1() {
        if (contaBarche_f1g1 == 12) {
            //Add nome player da passare a Vittoria
            Intent intent = new Intent(getActivity(), VittoriaActivity.class);
            nomePlayer1 = iListener_f1g1.passName_f1g1();
            intent.putExtra("player", nomePlayer1);
            startActivity(intent);
        }
    }

    //Metodo da mettere su ogni pulsante
    public void checkBoat_f1g1(boolean b, Button btn) {
        if (!b) {
            iListener_f1g1.toastNonColpito_f1g1();
            setBackgroundNonColpito_f1g1(btn);
        } else {
            iListener_f1g1.toastColpito_f1g1();
            setBackgroundColpito_f1g1(btn);
            contaBarche_f1g1++;
        }
        //Per disabilitare il pulsante una volta schiacciato
        btn.setEnabled(false);
    }

    public Button setBackgroundColpito_f1g1(Button b) {
        b.setBackgroundResource(R.drawable.ship_select_and_found_g1);
        return b;
    }

    public Button setBackgroundNonColpito_f1g1(Button b) {
        b.setBackgroundResource(R.drawable.ship_select_and_missed_g1);
        return b;
    }

    public void bloccaButtons_f1g1() {
        f1g1_A1.setClickable(false);
        f1g1_A2.setClickable(false);
        f1g1_A3.setClickable(false);
        f1g1_A4.setClickable(false);
        f1g1_A5.setClickable(false);
        f1g1_A6.setClickable(false);
        f1g1_A7.setClickable(false);
        f1g1_B1.setClickable(false);
        f1g1_B2.setClickable(false);
        f1g1_B3.setClickable(false);
        f1g1_B4.setClickable(false);
        f1g1_B5.setClickable(false);
        f1g1_B6.setClickable(false);
        f1g1_B7.setClickable(false);
        f1g1_C1.setClickable(false);
        f1g1_C2.setClickable(false);
        f1g1_C3.setClickable(false);
        f1g1_C4.setClickable(false);
        f1g1_C5.setClickable(false);
        f1g1_C6.setClickable(false);
        f1g1_C7.setClickable(false);
        f1g1_D1.setClickable(false);
        f1g1_D2.setClickable(false);
        f1g1_D3.setClickable(false);
        f1g1_D4.setClickable(false);
        f1g1_D5.setClickable(false);
        f1g1_D6.setClickable(false);
        f1g1_D7.setClickable(false);
        f1g1_E1.setClickable(false);
        f1g1_E2.setClickable(false);
        f1g1_E3.setClickable(false);
        f1g1_E4.setClickable(false);
        f1g1_E5.setClickable(false);
        f1g1_E6.setClickable(false);
        f1g1_E7.setClickable(false);
        f1g1_F1.setClickable(false);
        f1g1_F2.setClickable(false);
        f1g1_F3.setClickable(false);
        f1g1_F4.setClickable(false);
        f1g1_F5.setClickable(false);
        f1g1_F6.setClickable(false);
        f1g1_F7.setClickable(false);
        f1g1_G1.setClickable(false);
        f1g1_G2.setClickable(false);
        f1g1_G3.setClickable(false);
        f1g1_G4.setClickable(false);
        f1g1_G5.setClickable(false);
        f1g1_G6.setClickable(false);
        f1g1_G7.setClickable(false);
    }

    public void sbloccaButtons_f1g1() {
        f1g1_A1.setClickable(true);
        f1g1_A2.setClickable(true);
        f1g1_A3.setClickable(true);
        f1g1_A4.setClickable(true);
        f1g1_A5.setClickable(true);
        f1g1_A6.setClickable(true);
        f1g1_A7.setClickable(true);
        f1g1_B1.setClickable(true);
        f1g1_B2.setClickable(true);
        f1g1_B3.setClickable(true);
        f1g1_B4.setClickable(true);
        f1g1_B5.setClickable(true);
        f1g1_B6.setClickable(true);
        f1g1_B7.setClickable(true);
        f1g1_C1.setClickable(true);
        f1g1_C2.setClickable(true);
        f1g1_C3.setClickable(true);
        f1g1_C4.setClickable(true);
        f1g1_C5.setClickable(true);
        f1g1_C6.setClickable(true);
        f1g1_C7.setClickable(true);
        f1g1_D1.setClickable(true);
        f1g1_D2.setClickable(true);
        f1g1_D3.setClickable(true);
        f1g1_D4.setClickable(true);
        f1g1_D5.setClickable(true);
        f1g1_D6.setClickable(true);
        f1g1_D7.setClickable(true);
        f1g1_E1.setClickable(true);
        f1g1_E2.setClickable(true);
        f1g1_E3.setClickable(true);
        f1g1_E4.setClickable(true);
        f1g1_E5.setClickable(true);
        f1g1_E6.setClickable(true);
        f1g1_E7.setClickable(true);
        f1g1_F1.setClickable(true);
        f1g1_F2.setClickable(true);
        f1g1_F3.setClickable(true);
        f1g1_F4.setClickable(true);
        f1g1_F5.setClickable(true);
        f1g1_F6.setClickable(true);
        f1g1_F7.setClickable(true);
        f1g1_G1.setClickable(true);
        f1g1_G2.setClickable(true);
        f1g1_G3.setClickable(true);
        f1g1_G4.setClickable(true);
        f1g1_G5.setClickable(true);
        f1g1_G6.setClickable(true);
        f1g1_G7.setClickable(true);
    }
}
