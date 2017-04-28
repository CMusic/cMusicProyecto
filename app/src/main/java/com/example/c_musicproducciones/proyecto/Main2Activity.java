package com.example.c_musicproducciones.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
     TextView vista1;
     TextView vista2;
     EditText primer, segundo;
        int val1, val2;

    RadioGroup radioGroup;
    TextView respuesta;
    TextView resultado;

    Button botonRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        vista1 = (TextView) findViewById(R.id.view1);
        vista2 = (TextView) findViewById(R.id.view2);

        primer = (EditText) findViewById(R.id.editText);
        segundo = (EditText) findViewById(R.id.editText2);

        radioGroup =(RadioGroup) findViewById(R.id.grupo);

        respuesta = (TextView) findViewById(R.id.textView2);

        resultado =(TextView) findViewById(R.id.textView4);

        //
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



    //
}
