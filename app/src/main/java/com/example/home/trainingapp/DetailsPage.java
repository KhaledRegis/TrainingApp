package com.example.home.trainingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);
        TextView txv = (TextView) findViewById(R.id.textView2);
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String username =null;
        if(extras!= null) {
            username = extras.get("username").toString();
        }
        txv.setText("welcome " +username);

        Toast.makeText(getApplicationContext(), "welcome " + username, Toast.LENGTH_LONG).show();



        //dynamic fragment code

        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment

        //two fragment choice.

        //ft.replace(R.id.dynamicfrag, new myfragmentfoo());
        ft.replace(R.id.dynamicfrag, new myfragmentfoo2());

        // two fragment choise.


        ft.commit();

        //dynamic fragment code
    }

}
