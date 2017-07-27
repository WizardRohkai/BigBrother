package com.wizco.bigbrother;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


public class Registration extends AppCompatActivity {
    SharedPreferences userInfo;
    SharedPreferences.Editor editor;
    EditText edtName , edtEmail , edtSurname,edtPass,edtAddrss;
    String sToets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

     public void onClickRegister(View view) {

         edtName = (EditText) findViewById(R.id.edtName);
         edtSurname = (EditText) findViewById(R.id.edtVan);
         edtEmail = (EditText) findViewById(R.id.edtEmail);
         edtPass = (EditText) findViewById(R.id.edtPassword);
         edtAddrss = (EditText) findViewById(R.id.edtAdress);

         putPref("Name", edtName.getText().toString(), getApplicationContext());
         putPref("Email", edtEmail.getText().toString(), getApplicationContext());
         putPref("Pass", edtPass.getText().toString(), getApplicationContext());
         putPref("Surname", edtSurname.getText().toString(), getApplicationContext());
         putPref("Addrss", edtAddrss.getText().toString(), getApplicationContext());
      /*
         AlertDialog.Builder builder = new AlertDialog.Builder(this);
         builder.setMessage(getPref("Name", getApplicationContext()));
         AlertDialog alert=builder.create();
         alert.show();  */
        Intent intent = new Intent(this, Home.class);
         startActivity(intent);
    }
    public static void putPref(String key, String value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getPref(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, null);
    }
}
