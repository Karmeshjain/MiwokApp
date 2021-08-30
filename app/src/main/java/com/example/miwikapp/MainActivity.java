package com.example.miwikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers=(TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView Colors=(TextView)findViewById(R.id.colors);
        Colors.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView family =(TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);
            }
        });

    }

}