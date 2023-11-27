package com.example.hellomockito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupMockito();
    }

    public void setupMockito() {
        Person person = new Person();
        String personName = person.getPersonName();
        Log.d("personName", personName);
    }
}