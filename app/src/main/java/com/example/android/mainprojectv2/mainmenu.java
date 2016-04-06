package com.example.android.mainprojectv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        Intent intent = getIntent();
        String message = "Welcome, ";
        message = message + intent.getStringExtra(neww.EXTRA_MESSAGE);
        TextView welcome = (TextView) findViewById(R.id.textViewWelcome);
        welcome.setText(message);
    }
    public void Fruits(View view){
        Intent intent = new Intent(this, neww.class);
        startActivity(intent);
    }

    public void Sports(View view) {
        Intent intent = new Intent(this, sports.class);
        startActivity(intent);
    }

}