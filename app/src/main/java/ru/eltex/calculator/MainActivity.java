package ru.eltex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String one = "1";
    final String two = "2";
    final String three = "3";

    Integer a = 0;
    Integer b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.buttonOne);
        Button buttonTwo = (Button) findViewById(R.id.buttonTwo);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonQe = (Button) findViewById(R.id.buttonQe);



        buttonOne.setOnClickListener(view -> {
           TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + "1");
        });

        buttonTwo.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + "2");
        });

        buttonPlus.setOnClickListener(view -> {
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