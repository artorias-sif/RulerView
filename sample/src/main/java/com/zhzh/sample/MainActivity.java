package com.zhzh.sample;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zhzh.rulerlib.RulerView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private RulerView rulerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rulerView=(RulerView) findViewById(R.id.rulerView);
        rulerView.setOnValueChangedListener(new RulerView.OnValueChangedListener() {
            @Override
            public void onValueChanged(int value) {
                txt.setText(String.valueOf(value));
            }
        });
        rulerView.scrollToValue(90);
        txt=(TextView)findViewById(R.id.txt);
        txt.setClickable(true);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rulerView.scrollToValue((int)(Math.random()*100));
            }
        });
    }
}
