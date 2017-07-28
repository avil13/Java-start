package com.example.avil.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by avil on 28.07.17.
 */
public class SecondActiviti extends Activity {

    TextView text2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        text2 = (TextView) findViewById(R.id.text2);

        text2.setText(getIntent().getStringExtra("txt_val"));
    }

    public void goToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
