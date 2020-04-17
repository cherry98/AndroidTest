package com.rose.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rose.test.constraint.ConstraintActivity;
import com.rose.test.recyclerview.CoordinatorActivity;
import com.rose.test.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recyclerView(View v) {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

    public void coordinator(View v) {
        startActivity(new Intent(this, CoordinatorActivity.class));
    }

    public void constraint(View v) {
        startActivity(new Intent(this, ConstraintActivity.class));
    }
}
