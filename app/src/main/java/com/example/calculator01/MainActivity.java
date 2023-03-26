package com.example.calculator01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonC, buttonSum, buttonExt, buttonX, buttonEqual,buttonDiv,
            buttonDot, buttonText1, buttonText2;
    TextView textResult, text1, text2;

    int t = 1;
    double ans = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonSum = findViewById(R.id.buttonSum);
        buttonExt = findViewById(R.id.buttonExt);
        buttonX =  findViewById(R.id.buttonX);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonDot = findViewById(R.id.buttonDot);
        buttonText1 = findViewById(R.id.buttonText1);
        buttonText2 = findViewById(R.id.buttonText2);
        text1= findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        textResult = findViewById(R.id.textResult);

        buttonText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = 1;
            }
        });

        buttonText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = 2;
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + ".");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + ".");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "1");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "2");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "3");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "4");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "5");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "6");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "7");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "8");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "9");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t == 1) {
                    text1.setText(text1.getText().toString() + "0");
                }
                if (t == 2)
                    text2.setText(text2.getText().toString() + "0");
            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                ans = a +b;
            }
        });
        buttonExt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                ans = a - b;
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                ans = a/b;
            }
        });

        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(text1.getText().toString());
                double b = Double.parseDouble(text2.getText().toString());
                ans = a*b;
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                text2.setText("");
                textResult.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = String.valueOf(ans);
                textResult.setText(ans1);
                ans= 0;
            }
        });


    }


}