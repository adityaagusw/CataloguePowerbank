package com.example.cataloguepowerbank.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.cataloguepowerbank.MainActivity;
import com.example.cataloguepowerbank.R;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView logo;
    private Animation animLogo;
    private int time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);

        animLogo = AnimationUtils.loadAnimation(this,R.anim.transition);

        logo.startAnimation(animLogo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        }, time);
    }

}

