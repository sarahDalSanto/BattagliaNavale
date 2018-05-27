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

    //variabile booleana per vedere se è stato selezionato il pulsante

    interfaceFragment2 iListener4;

    //metodo onAttach
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof Fragment2G2.interfaceFragment2){
            iListener4 = (Fragment2G2.interfaceFragment2) activity;
        }else{
            iListener4 = null;
        }
    }


    //INTERFACCIA
    public interface interfaceFragment2{
        public void indietro2();
        public void selezionatoTrue(int i);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2g2, null);

       Button btn_indietro2 = view.findViewById(R.id.btn_indietro2);
       btn_indietro2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               iListener4.indietro2();
           }
       });


        /*
         creo tutti i bottoni F2G2
        */
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

        /*
         uso i bottoni F2G2
        */
        f2g2_A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metodo per far vedere se è stato selezionato
                iListener4.selezionatoTrue(0);
            }
        });
        f2g2_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(1);
            }
        });
        f2g2_A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(2);
            }
        });
        f2g2_A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(3);
            }
        });
        f2g2_A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(4);
            }
        });
        f2g2_A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(5);
            }
        });
        f2g2_A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(6);
            }
        });
        f2g2_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(7);
            }
        });
        f2g2_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(8);
            }
        });
        f2g2_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(9);
            }
        });
        f2g2_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(10);
            }
        });
        f2g2_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(11);
            }
        });
        f2g2_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(12);
            }
        });
        f2g2_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(13);
            }
        });
        f2g2_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(14);
            }
        });
        f2g2_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(15);
            }
        });
        f2g2_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(16);
            }
        });
        f2g2_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(17);
            }
        });
        f2g2_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(18);
            }
        });
        f2g2_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(19);
            }
        });
        f2g2_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(20);
            }
        });
        f2g2_D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(21);
            }
        });
        f2g2_D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(22);
            }
        });
        f2g2_D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(23);
            }
        });
        f2g2_D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(24);
            }
        });
        f2g2_D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(25);
            }
        });
        f2g2_D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(26);
            }
        });
        f2g2_D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(27);
            }
        });
        f2g2_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(28);
            }
        });
        f2g2_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(29);
            }
        });
        f2g2_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(30);
            }
        });
        f2g2_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(31);
            }
        });
        f2g2_E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(32);
            }
        });
        f2g2_E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(33);
            }
        });
        f2g2_E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(34);
            }
        });
        f2g2_F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(35);
            }
        });
        f2g2_F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(36);
            }
        });
        f2g2_F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(37);
            }
        });
        f2g2_F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(38);
            }
        });
        f2g2_F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(39);
            }
        });
        f2g2_F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(40);
            }
        });
        f2g2_F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(41);
            }
        });
        f2g2_G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(42);
            }
        });
        f2g2_G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(43);
            }
        });
        f2g2_G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(44);
            }
        });
        f2g2_G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(45);
            }
        });
        f2g2_G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(46);
            }
        });
        f2g2_G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(47);
            }
        });
        f2g2_G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iListener4.selezionatoTrue(48);
            }
        });

        return view;
    }



}
