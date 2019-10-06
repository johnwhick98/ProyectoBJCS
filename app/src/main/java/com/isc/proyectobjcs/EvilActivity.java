package com.isc.proyectobjcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EvilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evil);
    }
    public void atras(View v){
        Intent menu=new Intent(this, MenuPrinActivity.class);
        startActivity(menu);
        finish();
    }
}
