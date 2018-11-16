package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    private EditText edtSoA;

    private EditText edtSoB;

    private EditText edtKQ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSoA=(EditText)findViewById(R.id.edtSoA);
        edtSoB=(EditText)findViewById(R.id.edtSoB);
        edtKQ=(EditText)findViewById(R.id.edtKQ);
    }
    /** Phép tính cộng */
    public void Cong(View view){
        double x=Double.parseDouble(edtSoA.getText().toString());
        double y=Double.parseDouble(edtSoB.getText().toString());
        double kq=x+y;

        edtKQ.setText(String.valueOf(kq));
    }

    /** Phép tính trừ*/
    public void Tru(View view){
        double x=Double.parseDouble(edtSoA.getText().toString());
        double y=Double.parseDouble(edtSoB.getText().toString());
        double kq=x-y;

        edtKQ.setText(String.valueOf(kq));
    }
    /** Phép nhân */
    public void Nhan(View view){
        double x=Double.parseDouble(edtSoA.getText().toString());
        double y=Double.parseDouble(edtSoB.getText().toString());
        double kq=x*y;

        edtKQ.setText(String.valueOf(kq));
    }

    /** Phép chia */
    public void Chia(View view){
        double x=Double.parseDouble(edtSoA.getText().toString());
        double y=Double.parseDouble(edtSoB.getText().toString());
        double kq=x/y;

        edtKQ.setText(String.valueOf(kq));
    }
}
