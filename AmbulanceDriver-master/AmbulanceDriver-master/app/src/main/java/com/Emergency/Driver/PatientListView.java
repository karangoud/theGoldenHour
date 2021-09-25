package com.Emergency.Driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PatientListView extends AppCompatActivity {
    ListView patientListView;

Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list_view);
        patientListView = (ListView) findViewById(R.id.patientListView);


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Name : Karan Goud " );
        arrayList.add("EmailID : karangoud0@gmail.com");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1
                ,arrayList);
        patientListView.setAdapter(arrayAdapter);


    }
}
