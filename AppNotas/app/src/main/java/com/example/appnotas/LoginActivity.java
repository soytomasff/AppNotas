package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {

    EditText usuario, password;
    Button login, registrar;

    String user = "admin";
    String pass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = findViewById(R.id.etUsuario);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        registrar = findViewById(R.id.btnRegistrar);

        login.setOnClickListener(v -> {

            String u = usuario.getText().toString();
            String p = password.getText().toString();

            if (u.equals(user) && p.equals(pass)) {

                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);

            } else {

                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();

            }

        });

        registrar.setOnClickListener(v -> {

            Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(i);

        });
    }
}