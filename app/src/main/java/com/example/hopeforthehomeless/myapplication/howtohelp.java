package com.example.hopeforthehomeless.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class howtohelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtohelp);
    }
    public void help2(View view){
        Intent i = new Intent(this,howtohelp2.class);
        startActivity(i);
    }
}
