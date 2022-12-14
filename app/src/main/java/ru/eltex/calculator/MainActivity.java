package ru.eltex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

/**
 * Класс приложения калькулятор
 * @autor a.sitnikov
 * @version v1.0
 */
public class MainActivity extends AppCompatActivity {

    /** Поле тег для Log с названием класса */
    private static final String TAG = "MyActivity";

    /** Поле цифра 1 */
    final String ONE = "1";
    /** Поле цифра 2 */
    final String TWO = "2";
    /** Поле цифра 3 */
    final String THREE = "3";
    /** Поле цифра 4 */
    final String FOUR = "4";
    /** Поле цифра 5 */
    final String FIVE = "5";
    /** Поле цифра 6 */
    final String SIX = "6";
    /** Поле цифра 7 */
    final String SEVEN = "7";
    /** Поле цифра 8 */
    final String EIGHT = "8";
    /** Поле цифра 9 */
    final String NINE = "9";
    /** Поле цифра 0 */
    final String ZERO = "0";
    /** Поле знак запятая */
    final String COMMA = ",";

    /** Поле типа операции */
    String operation;

    /** Поле первой переменной */
    Integer a = 0;
    /** Поле второй переменной */
    Integer b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** Поле кнопки один */
        Button buttonOne = (Button) findViewById(R.id.buttonOne);
        /** Поле кнопки два */
        Button buttonTwo = (Button) findViewById(R.id.buttonTwo);
        /** Поле кнопки три */
        Button buttonThree = (Button) findViewById(R.id.buttonThree);
        /** Поле кнопки четыре */
        Button buttonFour = (Button) findViewById(R.id.buttonFour);
        /** Поле кнопки пять */
        Button buttonFive = (Button) findViewById(R.id.buttonFive);
        /** Поле кнопки шесть */
        Button buttonSix = (Button) findViewById(R.id.buttonSix);
        /** Поле кнопки семь */
        Button buttonSeven = (Button) findViewById(R.id.buttonSeven);
        /** Поле кнопки восемь */
        Button buttonEight = (Button) findViewById(R.id.buttonEight);
        /** Поле кнопки девять */
        Button buttonNine = (Button) findViewById(R.id.buttonNine);
        /** Поле кнопки ноль */
        Button buttonZero = (Button) findViewById(R.id.buttonZero);

        /** Поле кнопки плюс */
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        /** Поле кнопки минус */
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        /** Поле кнопки разделить */
        Button buttonDivision = (Button) findViewById(R.id.buttonDivision);
        /** Поле кнопки умножить */
        Button buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        /** Поле кнопки равно */
        Button buttonQe = (Button) findViewById(R.id.buttonQe);
        /** Поле кнопки процент */
        Button buttonPercent = (Button) findViewById(R.id.buttonPercent);
        /** Поле кнопки смены плюса на минус */
        Button buttonRev = (Button) findViewById(R.id.buttonRev);
        /** Поле кнопки запятая */
        Button buttonComma = (Button) findViewById(R.id.buttonComma);
        /** Поле кнопки сброс */
        Button buttonAc = (Button) findViewById(R.id.buttonAc);

