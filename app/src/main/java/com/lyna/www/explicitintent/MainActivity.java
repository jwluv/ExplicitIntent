package com.lyna.www.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonSimple, buttonResult, buttonListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSimple = (Button)findViewById(R.id.buttonSimple);
        buttonResult = (Button)findViewById(R.id.buttonResult);
        buttonListview = (Button)findViewById(R.id.buttonListview);

        buttonSimple.setOnClickListener(this);
        buttonResult.setOnClickListener(this);
        buttonListview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()) {
            case R.id.buttonSimple:
                intent = new Intent(this, SimpleActivity.class);
                break;
            case R.id.buttonResult:
                intent = new Intent(this, ResultActivity.class);
                break;
            case R.id.buttonListview:
                intent = new Intent(this, ListviewActivity.class);
                break;
        }
        startActivity(intent);
    }
}
