package com.example.c_musicproducciones.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto1;
    Button boton1;
    Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.button2);
        boton2 = (Button) findViewById(R.id.button3);


    }
}
