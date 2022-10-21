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

public class SpeedCalculate extends AppCompatActivity {

    private Spinner sp1 , sp2 ;
    private EditText editText;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_calculate);


        sp1 = (Spinner) findViewById(R.id.from);
        sp2 = (Spinner) findViewById(R.id.to);
        editText = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.output);
        Button button = (Button) findViewById(R.id.buttion);


        String[] from = {"Second s","Minute min","Hour h","Day d"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Second s","Minute min","Hour h","Day d"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                double Love;
                double amount = Double.parseDouble(editText.getText().toString());


//                seconds
                if (sp1.getSelectedItem().toString().equals("Second s") && sp2.getSelectedItem().toString().equals("Second s"))
                {
                    Love = amount;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Second s") && sp2.getSelectedItem().toString().equals("Minute min"))
                {
                    Love = amount/60;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Second s") && sp2.getSelectedItem().toString().equals("Hour h"))
                {
                    Love = (amount/60)/60;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Second s") && sp2.getSelectedItem().toString().equals("Day d"))
                {
                    Love = ((amount/60)/60)/24;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }

//                minutes
                else if (sp1.getSelectedItem().toString().equals("Minute min") && sp2.getSelectedItem().toString().equals("Second s"))
                {
                    Love = amount*60;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Minute min") && sp2.getSelectedItem().toString().equals("Minute min"))
                {
                    Love = amount;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Minute min") && sp2.getSelectedItem().toString().equals("Hour h"))
                {
                    Love = amount/60;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Minute min") && sp2.getSelectedItem().toString().equals("Day d"))
                {
                    Love = (amount/60)/24;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }

//              hours
                else if (sp1.getSelectedItem().toString().equals("Hour h") && sp2.getSelectedItem().toString().equals("Second s"))
                {
                    Love = amount*60*60;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Hour h") && sp2.getSelectedItem().toString().equals("Minute min"))
                {
                    Love = amount*60;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Hour h") && sp2.getSelectedItem().toString().equals("Hour h"))
                {
                    Love = amount*1;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Hour h") && sp2.getSelectedItem().toString().equals("Day d"))
                {
                    Love = amount/24;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                //              hours
                else if (sp1.getSelectedItem().toString().equals("Day d") && sp2.getSelectedItem().toString().equals("Second s"))
                {
                    Love = amount*60*60*24;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Day d") && sp2.getSelectedItem().toString().equals("Minute min"))
                {
                    Love = amount*24*60;
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Day d") && sp2.getSelectedItem().toString().equals("Hour h"))
                {
                    Love = amount*24;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
                else if (sp1.getSelectedItem().toString().equals("Day d") && sp2.getSelectedItem().toString().equals("Day d"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));
//                    Toast.makeText(Length.this, Love.toString(), Toast.LENGTH_SHORT).show();
                }
            }
//        }
    });

//                foot
            }
}