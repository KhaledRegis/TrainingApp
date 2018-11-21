package com.example.home.trainingapp;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.Btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hello",Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(),DetailsPage.class);
                EditText edit = (EditText)findViewById(R.id.editText);
                i.putExtra("username", edit.getText());

                startActivity(i);
            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("Main Activity","hello on start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("Main Activity","hello on resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("Main Activity","hello on pause");
        super.onPause();
    }


    @Override
    protected void onStop() {
        Log.d("Main Activity","hello on stop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Main Activity","hello on destroy");
        super.onDestroy();
    }
}
