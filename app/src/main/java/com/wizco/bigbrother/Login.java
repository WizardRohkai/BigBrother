package com.wizco.bigbrother;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button btnLogin;
    String sEmail,sPass;
    EditText eEmail,ePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (Button) findViewById(R.id.Login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eEmail = (EditText) findViewById(R.id.editText);
                sEmail = eEmail.getText().toString();
                ePass = (EditText) findViewById(R.id.editText2);
                sPass = ePass.getText().toString();

            }
        });
    }
}
