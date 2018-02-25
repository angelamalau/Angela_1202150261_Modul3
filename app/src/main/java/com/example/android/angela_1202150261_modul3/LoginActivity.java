package com.example.android.angela_1202150261_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //inisial dengan resource yang didapat dari layout
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        Login    = (Button)   findViewById(R.id.login);

        //eksekusi button login
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userKey = username.getText().toString();
                String passKey = password.getText().toString();

                if (userKey.equals("EAD") && passKey.equals("MOBILE")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent a = new Intent(LoginActivity.this, MainActivity.class);
                    LoginActivity.this.startActivity(a);
                }

                else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Login Gagal").setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}
