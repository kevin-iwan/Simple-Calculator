package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button addition;
    private Button subtraction;
    private Button multiplication;
    private Button division;
    private Button clearAll;
    private EditText firstNumber;
    private EditText secondNumber;
    private EditText answer;
    private TextView showAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition = (Button)findViewById(R.id.btn_add);
        subtraction = (Button)findViewById(R.id.btn_sub);
        multiplication = (Button)findViewById(R.id.btn_mul);
        division = (Button)findViewById(R.id.btn_div);
        clearAll = (Button)findViewById(R.id.btn_clear);
        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        showAnswer = (TextView)findViewById(R.id.showAnswer);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first and second number.", Toast.LENGTH_SHORT).show();
                }
                else if(firstNumber.getText().toString().equals("")&&!secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first number.", Toast.LENGTH_SHORT).show();
                }
                else if(!firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input second number.", Toast.LENGTH_SHORT).show();
                }
                else{
                    firstNumber.getText().toString();
                    secondNumber.getText().toString();
                    double num1 = Double.valueOf(firstNumber.getText().toString());
                    double num2 = Double.valueOf(secondNumber.getText().toString());
                    double result;
                    result = num1 + num2;
                    showAnswer.setText(String.valueOf(result));
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first and second number.", Toast.LENGTH_SHORT).show();
                }
                else if(firstNumber.getText().toString().equals("")&&!secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first number.", Toast.LENGTH_SHORT).show();
                }
                else if(!firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input second number.", Toast.LENGTH_SHORT).show();
                }
                else{
                    firstNumber.getText().toString();
                    secondNumber.getText().toString();
                    double num1 = Double.valueOf(firstNumber.getText().toString());
                    double num2 = Double.valueOf(secondNumber.getText().toString());
                    double result;
                    result = num1 - num2;
                    showAnswer.setText(String.valueOf(result));
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first and second number.", Toast.LENGTH_SHORT).show();
                }
                else if(firstNumber.getText().toString().equals("")&&!secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first number.", Toast.LENGTH_SHORT).show();
                }
                else if(!firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input second number.", Toast.LENGTH_SHORT).show();
                }
                else{
                    firstNumber.getText().toString();
                    secondNumber.getText().toString();
                    double num1 = Double.valueOf(firstNumber.getText().toString());
                    double num2 = Double.valueOf(secondNumber.getText().toString());
                    double result;
                    result = num1 * num2;
                    showAnswer.setText(String.valueOf(result));
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first and second number.", Toast.LENGTH_SHORT).show();
                }
                else if(firstNumber.getText().toString().equals("")&&!secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input first number.", Toast.LENGTH_SHORT).show();
                }
                else if(!firstNumber.getText().toString().equals("")&&secondNumber.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please input second number.", Toast.LENGTH_SHORT).show();
                }
                else if(!firstNumber.getText().toString().equals("") && secondNumber.getText().toString().equals("0")){
                    showAnswer.setText("ERROR : Cannot divide by 0");
                }
                else{
                    firstNumber.getText().toString();
                    secondNumber.getText().toString();
                    double num1 = Double.valueOf(firstNumber.getText().toString());
                    double num2 = Double.valueOf(secondNumber.getText().toString());
                    double result;
                    result = num1 / num2;
                    showAnswer.setText(String.valueOf(result));
                }
            }
        });

        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber.setText(null);
                secondNumber.setText(null);
                showAnswer.setText(null);
            }
        });

    }
}
