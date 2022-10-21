package com.example.convertorbee.mini.convertorbee.success.converterbee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Tempreture extends AppCompatActivity {

    Spinner sp1 , sp2 ;
    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempreture);


        sp1 = (Spinner) findViewById(R.id.from);
        sp2 = (Spinner) findViewById(R.id.to);
        editText = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.output);
        button = (Button) findViewById(R.id.buttion);


        String[] from = {"Celsius C", "Fahrenheit F", "Kelvin K"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = {"Celsius C", "Fahrenheit F", "Kelvin K"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                double Love;
                double amount = Double.parseDouble(editText.getText().toString());

//                celcius
                if (sp1.getSelectedItem().toString().equals("Celsius C") && sp2.getSelectedItem().toString().equals("Celsius C")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                } else if (sp1.getSelectedItem().toString().equals("Celsius C") && sp2.getSelectedItem().toString().equals("Fahrenheit F")) {
                    Love = (amount * 1.8)+32;
                    textView.setText(Double.toString(Love));

                } else if (sp1.getSelectedItem().toString().equals("Celsius C") && sp2.getSelectedItem().toString().equals("Kelvin K")) {
                    Love = amount + 273.15;
                    textView.setText(Double.toString(Love));

                }

//                fehrenhit


                if (sp1.getSelectedItem().toString().equals("Fahrenheit F") && sp2.getSelectedItem().toString().equals("Celsius C")) {
                    Love = (amount-32)*0.5555556;
                    textView.setText(Double.toString(Love));

                } else if (sp1.getSelectedItem().toString().equals("Fahrenheit F") && sp2.getSelectedItem().toString().equals("Fahrenheit F")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                } else if (sp1.getSelectedItem().toString().equals("Fahrenheit F") && sp2.getSelectedItem().toString().equals("Kelvin K")) {
                    Love = (amount-32)*0.5555556 + 273.15;
                    textView.setText(Double.toString(Love));

                }

//                kelvin

                if (sp1.getSelectedItem().toString().equals("Kelvin K") && sp2.getSelectedItem().toString() == "Celsius C") {
                    Love = amount-273.15;
                    textView.setText(Double.toString(Love));

                } else if (sp1.getSelectedItem().toString().equals("Kelvin K") && sp2.getSelectedItem().toString() == "Fahrenheit F") {
                    Love =(amount-273)*1.8 + 32;
                    textView.setText(Double.toString(Love));

                } else if (sp1.getSelectedItem().toString().equals("Kelvin K") && sp2.getSelectedItem().toString() == "Kelvin K") {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
            }
        });


            }
}