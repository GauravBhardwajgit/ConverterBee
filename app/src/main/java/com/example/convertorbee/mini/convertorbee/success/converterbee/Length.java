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

public class Length extends AppCompatActivity {

    private Spinner sp1 , sp2 ;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        sp1 = (Spinner) findViewById(R.id.from);
        sp2 = (Spinner) findViewById(R.id.to);
        editText = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.output);
        Button button = (Button) findViewById(R.id.buttion);


        String[] from = {"Inch in","Foot ft","Centimeter cm","Decimeter dm","Meter m","Kilometer km"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Inch in","Foot ft","Centimeter cm","Decimeter dm","Meter m","Kilometer km"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                double Love;
                double amount = Double.parseDouble(editText.getText().toString());

                if (sp1.getSelectedItem().toString().equals("Inch in") && sp2.getSelectedItem().toString().equals("Inch in"))
                {
                    Love = amount;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Inch in") && sp2.getSelectedItem().toString().equals("Foot ft"))
                {
                    Love = amount*0.083333333;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Inch in") && sp2.getSelectedItem().toString().equals("Centimeter cm"))
                {
                    Love = amount*2.54;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Inch in") && sp2.getSelectedItem().toString().equals("Decimeter dm"))
                {
                    Love = amount*0.254;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Inch in") && sp2.getSelectedItem().toString().equals("Meter m"))
                {
                    Love = amount*0.0254;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Inch in") && sp2.getSelectedItem().toString().equals("Kilometer km"))
                {
                    Love = amount*0.0000254;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }


//                foot


                else if (sp1.getSelectedItem().toString().equals("Foot ft") && sp2.getSelectedItem().toString().equals("Inch in"))
                {
                    Love = amount*12;
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Foot ft") && sp2.getSelectedItem().toString().equals("Foot ft"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Foot ft") && sp2.getSelectedItem().toString().equals("Centimeter cm"))
                {
                    Love = amount*30.48;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Foot ft") && sp2.getSelectedItem().toString().equals("Decimeter dm"))
                {
                    Love = amount*3.048;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Foot ft") && sp2.getSelectedItem().toString().equals("Meter m"))
                {
                    Love = amount*0.3048;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Foot ft") && sp2.getSelectedItem().toString().equals("Kilometer km"))
                {
                    Love = amount*0.0003048;
                    textView.setText(Double.toString(Love));

                }


//                centemeter cm


                else if (sp1.getSelectedItem().toString().equals("Centimeter cm") && sp2.getSelectedItem().toString().equals("Inch in"))
                {
                    Love = amount*0.393700787;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Centimeter cm") && sp2.getSelectedItem().toString().equals("Foot ft"))
                {
                    Love = amount*0.032808399;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Centimeter cm") && sp2.getSelectedItem().toString().equals("Centimeter cm"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Centimeter cm") && sp2.getSelectedItem().toString().equals("Decimeter dm"))
                {
                    Love = amount*0.1;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Centimeter cm") && sp2.getSelectedItem().toString().equals("Meter m"))
                {
                    Love = amount*0.01;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Centimeter cm") && sp2.getSelectedItem().toString().equals("Kilometer km"))
                {
                    Love = amount*0.00001;
                    textView.setText(Double.toString(Love));

                }




//                decimeter cm


                else if (sp1.getSelectedItem().toString().equals("Decimeter dm") && sp2.getSelectedItem().toString().equals("Inch in"))
                {
                    Love = amount*3.93700787;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Decimeter dm") && sp2.getSelectedItem().toString().equals("Foot ft"))
                {
                    Love = amount*0.32808399;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Decimeter dm") && sp2.getSelectedItem().toString().equals("Centimeter cm"))
                {
                    Love = amount*10;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Decimeter dm") && sp2.getSelectedItem().toString().equals("Decimeter dm"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Decimeter dm") && sp2.getSelectedItem().toString().equals("Meter m"))
                {
                    Love = amount*0.1;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Decimeter dm") && sp2.getSelectedItem().toString().equals("Kilometer km"))
                {
                    Love = amount*0.0001;
                    textView.setText(Double.toString(Love));

                }







//                decimeter cm


                else if (sp1.getSelectedItem().toString().equals("Meter m") && sp2.getSelectedItem().toString().equals("Inch in"))
                {
                    Love = amount*39.3700787;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Meter m") && sp2.getSelectedItem().toString().equals("Foot ft"))
                {
                    Love = amount*3.2808399;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Meter m") && sp2.getSelectedItem().toString().equals("Centimeter cm"))
                {
                    Love = amount*100;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Meter m") && sp2.getSelectedItem().toString().equals("Decimeter dm"))
                {
                    Love = amount*10;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Meter m") && sp2.getSelectedItem().toString().equals("Meter m"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Meter m") && sp2.getSelectedItem().toString().equals("Kilometer km"))
                {
                    Love = amount*0.001;
                    textView.setText(Double.toString(Love));

                }






//                Meter m


                else if (sp1.getSelectedItem().toString().equals("Kilometer km") && sp2.getSelectedItem().toString().equals("Inch in"))
                {
                    Love = amount*39370.0787;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilometer km") && sp2.getSelectedItem().toString().equals("Foot ft"))
                {
                    Love = amount*3280.8399;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilometer km") && sp2.getSelectedItem().toString().equals("Centimeter cm"))
                {
                    Love = amount*100000;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilometer km") && sp2.getSelectedItem().toString().equals("Decimeter dm"))
                {
                    Love = amount*10000;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilometer km") && sp2.getSelectedItem().toString().equals("Meter m"))
                {
                    Love = amount*1000;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilometer km") && sp2.getSelectedItem().toString().equals("Kilometer km"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
            }
        });


    }
}