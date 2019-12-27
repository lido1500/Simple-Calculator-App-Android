package com.example.tanveersalman.calculator;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvScreen;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
            buttonPlus, buttonMinus, buttonMultiply, buttonEqual, buttonDivide, buttonClear, buttonPoint, buttonDelete,btnNewActivity;
    private double num1, num2;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = 0;
        num2 = 0;
        operation = null;


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        btnNewActivity = (Button)findViewById(R.id.btnNewActivity);


        tvScreen = (TextView)findViewById(R.id.tvScreen);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvScreen.setText(tvScreen.getText() + "0");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvScreen.getText().toString().length()>0){
                    num1 = Double.parseDouble(tvScreen.getText().toString());
                    tvScreen.setText("");
                    operation = "*";
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvScreen.getText().toString().length()>0){
                    num1 = Double.parseDouble(tvScreen.getText().toString());
                    tvScreen.setText("");
                    operation= "+";
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvScreen.getText().toString().length()>0){
                    num1 = Double.parseDouble(tvScreen.getText().toString());
                    tvScreen.setText("");
                    operation="-";
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvScreen.getText().toString().length()>0){
                    num1 = Double.parseDouble(tvScreen.getText().toString());
                    tvScreen.setText("");
                    operation="*";
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText("");
                operation ="/";
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText("");
                num1 = 0;
                num2 = 0;
                operation = "";
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(tvScreen.getText().toString().indexOf('.') >=0)){
                    tvScreen.setText(tvScreen.getText() + ".");
                }
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text =tvScreen.getText().toString();
                String lastnum =Text.substring(Text.length() - 1);
                if (lastnum.equals("."))
                Text=Text.substring(0, Text.length()-1);
                tvScreen.setText(Text);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvScreen.getText().toString().length()>0 && operation != null){
                    num2 = Double.parseDouble(tvScreen.getText().toString());
                    if (operation.equals("+"))
                        tvScreen.setText(num1 + num2 + "");
                    if (operation.equals("-"))
                        tvScreen.setText(num1 - num2 + "");
                    if (operation.equals("*"))
                        tvScreen.setText(num1 * num2 + "");
                    if (operation.equals(("/")))
                        tvScreen.setText(num1 / num2 + "");
                }


                operation = null;
                num1 = 0;
                num2 = 0;
            }
        });
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, NewActivity.class);
                startActivity(n);
               // finish();
            }
        });


    }
}
