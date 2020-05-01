package com.rose.test.layoutnest;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

import com.rose.test.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LayoutNestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_nest);
        TextView textView = findViewById(R.id.text);
        textView.setTextColor(0xffff0000);
        ImageView imageView = findViewById(R.id.img);
        imageView.setImageResource(R.mipmap.icon1);

        View view = findViewById(R.id.include_layout1);
        TextView textView1 = view.findViewById(R.id.text);
        textView1.setTextColor(0xffff00ff);
        ImageView imageView1 = view.findViewById(R.id.img);
        imageView1.setImageResource(R.mipmap.icon2);

        ViewStub viewstub = findViewById(R.id.viewstub);
        viewstub.inflate();//只能调用一次
//        viewstub.setVisibility(View.VISIBLE);//用此方法可find子节点id
    }
}