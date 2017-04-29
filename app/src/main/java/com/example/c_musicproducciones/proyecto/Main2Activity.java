package com.example.c_musicproducciones.proyecto;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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



        this.calculadora();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.regresar) {
            Intent r = new Intent(this,Main3Activity.class);
            startActivity(r);


        }

    }


    public void calculadora () {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                 val1 = Integer.parseInt(primer.getText().toString());
                 val2 = Integer.parseInt(segundo.getText().toString());


                int res =0;

                switch (checkedId) {



                    case R.id.btn1:

                        res = val1 + val2;

                        Toast.makeText(getApplicationContext(),"Sumar",Toast.LENGTH_SHORT).show();;
                        break;

                    case R.id.btn2:

                        res = val1 - val2;

                        Toast.makeText(getApplicationContext(),"Restar",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btn3:

                        res= val1 * val2;

                        Toast.makeText(getApplicationContext(),"Multiplicar",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btn4:

                        res = val1 / val2 ;

                        Toast.makeText(getApplicationContext(),"Dividir",Toast.LENGTH_SHORT).show();
                        break;

                    default:

                        break;

                }
                resultado.setText(String.valueOf(res));
            }
        });

    }


    //
}
