package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class RegisterActivity extends AppCompatActivity {

    EditText user,pass;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user=findViewById(R.id.newUser);
        pass=findViewById(R.id.newPass);
        guardar=findViewById(R.id.btnGuardar);

        guardar.setOnClickListener(v -> {

            Toast.makeText(this,"Usuario creado",Toast.LENGTH_SHORT).show();
            finish();

        });

    }
}