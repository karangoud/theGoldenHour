package com.Emergency.Patient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListviewPatient extends AppCompatActivity {
    ListView patientListView;
    TextView name;
    TextView emailID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_patient);
        patientListView = (ListView) findViewById(R.id.patientListView);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Patient Details");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,arrayList);
        patientListView.setAdapter(arrayAdapter);
        patientListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                name.setText("Karan Goud");
                emailID.setText("karangoud0@gmail.com");

            }
        });
    }
}
