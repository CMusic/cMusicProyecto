package com.example.c_musicproducciones.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView texto1;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.siguiente);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case  R.id.siguiente:
                Intent intent1 =new Intent(this,Main2Activity.class);
                startActivity(intent1);
        }
    }
}
