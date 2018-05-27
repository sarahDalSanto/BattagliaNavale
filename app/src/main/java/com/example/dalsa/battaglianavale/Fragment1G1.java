package com.example.dalsa.battaglianavale;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment1G1 extends Fragment {

    boolean A1,A2, A3,A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7,D1, D2, D3, D4, D5, D6, D7, E1, E2, E3, E4, E5, E6, E7, F1, F2, F3, F4, F5, F6, F7, G1, G2, G3, G4, G5, G6, G7;
    interfaceFragment iListener;

    //metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof interfaceFragment){
            iListener = (interfaceFragment) activity;
        }else{
            iListener = null;
        }
    }


    //INTERFACCIA
    public interface interfaceFragment{

        public void setTextAct();
        public void cambiaFrag();
        public void vediBarche();

        public boolean selezioantoBoh(int i);
        public void toastColpito();
        public void toastNonColpito();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1g1, null);

        Button btn_cambiaTurno = view.findViewById(R.id.btn_cambiaTurno);
        btn_cambiaTurno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iListener.setTextAct();
                iListener.cambiaFrag();
            }
        });

        Button btn_vediBarche = view.findViewById(R.id.btn_vediBarche);
        btn_vediBarche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener.vediBarche();
            }
        });


        /*
         creo tutti i bottoni F1G1
        */
        Button f1g1_A1 = view.findViewById(R.id.f1g1_A1);
        Button f1g1_A2 = view.findViewById(R.id.f1g1_A2);
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


        /*
         uso i bottoni F1G1
        */
        f1g1_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metodo per controllare se f2g2_A1 è selezionato o no
                A1 = iListener.selezioantoBoh(0);
                funziona(A1);
            }
        });
        f1g1_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A2 = iListener.selezioantoBoh(1);
                funziona(A2);
            }
        });
        f1g1_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A3 = iListener.selezioantoBoh(2);
                funziona(A3);
            }
        });
        f1g1_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A4 = iListener.selezioantoBoh(3);
                funziona(A4);
            }
        });
        f1g1_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A5 = iListener.selezioantoBoh(4);
                funziona(A5);
            }
        });
        f1g1_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A6 = iListener.selezioantoBoh(5);
                funziona(A6);
            }
        });
        f1g1_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A7 = iListener.selezioantoBoh(6);
                funziona(A7);
            }
        });

        f1g1_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1 = iListener.selezioantoBoh(7);
                funziona(B1);
            }
        });
        f1g1_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2 = iListener.selezioantoBoh(8);
                funziona(B2);
            }
        });
        f1g1_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3 = iListener.selezioantoBoh(9);
                funziona(B3);
            }
        });
        f1g1_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4 = iListener.selezioantoBoh(10);
                funziona(B4);
            }
        });
        f1g1_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5 = iListener.selezioantoBoh(11);
                funziona(B5);
            }
        });
        f1g1_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6 = iListener.selezioantoBoh(12);
                funziona(B6);
            }
        });
        f1g1_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7 = iListener.selezioantoBoh(13);
                funziona(B7);
            }
        });

        f1g1_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C1 = iListener.selezioantoBoh(14);
                funziona(C1);
            }
        });
        f1g1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C2 = iListener.selezioantoBoh(15);
                funziona(C2);
            }
        });
        f1g1_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C3 = iListener.selezioantoBoh(16);
                funziona(C3);
            }
        });
        f1g1_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C4 = iListener.selezioantoBoh(17);
                funziona(C4);
            }
        });
        f1g1_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C5 = iListener.selezioantoBoh(18);
                funziona(C5);
            }
        });
        f1g1_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C6 = iListener.selezioantoBoh(19);
                funziona(C6);
            }
        });
        f1g1_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C7 = iListener.selezioantoBoh(20);
                funziona(C7);
            }
        });

        f1g1_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D1 = iListener.selezioantoBoh(21);
                funziona(D1);
            }
        });
        f1g1_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D2 = iListener.selezioantoBoh(22);
                funziona(D2);
            }
        });
        f1g1_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D3 = iListener.selezioantoBoh(23);
                funziona(D3);
            }
        });
        f1g1_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D4 = iListener.selezioantoBoh(24);
                funziona(D4);
            }
        });
        f1g1_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D5 = iListener.selezioantoBoh(25);
                funziona(D5);
            }
        });
        f1g1_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D6 = iListener.selezioantoBoh(26);
                funziona(D6);
            }
        });
        f1g1_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D7 = iListener.selezioantoBoh(27);
                funziona(D7);
            }
        });

        f1g1_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1 = iListener.selezioantoBoh(28);
                funziona(E1);
            }
        });
        f1g1_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E2 = iListener.selezioantoBoh(29);
                funziona(E2);
            }
        });
        f1g1_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E3 = iListener.selezioantoBoh(30);
                funziona(E3);
            }
        });
        f1g1_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E4 = iListener.selezioantoBoh(31);
                funziona(E4);
            }
        });
        f1g1_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E5 = iListener.selezioantoBoh(32);
                funziona(E5);
            }
        });
        f1g1_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E6 = iListener.selezioantoBoh(33);
                funziona(E6);
            }
        });
        f1g1_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E7 = iListener.selezioantoBoh(34);
                funziona(E7);
            }
        });
        f1g1_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F1 = iListener.selezioantoBoh(35);
                funziona(F1);
            }
        });
        f1g1_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F2 = iListener.selezioantoBoh(36);
                funziona(F2);
            }
        });
        f1g1_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F3 = iListener.selezioantoBoh(37);
                funziona(F3);
            }
        });
        f1g1_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F4 = iListener.selezioantoBoh(38);
                funziona(F4);
            }
        });
        f1g1_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F5 = iListener.selezioantoBoh(39);
                funziona(F5);
            }
        });
        f1g1_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F6 = iListener.selezioantoBoh(40);
                funziona(F6);
            }
        });
        f1g1_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F7 = iListener.selezioantoBoh(41);
                funziona(F7);
            }
        });
        f1g1_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G1 = iListener.selezioantoBoh(42);
                funziona(G1);
            }
        });
        f1g1_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G2 = iListener.selezioantoBoh(43);
                funziona(G2);
            }
        });
        f1g1_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G3 = iListener.selezioantoBoh(44);
                funziona(G3);
            }
        });
        f1g1_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G4 = iListener.selezioantoBoh(45);
                funziona(G4);
            }
        });
        f1g1_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G5 = iListener.selezioantoBoh(46);
                funziona(G5);
            }
        });
        f1g1_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G6 = iListener.selezioantoBoh(47);
                funziona(G6);
            }
        });
        f1g1_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                G7 = iListener.selezioantoBoh(48);
                funziona(G7);
            }
        });




        return view;
    }


    //metodo da mettere su ogni pulsante
    public void funziona( boolean b){
        if(!b){
            iListener.toastNonColpito();
        }else{
            iListener.toastColpito();
        }
    }


}
