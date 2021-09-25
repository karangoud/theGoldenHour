package com.Emergency.Driver;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        DatabaseReference Emergencystatus = FirebaseDatabase.getInstance().getReference("Check");
        Emergencystatus.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){

                    FragmentManager manager = getSupportFragmentManager();
                    Warning warning = new Warning();
                    warning.show(manager, "Called");
                }
                if(!dataSnapshot.exists()){
                    FragmentManager manager = getSupportFragmentManager();
                    WarningCancelled warningCancelled = new WarningCancelled();
                    warningCancelled.show(manager,"Called");
                }



            }




            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
