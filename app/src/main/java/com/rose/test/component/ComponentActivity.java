package com.rose.test.component;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rose.homepage.HomeFragment;
import com.rose.my.MyFragment;
import com.rose.test.R;

public class ComponentActivity extends AppCompatActivity {

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fragment, new HomeFragment());
        ft.commit();
        BottomNavigationView bottomnavigation = findViewById(R.id.bottomnavigation);
        bottomnavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                ft = fm.beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        ft.replace(R.id.fragment, new HomeFragment());
                        break;

                    case R.id.my:
                        ft.replace(R.id.fragment, new MyFragment());
                        break;
                }
                ft.commit();
                return false;
            }
        });
    }
}