        /** Блок Методов обработки нажатия кнопок с цифрами */
        buttonOne.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + ONE);
            Log.i(TAG,"Click on button " + ONE);
        });
        buttonTwo.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + TWO);
            Log.i(TAG,"Click on button " + TWO);
        });
        buttonThree.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + THREE);
            Log.i(TAG,"Click on button " + THREE);
        });
        buttonFour.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + FOUR);
            Log.i(TAG,"Click on button " + FOUR);
        });
        buttonFive.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + FIVE);
            Log.i(TAG,"Click on button " + FIVE);
        });
        buttonSix.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + SIX);
            Log.i(TAG,"Click on button " + SIX);
        });
        buttonSeven.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + SEVEN);
            Log.i(TAG,"Click on button " + SEVEN);
        });
        buttonEight.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + EIGHT);
            Log.i(TAG,"Click on button " + EIGHT);
        });
        buttonNine.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + NINE);
            Log.i(TAG,"Click on button " + NINE);
        });
        buttonZero.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + ZERO);
            Log.i(TAG,"Click on button " + ZERO);
        });
        buttonComma.setOnClickListener(view -> {
            TextView out = (TextView) findViewById(R.id.output);
            ((TextView) findViewById(R.id.output)).setText(out.getText() + COMMA);
            Log.i(TAG,"Click on button ,");
        });

        /** Блок Методов обработки нажатия кнопок с операциями */
        try {
            buttonAc.setOnClickListener(view -> {
                ((TextView) findViewById(R.id.output)).setText("");
                operation = "";
                Log.i(TAG, "Click on button AC");
            });

            buttonPlus.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);

                if (out.getText().equals("")) {
                    // пустая строка может нарушить в дальнейшем работу нашей программы
                    //throw new NullPointerException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {
                    a = Integer.valueOf(String.valueOf(out.getText()));
                    ((TextView) findViewById(R.id.output)).setText("");
                    operation = "+";
                    Log.i(TAG, "Click on button +");
                }
            });

            buttonMinus.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);
                if (out.getText().equals("")) {
                    // пустая строка может нарушить в дальнейшем работу нашей программы
                    //throw new ArithmeticException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {
                    a = Integer.valueOf(String.valueOf(out.getText()));
                    ((TextView) findViewById(R.id.output)).setText("");
                    operation = "-";
                    Log.i(TAG, "Click on button -");
                }
            });

            buttonDivision.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);
                if (out.getText().equals("")) {
                    // пустая строка может нарушить в дальнейшем работу нашей программы
                    //throw new ArithmeticException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {
                    a = Integer.valueOf(String.valueOf(out.getText()));
                    ((TextView) findViewById(R.id.output)).setText("");
                    operation = "/";
                    Log.i(TAG, "Click on button /");
                }
            });

            buttonMultiplication.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);
                if (out.getText().equals("")) {
                    // пустая строка может нарушить в дальнейшем работу нашей программы
                    //throw new ArithmeticException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {
                    a = Integer.valueOf(String.valueOf(out.getText()));
                    ((TextView) findViewById(R.id.output)).setText("");
                    operation = "x";
                    Log.i(TAG, "Click on button x");
                }
            });

            buttonPercent.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);
                if (out.getText().equals("")) {
                    // пустая строка может нарушить в дальнейшем работу нашей программы
                    //throw new ArithmeticException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {
                    //a = Integer.valueOf(String.valueOf(out.getText()));
                    //((TextView) findViewById(R.id.output)).setText(String.valueOf(a/100));
                    operation = "%";
                    Log.i(TAG, "Click on button %");
                    Log.e(TAG, "Method is not working yet");
                }
            });

            buttonRev.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);
                if (out.getText().equals("")) {
                    // пустая строка может нарушить в дальнейшем работу нашей программы
                    //throw new ArithmeticException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {
                    //a = Integer.valueOf(String.valueOf(out.getText()));
                    //((TextView) findViewById(R.id.output)).setText("");
                    operation = "+/-";
                    Log.i(TAG, "Click on button +/-");
                    Log.e(TAG, "Method is not working yet");
                }
            });


            buttonQe.setOnClickListener(view -> {
                TextView out = (TextView) findViewById(R.id.output);

                if (out.getText().equals("")) {
                    // мы решили, что пустая строка может нарушить в дальнейшем работу нашей программы, например, на результате этого метода нам надо вызывать метод substring(1,2), поэтому мы вынуждены прервать выполнение программы с генерацией своего типа исключения MyException с помощью throw
                    //throw new NullPointerException("String can not be empty!");
                    Log.e(TAG, "String can not be empty!");
                }else {

                    b = Integer.valueOf(String.valueOf(out.getText()));

                    switch (operation) {
                        case "+":
                            ((TextView) findViewById(R.id.output)).setText(String.valueOf(a += b));
                            break;
                        case "-":
                            ((TextView) findViewById(R.id.output)).setText(String.valueOf(a -= b));
                            break;
                        case "x":
                            ((TextView) findViewById(R.id.output)).setText(String.valueOf(a *= b));
                            break;
                        case "/":
                            ((TextView) findViewById(R.id.output)).setText(String.valueOf(a /= b));
                            break;
                        default:
                            ((TextView) findViewById(R.id.output)).setText("");
                            Log.e(TAG, "Click on button " + operation + ", operation not implemented");
                    }
                    Log.i(TAG, "Click on button =, operation result " + operation);
                }
            });

        }catch (AbstractMethodError e){
            System.out.println(e.getMessage());
        }

        Log.d(TAG,"Run method onCreate()");
    }

    /** Метод запуска программы */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Run method onStart()");
    }

    /** Метод возобновления активности программы */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Run method onResume()");
    }

    /** Метод приостановки активности программы */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Run method onPause()");
    }

    /** Метод остановки программы */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Run method onStop()");
    }

    /** Метод перезапуска программы */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Run method onRestart()");
    }

    /** Метод полного закрытия программы */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Run method onDestroy()");
    }
}