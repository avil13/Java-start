package com.example.avil.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    public void onClickActivMain(View v ){
        Intent intent = new Intent();
        intent.putExtra("text", "Ok man!");
        setResult(RESULT_OK, intent);
        finish();
    }


    public void showDialog(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Самый лучший алерт!!!")
                .setMessage("Здесь мы тестируем самый современный способ отображения")
                .setNegativeButton("Нафиг", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Ну нет, так нет. Бывает...", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Тру", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Мужественное решение. Уважаю!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        Toast.makeText(getApplicationContext(), "Ушел? Вот УГ...", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }

}
