package com.example.androiddagger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androiddagger.di.infoApplication;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {
    @Inject
    infoClase info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((infoApplication)getApplication()).getInfoComponent().inject(this);
        Toast.makeText(MainActivity.this,info.getTipoInformacion(), Toast.LENGTH_SHORT).show();

    }

    public void ejecutar_info(View view){

        Intent i = new Intent(this, infoClase.class);
        startActivity(i);

    }
}