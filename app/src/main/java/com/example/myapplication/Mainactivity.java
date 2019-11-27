package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class Mainactivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        LinearLayout now = findViewById(R.id.choose);
        //set two button
        Button editMine = findViewById(R.id.editOwn);
        Button search = findViewById(R.id.search);
        //set two intent
        final Intent intent1 = new Intent(this, OwnSigniture.class);
        final Intent intent2 = new Intent(this, OtherPeople.class);
        //two click listener
        editMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(intent1);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                startActivity(intent2);
            }
        });


    }
    public void editMySelf() {

    }

    public void searchOthers() {

    }
}
