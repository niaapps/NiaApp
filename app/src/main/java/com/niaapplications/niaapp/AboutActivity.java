package com.niaapplications.niaapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.net.URL;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        new RetrievePhotoTask((ImageView) findViewById(R.id.abt_img))
                .execute("https://niaapps.github.io/images/about.jpg");
        TextView textBoxOne = findViewById(R.id.about_text);
        TextView textBoxTwo = findViewById(R.id.about_text2);
        TextView textBoxThree = findViewById(R.id.about_text3);
        TextView textBoxFour = findViewById(R.id.about_text4);
        String first ="My name is Nia. I go to CUNY Queens College for a degree in Computer Science. I am from New York. This app was created to serve as a reflection of my website to show what I can do with Android Applications. This app has the same functionality as niaapps.github.io";
        String second ="It is the platform where I take on coding projects so I can do what I love, and support myself! I code Android Apps (iOS is on my horizon though!) and design websites. I also blog here.";
        String third ="You can learn more about my past work here.";
        String fourth = "To understand more about how projects are priced tap here.";
        SpannableString stringOne = new SpannableString(first);
        SpannableString stringTwo = new SpannableString(second);
        SpannableString stringThree = new SpannableString(third);
        SpannableString stringFour = new SpannableString(fourth);
        ClickableSpan stringFirst = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://niaapps.github.io"));
                startActivity(browserIntent);
            }
        };
         ClickableSpan stringSecond = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent myIntent = new Intent(AboutActivity.this, BlogActivity.class);
                AboutActivity.this.startActivity(myIntent);
            }
        };
          ClickableSpan stringThird = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent myIntent = new Intent(AboutActivity.this, PortfolioActivity.class);
                AboutActivity.this.startActivity(myIntent);
            }
        };
           ClickableSpan stringFourth = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent myIntent = new Intent(AboutActivity.this, PricingActivity.class);
                AboutActivity.this.startActivity(myIntent);
            }
        };
        ForegroundColorSpan fcsYellow = new ForegroundColorSpan(getResources().getColor(R.color.light_yellow));


        stringOne.setSpan(fcsYellow,245,263, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringOne.setSpan(stringFirst,246,263,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textBoxOne.setText(stringOne);
        textBoxOne.setMovementMethod(LinkMovementMethod.getInstance());

        stringTwo.setSpan(fcsYellow,180,185, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringTwo.setSpan(stringSecond,180,185, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textBoxTwo.setText(stringTwo);
        textBoxTwo.setMovementMethod(LinkMovementMethod.getInstance());

        stringThree.setSpan(fcsYellow,38,43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringThree.setSpan(stringThird,38,43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textBoxThree.setText(stringThree);
        textBoxThree.setMovementMethod(LinkMovementMethod.getInstance());

        stringFour.setSpan(fcsYellow,53,58, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringFour.setSpan(stringFourth,53,58, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textBoxFour.setText(stringFour);
        textBoxFour.setMovementMethod(LinkMovementMethod.getInstance());

    }


}