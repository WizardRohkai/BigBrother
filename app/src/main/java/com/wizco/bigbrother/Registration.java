package com.wizco.bigbrother;

import android.content.Context;
import android.content.DialogInterface;
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
    EditText edtName;
    String sToets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


       sToets =  getPref("myKey", getApplicationContext());
    }

     public void onClickRegister(View view) {

         edtName = (EditText) findViewById(R.id.edtName);

         putPref("myKey", "mystring", getApplicationContext());

         AlertDialog.Builder builder = new AlertDialog.Builder(this);
         builder.setMessage(sToets);
         AlertDialog alert=builder.create();
         alert.show();
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
