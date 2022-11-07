package com.example.pinterfaces;

import androidx.annotation.FloatRange;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    Float numero1;
    Float numero2;
    int operaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado=findViewById(R.id.tvResultado);
        getSupportActionBar().hide();
        //tvResultado.setText
    }

    public void acResultado(View view) {
    tvResultado.setText("0");
    numero1=0.0f;
    numero2=0.0f;
    }

    public void masMenos(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());{
            if(numero1>0.0f){
                numero1=numero1-(numero1*2);

            } else {
                numero1=numero1+(numero1*2);
            }
            tvResultado.setText(numero1.toString());
        }
    }

    public void porcentaje(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        numero1=numero1*100;
        tvResultado.setText(numero1.toString());
    }

    public void escribir2(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("2");
        } else {
            tvResultado.setText(tvResultado.getText()+"2");
        }
    }

    public void escribir1(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("1");
        } else {
            tvResultado.setText(tvResultado.getText()+"1");
        }
    }

    public void escribir4(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("4");
        } else {
            tvResultado.setText(tvResultado.getText()+"4");
        }
    }

    public void escribir3(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("3");
        } else {
            tvResultado.setText(tvResultado.getText()+"3");
        }}

    public void escribir5(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("5");
        } else {
            tvResultado.setText(tvResultado.getText()+"5");
        }
    }
    public void escribir6(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("6");
        } else {
            tvResultado.setText(tvResultado.getText()+"6");
        }
    }

    public void escribir7(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("7");
        } else {
            tvResultado.setText(tvResultado.getText()+"7");
        }
    }

    public void escribir8(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("8");
        } else {
            tvResultado.setText(tvResultado.getText()+"8");
        }
    }

    public void escribir9(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("9");
        } else {
            tvResultado.setText(tvResultado.getText()+"9");
        }
    }
    public void resta(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        operaciones=1;
        tvResultado.setText("0");
    }
    public void suma(View view) {
    numero1=Float.parseFloat(tvResultado.getText().toString());
    operaciones=2;
    tvResultado.setText("0");
    }
    public void multiplicacion(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        operaciones=3;
        tvResultado.setText("0");
    }
    public void division(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        operaciones=4;
        tvResultado.setText("0");
    }
    public void escribir0(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("0");
        } else {
            tvResultado.setText(tvResultado.getText()+"0");
        }
    }

    public void escribirComa(View view) {
        numero1=Float.parseFloat(tvResultado.getText().toString());
        if (numero1==0.0f){
            tvResultado.setText("0");
        } else {
            tvResultado.setText(tvResultado.getText()+".");
        }
    }

    public void igual(View view) {
        numero2=Float.parseFloat(tvResultado.getText().toString());
        switch (operaciones) {
            case (4):
                if (numero2 == 0.0f) {
                    tvResultado.setText("0");
                    Toast.makeText(this, "Operación no valida", Toast.LENGTH_SHORT).show();
                } else {
                    float result = numero1 / numero2;
                    tvResultado.setText(result + "");
                }
                break;
            case (3):
                if (numero2 == 0.0f) {
                    tvResultado.setText("0");
                } else {
                    float result = numero1*numero2;
                    tvResultado.setText(result + "");
                }
                break;
            case (2):
            if (numero2 == 0.0f) {
                tvResultado.setText(numero1.toString());
            } else {
                float result = numero1-numero2;
                tvResultado.setText(result + "");
            }
            break;
            case (1):
                if (numero2 == 0.0f) {
                    tvResultado.setText(numero1.toString());
                } else {
                    float result = numero1+numero2;
                    tvResultado.setText(result + "");
                }
                break;
        }

        }


}