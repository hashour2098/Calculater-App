package com.example.sunshine.calculaterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView show_tv;
    Button  zero_btn, one_btn, two_btn, three_btn, four_btn, five_btn, six_btn, seven_btn, eight_btn, nine_btn,
            plus_btn,  minus_btn, multiply_btn, divide_btn, equal_btn;

    Button[] numbersBtn;
    String wholeNumber = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findLayoutElements();



        for (int i = 0; i < numbersBtn.length; i++)
        {
            final int j = i;
            numbersBtn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    wholeNumber +=  j + "";
                    whatIPrintInTextView(wholeNumber);
                }
            });
        }

//        whatIPrintInTextView(wholeNumber);

    }

    private void findLayoutElements() {
        show_tv = findViewById(R.id.show_tv);


        zero_btn = findViewById(R.id.zero_btn);
        one_btn = findViewById(R.id.one_btn);
        two_btn = findViewById(R.id.two_btn);
        three_btn = findViewById(R.id.three_btn);
        four_btn = findViewById(R.id.four_btn);
        five_btn = findViewById(R.id.fife_btn);
        six_btn = findViewById(R.id.six_btn);
        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        plus_btn = findViewById(R.id.plus_btn);
        nine_btn = findViewById(R.id.nine_btn);

        numbersBtn = new Button[]{zero_btn, one_btn, two_btn, three_btn, four_btn, five_btn,
        six_btn, seven_btn, eight_btn, nine_btn};

        minus_btn = findViewById(R.id.minus_btn);
        multiply_btn = findViewById(R.id.multiply_btn);
        divide_btn = findViewById(R.id.divide_btn);
        equal_btn = findViewById(R.id.equal_btn);

    }

    private void whatIPrintInTextView(String number){
        show_tv.setText(number + " ");
    }
}
