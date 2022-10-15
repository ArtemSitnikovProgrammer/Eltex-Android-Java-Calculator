package ru.eltex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String ONE = "1";
    final String TWO = "2";
    final String THREE = "3";
    final String FOUR = "4";
    final String FIVE = "5";
    final String SIX = "6";
    final String SEVEN = "7";
    final String EIGHT = "8";
    final String NINE = "9";
    final String ZERO = "0";

    Integer a = 0;
    Integer b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.buttonOne);
        Button buttonTwo = (Button) findViewById(R.id.buttonTwo);
        Button buttonThree = (Button) findViewById(R.id.buttonThree);
        Button buttonFour = (Button) findViewById(R.id.buttonFour);
        Button buttonFive = (Button) findViewById(R.id.buttonFive);
        Button buttonSix = (Button) findViewById(R.id.buttonSix);
        Button buttonSeven = (Button) findViewById(R.id.buttonSeven);
        Button buttonEight = (Button) findViewById(R.id.buttonEight);
        Button buttonNine = (Button) findViewById(R.id.buttonNine);
        Button buttonZero = (Button) findViewById(R.id.buttonZero);

        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonDivision = (Button) findViewById(R.id.buttonDivision);
        Button buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        Button buttonQe = (Button) findViewById(R.id.buttonQe);
        Button buttonPercent = (Button) findViewById(R.id.buttonPercent);
        Button buttonRev = (Button) findViewById(R.id.buttonRev);
        Button buttonComma = (Button) findViewById(R.id.buttonComma);
        Button buttonAc = (Button) findViewById(R.id.buttonAc);


        buttonOne.setOnClickListener(view -> {
           TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + ONE);
        });

        buttonTwo.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + TWO);
        });
        buttonThree.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + THREE);
        });
        buttonFour.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + FOUR);
        });
        buttonFive.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + FIVE);
        });
        buttonSix.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + SIX);
        });
        buttonSeven.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + SEVEN);
        });
        buttonEight.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + EIGHT);
        });
        buttonNine.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + NINE);
        });
        buttonZero.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + ZERO);
        });

        buttonPlus.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);

            a = Integer.valueOf(String.valueOf(out.getText()));

            ((TextView) findViewById(R.id.output)).setText("");
        });

        buttonMinus.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);

            a = Integer.valueOf(String.valueOf(out.getText()));

            ((TextView) findViewById(R.id.output)).setText("");
        });

        buttonQe.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);

            b = Integer.valueOf(String.valueOf(out.getText()));

            ((TextView) findViewById(R.id.output)).setText(String.valueOf(a + b));
        });

    }


}