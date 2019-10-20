package com.example.cataloguepowerbank.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cataloguepowerbank.R;

public class DetailActivity extends AppCompatActivity {

    private ImageView img;
    private TextView tvContent;

    private String name, image, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        img = findViewById(R.id.tvImage);
        tvContent = findViewById(R.id.tvContent);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Terimakasih Dicoding, sudah dikasih beasiswa", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        description = intent.getStringExtra("description");
        image = intent.getStringExtra("image");

        getSupportActionBar().setTitle(name);

        Glide.with(this)
                .load(image)
                .apply(new RequestOptions())
                .into(img);

        tvContent.setText(description);

    }
}
