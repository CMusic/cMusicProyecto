package com.example.c_musicproducciones.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
     TextView vista2;
    Button botonRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        vista2 = (TextView) findViewById(R.id.view2);
        botonRegresar = (Button) findViewById(R.id.regresar);
        botonRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.regresar) {
            Intent r = new Intent(this,MainActivity.class);
            startActivity(r);
        }

    }
}
