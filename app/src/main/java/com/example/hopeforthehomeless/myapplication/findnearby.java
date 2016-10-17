package com.example.hopeforthehomeless.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlacePicker;

public class findnearby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findnearby);
        mClient = new GoogleApiClient.Builder(this).addApi(Places.GEO_DATA_API).addApi(Places.PLACE_DETECTION_API).build();


    }
    private static final int PLACE_PICKER_REQUEST = 1000;
    private GoogleApiClient mClient;



    public void jobs(View view){
        Intent i = new Intent(this,jobs.class);
        startActivity(i);
    }
    public void shelters(View view){
        Intent i = new Intent(this,shelters.class);
        startActivity(i);
    }
    public void stores(View view){
        Intent i = new Intent(this,stores.class);
        startActivity(i);
    }
    public void restaurants(View view){
        Intent i = new Intent(this,restaurants.class);
        startActivity(i);
    }
    public void other(View view){
        Intent i = new Intent(this,otherpage.class);
        startActivity(i);
    }
}
