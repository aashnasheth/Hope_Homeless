package com.example.hopeforthehomeless.myapplication;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class firstscreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String locationprovider = LocationManager.NETWORK_PROVIDER;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);

        LocationListener loc;
        LocationManager locationManager;
    }


    public void howtohelp(View view){
        Intent i = new Intent(this,howtohelp.class);
        startActivity(i);
    }
    public void findnearby(View view){
        Intent i = new Intent(this,findnearby.class);
        startActivity(i);
    }
}
