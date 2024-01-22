package com.suhel.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BirthdayCardActivity extends AppCompatActivity {

    TextView greeting;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_card);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        greeting=findViewById(R.id.textViewWish);
        image=findViewById(R.id.imageViewImage);

        Intent intent=getIntent();
        String name = intent.getStringExtra("Name");
        greeting.setText("Happy Birthday "+name);

    }
}