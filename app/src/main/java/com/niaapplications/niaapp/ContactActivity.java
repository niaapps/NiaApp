package com.niaapplications.niaapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        EditText name = findViewById(R.id.name_box);
        EditText email = findViewById(R.id.email_box);
        EditText msg = findViewById(R.id.msg);
    }
}