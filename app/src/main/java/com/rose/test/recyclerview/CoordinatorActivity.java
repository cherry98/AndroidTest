package com.rose.test.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rose.test.R;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class CoordinatorActivity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private List<String> list = new ArrayList<>();
    private RecyclerViewAdapter recyclerViewAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试5");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试6");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试6");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试9");
        recyclerViewAdapter = new RecyclerViewAdapter(this, list);
        recycler_view.setAdapter(recyclerViewAdapter);
    }
}
