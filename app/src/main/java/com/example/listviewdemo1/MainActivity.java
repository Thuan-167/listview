package com.example.listviewdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    ArrayList<String> arrayCousre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    lvMonHoc=(ListView) findViewById(R.id.listviewMonHoc);
    arrayCousre= new ArrayList<>();
    arrayCousre.add("Android");
    arrayCousre.add("PHP");
    arrayCousre.add("Ios");
    arrayCousre.add("Unity");
    arrayCousre.add("ASP.net");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                arrayCousre
        );
        lvMonHoc.setAdapter(adapter);
    }
}