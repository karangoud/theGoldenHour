package com.Emergency.Driver;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.Emergency.Driver.R;

public class Warning extends AppCompatDialogFragment {

    Button AcceptButton,RejectButton;

        public String message;

    public Warning() {
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
        View view = inflater.inflate(R.layout.alert_dialog,null);
        builder.setView(view);

        AcceptButton = view.findViewById(R.id.accept);
        RejectButton = view.findViewById(R.id.Reject);

        AcceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(),SimpleDirectionActivity.class);
                startActivity(intent);
                dismiss();

            }
        });

        RejectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"No Task Available",Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });







        return builder.create();
    }
}
