package com.niaapplications.niaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button abt, blog, price, port, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abt = (Button) findViewById(R.id.about_button);
        blog = (Button) findViewById(R.id.blog_button);
        contact = (Button) findViewById(R.id.contact_button);
        price = (Button) findViewById(R.id.pricing_button);
        port = (Button) findViewById(R.id.portfolio_button);



        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AboutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, BlogActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ContactActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, PricingActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        port.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, PortfolioActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

    }
}