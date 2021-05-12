package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_calcular;
    EditText precoCarro, distribuidoraPrec, impostoPerc;
    TextView lbl_Distribuidora, lbl_Imposto, lbl_precoTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------------EditText----------------------------------
        precoCarro = findViewById(R.id.precoFabrica);
        distribuidoraPrec = findViewById(R.id.distribuidorPerc);
        impostoPerc = findViewById(R.id.impostoPerc);
        //------------TextView----------------------------------
        lbl_Distribuidora = findViewById(R.id.lbl_distribuidor);
        lbl_Imposto = findViewById(R.id.lbl_imposto);
        lbl_precoTotal = findViewById(R.id.lbl_precoTotal);
        //-------------Button-----------------------------------
        btn_calcular = findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //------Receber todos os valores da EditText-----------
                double preco = Double.parseDouble(precoCarro.getText().toString());
                int percDistribuidora = Integer.parseInt(distribuidoraPrec.getText().toString());
                int percImposto = Integer.parseInt(impostoPerc.getText().toString());
                //-----------------------------------------------------
                double _distribuidora = (preco * percDistribuidora) / 100;
                double _imposto = (preco *  percImposto) / 100;
                double _precoTotal = preco + _distribuidora + _imposto;
                lbl_Distribuidora.setText(String.valueOf(_distribuidora));
                lbl_Imposto.setText(String.valueOf(_imposto));
                lbl_precoTotal.setText(String.valueOf(_precoTotal));
            }
        });

    }
}