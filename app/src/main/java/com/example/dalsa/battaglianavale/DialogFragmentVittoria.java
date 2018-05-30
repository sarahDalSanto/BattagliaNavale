package com.example.dalsa.battaglianavale;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;

@SuppressLint("ValidFragment")
public class DialogFragmentVittoria extends DialogFragment {

        IDialogFragment mListener;//riferimento all'interfaccia che poi servirà da riferimento all'activity
        String mTitle, mMessage;



        public interface IDialogFragment {
            public void startNewActivity();

        }

        public DialogFragmentVittoria(String aTitle, String aMessage) {
            mTitle = aTitle;
            mMessage = aMessage;
        }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder vDialog = new AlertDialog.Builder(getActivity());
        vDialog.setTitle(mTitle);
        vDialog.setMessage(mMessage);

        vDialog.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mListener.startNewActivity();

            }
        });
        /*

        vDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        */

        return vDialog.create();
    }

    @Override
    public void onAttach(Activity activity) {
        if (activity instanceof IDialogFragment) {
            mListener = (IDialogFragment) activity;
        } else {
            mListener = null;
        }
        super.onAttach(activity);
    }



}
