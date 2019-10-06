package com.isc.proyectobjcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MenuPrinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_prin);


    }public void onClick(View v){
        Intent resident=new Intent(this, ResidentActivity.class);
        startActivity(resident);
        finish();
    }

    public void pantalla2(View v){
        Intent silent=new Intent(this, SilentActivity.class);
        startActivity(silent);
        finish();
    }
    public void pantalla3(View v){
        Intent dead =new Intent(this, DeadActivity.class);
        startActivity(dead);
        finish();
    }
    public void pantalla4(View v){
        Intent outlast=new Intent(this, OutlastActivity.class);
        startActivity(outlast);
        finish();
    }
    public void pantalla5(View v){
        Intent evil=new Intent(this, EvilActivity.class);
        startActivity(evil);
        finish();
    }
    public void pantalla6(View v){
        Intent amnesia=new Intent(this, AmnesiaActivity.class);
        startActivity(amnesia);
        finish();
    }
    public void pantalla7(View v){
        Intent alien=new Intent(this, AlienActivity.class);
        startActivity(alien);
        finish();
    }
    public void pantalla8(View v){
        Intent acerca=new Intent(this, AcercaActivity.class);
        startActivity(acerca);
        finish();
    }
}
