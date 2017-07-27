package com.wizco.bigbrother;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.wizco.bigbrother.Registration.putPref;

public class Karpost extends AppCompatActivity {

    Button btnPost1;
    EditText edtType , edtModel , edtColour , edtExtra , edtRegNum , edtCaseNum1 , edtCaseNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karpost);
        btnPost1 = (Button) findViewById(R.id.btnPost);
        btnPost1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                edtType = (EditText) findViewById(R.id.edtType);
                edtModel = (EditText) findViewById(R.id.edtModel);
                edtColour = (EditText) findViewById(R.id.edtColour);
                edtExtra = (EditText) findViewById(R.id.edtExtra);
                edtRegNum = (EditText) findViewById(R.id.edtRegNum);
                edtCaseNum1 = (EditText) findViewById(R.id.edtCaseNum1);
                edtCaseNum2 =(EditText) findViewById(R.id.edtCasNum2);

                putPref("Type", edtType.getText().toString(), getApplicationContext());
                putPref("Model", edtModel.getText().toString(), getApplicationContext());
                putPref("Colour", edtColour.getText().toString(), getApplicationContext());
                putPref("Extra", edtExtra.getText().toString(), getApplicationContext());
                putPref("RegNum", edtRegNum.getText().toString(), getApplicationContext());
                putPref("CaseNum1", edtCaseNum1.getText().toString(), getApplicationContext());
                putPref("CaseNum2", edtCaseNum2.getText().toString(), getApplicationContext());







                startActivity(new Intent(Karpost.this, Home.class));

            }
        });

    }


}

