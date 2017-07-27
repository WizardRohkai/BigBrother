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
    String sEmail,sPass,sCEmail,sCPass;
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
                sCEmail = getPref("Email", getApplicationContext());
                sCPass = getPref("Pass", getApplicationContext());


//                if ((sEmail.compareToIgnoreCase(sCEmail) != 0) || (sPass.compareTo(sCPass) != 0)) {
//
//                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
//                    builder.setMessage("Wrong email or password." + sCEmail+sEmail+sCPass+sPass);
//                    AlertDialog alert=builder.create();
//                    alert.show();
//                }else{
                    startActivity(new Intent(Login.this, Home.class));
//                }
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
