package com.example.convertorbee.mini.convertorbee.success.converterbee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    CardView cardView2;
    CardView cardView;
    CardView cardViewtemp;
    CardView cardViewcal;
    CardView cardView3;
    CardView cardViewsp;
    ImageView navbutton;
    RelativeLayout screen;
    CardView navis;
    LinearLayout h, au, cu , ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        cardView2 = findViewById(R.id.cardView2);
        cardView = findViewById(R.id.cardView);
        cardViewtemp = findViewById(R.id.cardViewtemp);
        cardViewcal = findViewById(R.id.cardViewcal);
        cardView3 = findViewById(R.id.cardView3);
        cardViewsp = findViewById(R.id.cardViewsp);
        navbutton = findViewById(R.id.navbutton);
        screen = (RelativeLayout) findViewById(R.id.screen);
        navis = (CardView) findViewById(R.id.navigationbar);
        h = (LinearLayout) findViewById(R.id.h);
        au = (LinearLayout) findViewById(R.id.au);
        cu = (LinearLayout) findViewById(R.id.cu);
        ma = (LinearLayout) findViewById(R.id.ma);


        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Length.class);
                startActivity(intent);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Weight.class);
                startActivity(intent);
            }
        });
        cardViewtemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Tempreture.class);
                startActivity(intent);
            }
        });
        cardViewcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,Calculator.class);
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,DataConverter.class);
                startActivity(intent);
            }
        });
        cardViewsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,SpeedCalculate.class);
                startActivity(intent);
            }
        });

        navbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                screen.animate().translationX(30);
                navis.animate().translationX(0);
            }
        });
        screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    screen.animate().translationX(-535);
                    navis.animate().translationX(-535);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.animate().translationX(-535);
                navis.animate().translationX(-535);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        au.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,AboutUs.class);
                startActivity(intent);
            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Not Available Now", Toast.LENGTH_SHORT).show();
            }
        });
    }
}