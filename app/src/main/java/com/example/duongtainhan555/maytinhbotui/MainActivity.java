package com.example.duongtainhan555.maytinhbotui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edTxt1, edTxt2;
    TextView txtKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTxt1 = findViewById(R.id.edTxt1);
        edTxt2 = findViewById(R.id.edTxt2);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnChia = findViewById(R.id.btnChia);
        btnNhan = findViewById(R.id.btnNhan);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = edTxt1.getText().toString();
                String number2 = edTxt2.getText().toString();

                if(!number1.equals("") || !number2.equals(""))
                {
                    int ketqua = Integer.parseInt(number1) + Integer.parseInt(number2);
                    txtKetQua.setText(String.valueOf(ketqua));
                }

            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = edTxt1.getText().toString();
                String number2 = edTxt2.getText().toString();

                if(!number1.equals("") || !number2.equals(""))
                {
                    int ketqua = Integer.parseInt(number1) - Integer.parseInt(number2);
                    txtKetQua.setText(String.valueOf(ketqua));
                }

            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = edTxt1.getText().toString();
                String number2 = edTxt2.getText().toString();

                if(!number1.equals("") || !number2.equals(""))
                {
                    int ketqua = Integer.parseInt(number1) * Integer.parseInt(number2);
                    txtKetQua.setText(String.valueOf(ketqua));
                }

            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = edTxt1.getText().toString();
                String number2 = edTxt2.getText().toString();

                if((!number1.equals("") || !number2.equals("")) && Integer.parseInt(number2)!=0)
                {
                    int ketqua = Integer.parseInt(number1) / Integer.parseInt(number2);
                    txtKetQua.setText(String.valueOf(ketqua));
                }

            }
        });
    }
}
