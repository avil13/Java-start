package com.example.avil.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.avil.myapplication.adapter.PhoneModelAdapter;
import com.example.avil.myapplication.pojo.PhomeModel;

import java.util.ArrayList;
import java.util.List;

public class ThreeActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (ListView) findViewById(R.id.listViewID);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, initList());

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initList());


        listView.setAdapter(adapter);
    }


    private List<PhomeModel> initList(){
        List<PhomeModel> list = new ArrayList<PhomeModel>();

        list.add(new PhomeModel(1, "IPhone 7", 70000));
        list.add(new PhomeModel(2, "OnePlus 3", 32000));
        list.add(new PhomeModel(3, "Nexus 4", 12000));

        return list;
    }


    public void openMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public  void callComponent(View v){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        startActivity(intent);
    }


}
