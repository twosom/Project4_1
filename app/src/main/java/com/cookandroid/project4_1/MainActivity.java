package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //xml파일에서 사용한 변수들 선언.
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
    String num1, num2;
    TextView textResult;
    Double result;
    Boolean check = false;

    public Boolean nullCheck(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0) {
            Toast.makeText(getApplicationContext(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");



        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRest = (Button) findViewById(R.id.btnRest);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                num1 = edit1.getText().toString().trim();
                num2 = edit2.getText().toString().trim();
                //값이 제대로 입력되었는지 확인.
                check = nullCheck(num1, num2);
                if(check){
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }else{
                    return;
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString().trim();
                num2 = edit2.getText().toString().trim();
                check = nullCheck(num1, num2);
                if (check) {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                } else {
                    return;
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString().trim();
                num2 = edit2.getText().toString().trim();
                check = nullCheck(num1, num2);
                if (check) {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                } else {
                    return;
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString().trim();
                num2 = edit2.getText().toString().trim();
                check = nullCheck(num1, num2);
                if (check) {
                    if (num2.equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                        return;
                    } else if (Double.parseDouble(num2) > 0) {
                        result = Double.parseDouble(num1) + Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                } else {
                    return;
                }
            }
        });

        btnRest.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString().trim();
                num2 = edit2.getText().toString().trim();
                check = nullCheck(num1, num2);
                if (check) {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });

    }
}