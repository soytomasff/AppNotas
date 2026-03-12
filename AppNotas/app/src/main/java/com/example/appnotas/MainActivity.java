package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2,n3;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.nota1);
        n2=findViewById(R.id.nota2);
        n3=findViewById(R.id.nota3);
        calcular=findViewById(R.id.calcular);
        resultado=findViewById(R.id.resultado);

        calcular.setOnClickListener(v -> {

            double nota1=Double.parseDouble(n1.getText().toString());
            double nota2=Double.parseDouble(n2.getText().toString());
            double nota3=Double.parseDouble(n3.getText().toString());

            double promedio=(nota1+nota2+nota3)/3;

            if(promedio>=11){

                resultado.setText("Aprobado: "+promedio);

            }else{

                resultado.setText("Desaprobado: "+promedio);

            }

        });

    }
}