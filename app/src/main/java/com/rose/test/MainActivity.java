package com.rose.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rose.permission.annotation.PermissionNeed;
import com.rose.test.animate.AnimateActivity;
import com.rose.test.component.ComponentActivity;
import com.rose.test.constraint.ConstraintActivity;
import com.rose.test.layoutnest.LayoutNestActivity;
import com.rose.test.permissions.PermissionActivity;
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

    public void animate(View v) {
        startActivity(new Intent(this, AnimateActivity.class));
    }

    public void component(View v) {
        startActivity(new Intent(this, ComponentActivity.class));
    }

    public void layoutnest(View v) {
        startActivity(new Intent(this, LayoutNestActivity.class));
    }

    public void permission(View v) {
        startActivity(new Intent(this, PermissionActivity.class));
    }
}
