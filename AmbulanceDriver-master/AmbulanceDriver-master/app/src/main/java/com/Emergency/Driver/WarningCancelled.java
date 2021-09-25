package com.Emergency.Driver;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WarningCancelled extends AppCompatDialogFragment {

   TextView textView;

    public String message;
    Button button;

    public WarningCancelled() {
    }



    @Override
    public void show(FragmentManager manager, String tag) {
        super.show(manager, tag);

    }

    @Override
    public void dismiss() {
        super.dismiss();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.warning_cancelled,null);
        builder.setView(view);

        textView = view.findViewById(R.id.cancelled);
        button=view.findViewById(R.id.okay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });











        return builder.create();
    }
}