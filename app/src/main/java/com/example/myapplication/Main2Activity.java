package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = (ListView) findViewById(R.id.list_view);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("iPhone");
        arrayList.add("Windows");
        arrayList.add("Blackberry");
        arrayList.add("Linux");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView) view;
        Toast.makeText(this, "-"+ tv.getText().toString() + ", position: " + position, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("listnames", tv.getText().toString());

        startActivity(intent);
    }
}
