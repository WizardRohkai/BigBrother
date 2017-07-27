package com.wizco.bigbrother;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import static com.wizco.bigbrother.Registration.getPref;
public class Profile extends AppCompatActivity {

    TextView eEmail,eAddress,eName,eVan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        eEmail = (TextView) findViewById(R.id.sEmail);
        eName = (TextView) findViewById(R.id.sName);
        eVan = (TextView) findViewById(R.id.sSurname);
        eAddress = (TextView) findViewById(R.id.sAdress);
        eEmail.setText(getPref("Email", getApplicationContext()));
        eVan.setText(getPref("Surname", getApplicationContext()));
        eName.setText(getPref("Name", getApplicationContext()));
        eAddress.setText(getPref("Addrss", getApplicationContext()));

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(new Intent(Profile.this, Home.class));
                    return true;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(Profile.this, Search.class));
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }

    };
}
