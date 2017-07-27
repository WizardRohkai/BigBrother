package com.wizco.bigbrother;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.wizco.bigbrother.Registration.getPref;

public class Login extends AppCompatActivity {

    Button btnLogin;
    Button btnReg;
    String sEmail,sPass;
    EditText eEmail,ePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (Button) findViewById(R.id.Login);
<<<<<<< HEAD
=======


>>>>>>> a687ae16127ceb3e24ba94407a9429fe71083c9a
        btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                eEmail = (EditText) findViewById(R.id.editText);
                sEmail = eEmail.getText().toString();
                ePass = (EditText) findViewById(R.id.editText2);
                sPass = ePass.getText().toString();


                if (sEmail == getPref("Email", getApplicationContext()) && sPass == getPref("Pass", getApplicationContext()) ) {
                    startActivity(new Intent(Login.this, Home.class));
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                    builder.setMessage("Wrong email or password.");
                    AlertDialog alert=builder.create();
                    alert.show();
                }

            }
        });
        btnReg = (Button) findViewById(R.id.btnLogToReg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Registration.class));
            }
        });
    }
}
