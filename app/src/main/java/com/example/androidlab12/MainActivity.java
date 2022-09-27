package com.example.androidlab12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddPart, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bAddPart = (Button) findViewById(R.id.bAddPart);
        bAddPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddPart();
            }
        });

        // Button: show foods
        //
        bShowImages = (Button) findViewById(R.id.bShowPart);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAutopart();
            }
        });

    }

    private void showAddPart(){
        Intent intent = new Intent(MainActivity.this, AddPart.class);
        MainActivity.this.startActivity(intent);
    }

    private void showAutopart(){
        Intent intent = new Intent(MainActivity.this, ShowAutopart.class);
        MainActivity.this.startActivity(intent);
    }
}