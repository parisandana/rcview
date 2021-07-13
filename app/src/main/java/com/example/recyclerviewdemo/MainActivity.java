package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_list=new ArrayList<>();
        recyclerView=findViewById(R.id.Recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        main_list.add(new Model(R.drawable.gwk,"Garuda Wisnu Kencana","Jimbaran","081XXXXXXXXX"));
        main_list.add(new Model(R.drawable.gwk,"Pura Uluwatu","Uluwatu","081XXXXXXXXX"));
        adapter=new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}