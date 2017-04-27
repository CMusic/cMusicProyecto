package com.example.c_musicproducciones.proyecto;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView texto1;
    Button boton1;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = (TextView) findViewById(R.id.view1);
        boton1 = (Button) findViewById(R.id.siguiente);
        boton1.setOnClickListener(this);

        radioGroup = (RadioGroup)findViewById(R.id.radiog);
        this.radios();
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


   public void radios ()
   {
       radioGroup.setOnClickListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {


               switch (checkedId)
               {
                   case R.id.rbtn1:

                   Toast.makeText(getApplicationContext(),"Preproduccion",Toast.LENGTH_SHORT).show();
                       return;
                   case R.id.rbtn2:

                       Toast.makeText(getApplicationContext(),"Produccion",Toast.LENGTH_SHORT).show();
                       return;

                   case R.id.rbtn3:


                       Toast.makeText(getApplicationContext(),"Postproduccion",Toast.LENGTH_SHORT).show();
                       return;

                   default:
                       break;
               }



           }
       });

   }
   //
}
