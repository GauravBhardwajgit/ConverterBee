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

public class Weight extends AppCompatActivity {


    Spinner sp1 , sp2 ;
    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);


        sp1 = (Spinner) findViewById(R.id.from);
        sp2 = (Spinner) findViewById(R.id.to);
        editText = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.output);
        button = (Button) findViewById(R.id.buttion);


        String[] from = {"Tonne t", "Quintal q", "Kilogram kg", "Gram g", "Milligram mg"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = {"Tonne t", "Quintal q", "Kilogram kg", "Gram g", "Milligram mg"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                double Love;
                double amount = Double.parseDouble(editText.getText().toString());

                if (sp1.getSelectedItem().toString() == "Tonne t" && sp2.getSelectedItem().toString().equals("Tonne t")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString() == "Tonne t" && sp2.getSelectedItem().toString().equals("Quintal q")) {
                    Love = amount * 10;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString() == "Tonne t" && sp2.getSelectedItem().toString().equals("Kilogram kg")) {
                    Love = amount * 1000;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString() == "Tonne t" && sp2.getSelectedItem().toString().equals("Gram g")) {
                    Love = amount * 1000000;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString() == "Tonne t" && sp2.getSelectedItem().toString().equals("Milligram mg")) {
                    Love = amount * 1000000000;
                    textView.setText(Double.toString(Love));
                }

//                quintal


                else if (sp1.getSelectedItem().toString().equals("Quintal q") && sp2.getSelectedItem().toString().equals("Tonne t")) {
                    Love = amount*0.1;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Quintal q") && sp2.getSelectedItem().toString().equals("Quintal q")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Quintal q") && sp2.getSelectedItem().toString().equals("Kilogram kg")) {
                    Love = amount * 100;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Quintal q") && sp2.getSelectedItem().toString().equals("Gram g")) {
                    Love = amount * 100000;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Quintal q") && sp2.getSelectedItem().toString().equals("Milligram mg")) {
                    Love = amount * 100000000;
                    textView.setText(Double.toString(Love));
                }

//                kilogram

                else if (sp1.getSelectedItem().toString().equals("Kilogram kg") && sp2.getSelectedItem().toString().equals("Tonne t")) {
                    Love = amount*0.001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Kilogram kg") && sp2.getSelectedItem().toString().equals("Quintal q")) {
                    Love = amount * 0.01;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Kilogram kg") && sp2.getSelectedItem().toString().equals("Kilogram kg")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Kilogram kg") && sp2.getSelectedItem().toString().equals("Gram g")) {
                    Love = amount * 1000;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Kilogram kg") && sp2.getSelectedItem().toString().equals("Milligram mg")) {
                    Love = amount * 1000000;
                    textView.setText(Double.toString(Love));
                }

//                gramm

                else if (sp1.getSelectedItem().toString().equals("Gram g") && sp2.getSelectedItem().toString().equals("Tonne t")) {
                    Love = amount*0.000001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Gram g") && sp2.getSelectedItem().toString().equals("Quintal q")) {
                    Love = amount * 0.00001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Gram g") && sp2.getSelectedItem().toString().equals("Kilogram kg")) {
                    Love = amount * 0.001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Gram g") && sp2.getSelectedItem().toString().equals("Gram g")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Gram g") && sp2.getSelectedItem().toString().equals("Milligram mg")) {
                    Love = amount * 1000;
                    textView.setText(Double.toString(Love));
                }

//                milligrmam

                else if (sp1.getSelectedItem().toString().equals("Milligram mg") && sp2.getSelectedItem().toString().equals("Tonne t")) {
                    Love = amount*0.000000001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Milligram mg") && sp2.getSelectedItem().toString().equals("Quintal q")) {
                    Love = amount * 0.00000001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Milligram mg") && sp2.getSelectedItem().toString().equals("Kilogram kg")) {
                    Love = amount * 0.000001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Milligram mg") && sp2.getSelectedItem().toString().equals("Gram g")) {
                    Love = amount * 0.001;
                    textView.setText(Double.toString(Love));
                } else if (sp1.getSelectedItem().toString().equals("Milligram mg") && sp2.getSelectedItem().toString().equals("Milligram mg")) {
                    Love = amount;
                    textView.setText(Double.toString(Love));
                }


            }
        });
    }
}