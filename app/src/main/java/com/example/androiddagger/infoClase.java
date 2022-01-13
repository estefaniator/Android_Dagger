package com.example.androiddagger;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

public class infoClase extends Activity {

    public String informacion;

    public infoClase(String informacion) {
        this.informacion = informacion;
    }

    public String getTipoInformacion(){
        return ("informacion" + informacion);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
    }
}
