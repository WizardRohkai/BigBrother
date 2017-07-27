package com.wizco.bigbrother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.wizco.bigbrother.Registration.putPref;

public class MensPost extends AppCompatActivity {

    Button btnPost2;
    EditText edtShirt , edtPants , edtOverall , edtHat , edtShoes , edtMCase1 , edtMCase2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_post);
        btnPost2 = (Button) findViewById(R.id.btnPost2);
        btnPost2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtShirt = (EditText) findViewById(R.id.edtShirt);
                edtPants = (EditText) findViewById(R.id.edtPants);
                edtOverall = (EditText) findViewById(R.id.edtOverall);
                edtHat = (EditText) findViewById(R.id.edtHat);
                edtShoes = (EditText) findViewById(R.id.edtShoes);
                edtMCase1 = (EditText) findViewById(R.id.edtMCase1);
                edtMCase2 =(EditText) findViewById(R.id.edtMCase2);

                putPref("Shirt", edtShirt.getText().toString(), getApplicationContext());
                putPref("Pants", edtPants.getText().toString(), getApplicationContext());
                putPref("Overall", edtOverall.getText().toString(), getApplicationContext());
                putPref("Hat", edtHat.getText().toString(), getApplicationContext());
                putPref("Shoes", edtShoes.getText().toString(), getApplicationContext());
                putPref("MCase1", edtMCase1.getText().toString(), getApplicationContext());
                putPref("MCase2", edtMCase2.getText().toString(), getApplicationContext());

                startActivity(new Intent(MensPost.this, Home.class));

            }
        });


    }
}
