package com.rose.test.animate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.rose.test.R;

public class AnimateActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    Animation animation;
    private boolean isFrameStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView2.setBackgroundResource(R.drawable.frame_anim);
    }

    public void translate(View v) {
        animation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        textView.startAnimation(animation);
    }

    public void rotate(View v) {
        animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        textView.startAnimation(animation);
    }

    public void scale(View v) {
        animation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        textView.startAnimation(animation);
    }

    public void alpha(View v) {
        animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        textView.startAnimation(animation);
    }

    public void viewAnim(View v) {
        animation = AnimationUtils.loadAnimation(this, R.anim.view_anim);
        textView.startAnimation(animation);
    }

    public void frameAnim(View v) {
        AnimationDrawable animationDrawable = (AnimationDrawable) textView2.getBackground();
        if (isFrameStart) {
            animationDrawable.stop();
            isFrameStart = false;
        } else {
            animationDrawable.start();
            isFrameStart = true;
        }
    }
}
