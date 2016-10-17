package com.example.hopeforthehomeless.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class howtohelp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtohelp2);
    }
    public void done(View view){
        Intent i = new Intent(this,firstscreen.class);
        startActivity(i);
    }
}
