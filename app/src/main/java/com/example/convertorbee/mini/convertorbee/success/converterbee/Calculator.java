package com.example.convertorbee.mini.convertorbee.success.converterbee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class Calculator extends AppCompatActivity {

    private Button button1, button2 , button3 , button4 , button5 , button6 , button7 , button8 , button9 , button0;
    private Button point;
    private TextView text , text2;
    private double first, second;
    private double result;
    private String operation;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        button0 = (Button)  findViewById(R.id.button0);
        button1 = (Button)  findViewById(R.id.button1);
        button2 = (Button)  findViewById(R.id.button2);
        button3 = (Button)  findViewById(R.id.button3);
        button4 = (Button)  findViewById(R.id.button4);
        button5 = (Button)  findViewById(R.id.button5);
        button6 = (Button)  findViewById(R.id.button6);
        button7 = (Button)  findViewById(R.id.button7);
        button8 = (Button)  findViewById(R.id.button8);
        button9 = (Button)  findViewById(R.id.button9);

        Button clear = (Button) findViewById(R.id.clear);
        Button backspace = (Button) findViewById(R.id.backspace);
        Button modulas = (Button) findViewById(R.id.modulas);
        Button devide = (Button) findViewById(R.id.devide);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button add = (Button) findViewById(R.id.add);
        point = (Button)  findViewById(R.id.point);
        Button equals = (Button) findViewById(R.id.equals);


        text = (TextView) findViewById(R.id.text);
        text2 = (TextView) findViewById(R.id.text2);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(null);
                text2.setText(null);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button0.getText().toString();
                text2.setText(texts);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button1.getText().toString();
                text2.setText(texts);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button2.getText().toString();
                text2.setText(texts);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button3.getText().toString();
                text2.setText(texts);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button4.getText().toString();
                text2.setText(texts);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button5.getText().toString();
                text2.setText(texts);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button6.getText().toString();
                text2.setText(texts);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button7.getText().toString();
                text2.setText(texts);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button8.getText().toString();
                text2.setText(texts);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+button9.getText().toString();
                text2.setText(texts);
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texts;
                texts = text2.getText().toString()+point.getText().toString();
                text2.setText(texts);
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String backspace=null;
                if (text2.getText().length()>0)
                {
                    StringBuilder stringBuilder = new StringBuilder(text2.getText());
                    stringBuilder.deleteCharAt(text2.getText().length()-1);
                    backspace = stringBuilder.toString();
                    text2.setText(backspace);
                }

            }
        });

//        operator




        modulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first = Double.parseDouble((String) text2.getText());
                primary = String.format("%.2f",first);
                text.setText(primary);
                text2.setText("");
                operation="%";
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first = Double.parseDouble((String) text2.getText());
                primary = String.format("%.2f",first);
                text.setText(primary);
                text2.setText("");
                operation="-";
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first = Double.parseDouble((String) text2.getText());
                primary = String.format("%.2f",first);
                text.setText(primary);
                text2.setText("");
                operation="+";
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first = Double.parseDouble((String) text2.getText());
                primary = String.format("%.2f",first);
                text.setText(primary);
                text2.setText("");
                operation="*";
            }
        });

        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first = Double.parseDouble((String) text2.getText());
                primary = String.format("%.2f",first);
                text.setText(primary);
                text2.setText("");
                operation="/";
            }
        });

//        equals
        equals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                second = Double.parseDouble((String) text2.getText());
                if (Objects.equals(operation, "+"))
                {
                    result = first+second;
                    answer = String.format("%.2f",result);
                    text2.setText(answer);
                    text.setText(null);
                }
                if (Objects.equals(operation, "-"))
                {
                    result = first-second;
                    answer = String.format("%.2f",result);
                    text2.setText(answer);
                    text.setText(null);
                }
                if (Objects.equals(operation, "*"))
                {
                    result = first*second;
                    answer = String.format("%.2f",result);
                    text2.setText(answer);
                    text.setText(null);
                }
                if (Objects.equals(operation, "%"))
                {
                    result = first%second;
                    answer = String.format("%.2f",result);
                    text2.setText(answer);
                    text.setText(null);
                }
                if (Objects.equals(operation, "/"))
                {
                    result = first/second;
                    answer = String.format("%.2f",result);
                    text2.setText(answer);
                    text.setText(null);
                }
            }
        });



    }
}