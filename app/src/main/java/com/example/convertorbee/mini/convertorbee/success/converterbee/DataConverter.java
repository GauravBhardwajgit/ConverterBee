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
import android.widget.Toast;

public class DataConverter extends AppCompatActivity {


    Spinner sp1 , sp2 ;
    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_converter);

        sp1 = (Spinner) findViewById(R.id.from);
        sp2 = (Spinner) findViewById(R.id.to);
        editText = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.output);
        button = (Button) findViewById(R.id.buttion);

        String[] from = {"Byte B","Kilobyte KB","Megabyte MB","Gigabyte GB","Terabyte TB","Petabyte PB"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Byte B","Kilobyte KB","Megabyte MB","Gigabyte GB","Terabyte TB","Petabyte PB"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);



        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                double Love;
                double amount = Double.parseDouble(editText.getText().toString());

                if (sp1.getSelectedItem().toString().equals("Byte B") && sp2.getSelectedItem().toString().equals("Byte B"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Byte B") && sp2.getSelectedItem().toString().equals("Kilobyte KB"))
                {
                    Love = amount/1024;
                    textView.setText(Double.toString(Love));
                }
                else if (sp1.getSelectedItem().toString().equals("Byte B") && sp2.getSelectedItem().toString().equals("Megabyte MB"))
                {
                    Love = (amount/1024)/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Byte B") && sp2.getSelectedItem().toString().equals("Gigabyte GB"))
                {
                    Love = ((amount/1024)/1024)/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Byte B") && sp2.getSelectedItem().toString().equals("Terabyte TB"))
                {
                    Love = (((amount/1024)/1024)/1024)/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Byte B") && sp2.getSelectedItem().toString().equals("Petabyte PB"))
                {
                    Love = ((((amount/1024)/1024)/1024)/1024)/1024;
                    textView.setText(Double.toString(Love));

                }


//                Kilobyte
                else if (sp1.getSelectedItem().toString().equals("Kilobyte KB") && sp2.getSelectedItem().toString().equals("Byte B"))
                {
                    Love = amount*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilobyte KB") && sp2.getSelectedItem().toString().equals("Kilobyte KB"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilobyte KB") && sp2.getSelectedItem().toString().equals("Megabyte MB"))
                {
                    Love = amount/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilobyte KB") && sp2.getSelectedItem().toString().equals("Gigabyte GB"))
                {
                    Love = (amount/1024)/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilobyte KB") && sp2.getSelectedItem().toString().equals("Terabyte TB"))
                {
                    Love = ((amount/1024)/1024)/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Kilobyte KB") && sp2.getSelectedItem().toString().equals("Petabyte PB"))
                {
                    Love = (((amount/1024)/1024)/1024)/1024;
                    textView.setText(Double.toString(Love));

                }

//                megabyte

                else if (sp1.getSelectedItem().toString().equals("Megabyte MB") && sp2.getSelectedItem().toString().equals("Byte B"))
                {
                    Love = amount*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Megabyte MB") && sp2.getSelectedItem().toString().equals("Kilobyte KB"))
                {
                    Love = amount*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Megabyte MB") && sp2.getSelectedItem().toString().equals("Megabyte MB"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Megabyte MB") && sp2.getSelectedItem().toString().equals("Gigabyte GB"))
                {
                    Love = amount/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Megabyte MB") && sp2.getSelectedItem().toString().equals("Terabyte TB"))
                {
                    Love = (amount/1024)/1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Megabyte MB") && sp2.getSelectedItem().toString().equals("Petabyte PB"))
                {
                    Love = ((amount/1024)/1024)/1024;
                    textView.setText(Double.toString(Love));

                }

//                gigabyte
                else if (sp1.getSelectedItem().toString().equals("Gigabyte GB") && sp2.getSelectedItem().toString().equals("Byte B"))
                {
                    Love = amount*1024*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Gigabyte GB") && sp2.getSelectedItem().toString().equals("Kilobyte KB"))
                {
                    Love = amount*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Gigabyte GB") && sp2.getSelectedItem().toString().equals("Megabyte MB"))
                {
                    Love = amount*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Gigabyte GB") && sp2.getSelectedItem().toString().equals("Gigabyte GB"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Gigabyte GB") && sp2.getSelectedItem().toString().equals("Terabyte TB"))
                {
                    Love = (amount/1024);
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Gigabyte GB") && sp2.getSelectedItem().toString().equals("Petabyte PB"))
                {
                    Love = ((amount/1024)/1024);
                    textView.setText(Double.toString(Love));

                }

//                TERAVYTE
                else if (sp1.getSelectedItem().toString().equals("Terabyte TB") && sp2.getSelectedItem().toString().equals("Byte B"))
                {
                    Love = amount*1024*1024*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Terabyte TB") && sp2.getSelectedItem().toString().equals("Kilobyte KB"))
                {
                    Love = amount*1024*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Terabyte TB") && sp2.getSelectedItem().toString().equals("Megabyte MB"))
                {
                    Love = amount*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Terabyte TB") && sp2.getSelectedItem().toString().equals("Gigabyte GB"))
                {
                    Love = amount*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Terabyte TB") && sp2.getSelectedItem().toString().equals("Terabyte TB"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Terabyte TB") && sp2.getSelectedItem().toString().equals("Petabyte PB"))
                {
                    Love = amount/1024;
                    textView.setText(Double.toString(Love));

                }

//                petabyte
                else if (sp1.getSelectedItem().toString().equals("Petabyte PB") && sp2.getSelectedItem().toString().equals("Byte B"))
                {
                    Love = amount*1073741824*1024*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Petabyte PB") && sp2.getSelectedItem().toString().equals("Kilobyte KB"))
                {
                    Love = amount*1073741824*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Petabyte PB") && sp2.getSelectedItem().toString().equals("Megabyte MB"))
                {
                    Love = amount*1073741824;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Petabyte PB") && sp2.getSelectedItem().toString().equals("Gigabyte GB"))
                {
                    Love = amount* 1048576;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Petabyte PB") && sp2.getSelectedItem().toString().equals("Terabyte TB"))
                {
                    Love = amount*1024;
                    textView.setText(Double.toString(Love));

                }
                else if (sp1.getSelectedItem().toString().equals("Petabyte PB") && sp2.getSelectedItem().toString().equals("Petabyte PB"))
                {
                    Love = amount;
                    textView.setText(Double.toString(Love));

                }
            }
        });


            }
}