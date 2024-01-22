package com.suhel.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText enterdName;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterdName=findViewById(R.id.editTextName);
        next=findViewById(R.id.buttonNext);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = enterdName.getText().toString();
                if (enterdName.length()==0){
                    Toast.makeText(MainActivity.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this, BirthdayCardActivity.class);
                    intent.putExtra("Name",name);
                    startActivity(intent);
                }
            }
        });
    }
}