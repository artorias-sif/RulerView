package com.zhzh.sample;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.zhzh.rulerlib.RulerView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private RulerView rulerView;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rulerView=(RulerView) findViewById(R.id.rulerView);
        rulerView.setOnValueChangedListener(new RulerView.OnValueChangedListener() {
            @Override
            public void onValueChanged(int value) {
                txt.setText(String.valueOf(value));
                et.setText(String.valueOf(value));
            }
        });
        rulerView.scrollToValue(90);
        txt=(TextView)findViewById(R.id.txt);
        txt.setClickable(true);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=(int)(Math.random()*100);
                rulerView.scrollToValue(num);
                txt.setText(String.valueOf(num));
            }
        });

        et=(EditText)findViewById(R.id.et);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int num;
                if(TextUtils.isEmpty(s.toString())){
                    num=rulerView.getMinValue();
                }else{
                    num=Integer.valueOf(s.toString());
                }
                rulerView.scrollToValue(num);
            }
        });
    }
}
