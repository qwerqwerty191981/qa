package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private Button button;

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
    public int getX(){

        int x, rez=0;
        String num=editText1.getText().toString();
        x = Integer.parseInt(num);
        if((x <= 999)&& (x >=0)){
            rez=x;
        } else {
            textView3.setText("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            rez = 0;//рекурсия
        }
        return rez;
    }
    public int getN(){

        int n, rez=0;
        String num=editText2.getText().toString();
        n = Integer.parseInt(num);
        if((n<= 100)&&(n >= 1)){
            rez = n;
        } else {
            textView3.setText("Вы допустили ошибку при вводе степени. Попробуйте еще раз.");
            rez = 0;//рекурсия
        }
        return rez;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Объявим числовые переменные
                int a,b,c;

                a = getX();
                b = getN();
              //  a=3;
               // b=2;
                if(a!=0&&b!=0) {
                    //Проведем с числовыми переменными нужные действия
                    c = power(a,b);

                    //Преобразуем ответ в строку
                    String S = Double.toString(c);

                    //Выведем текст в textView3
                    textView3.setText(S);
                }
            }
        });
    }


}
