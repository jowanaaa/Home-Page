package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardView4, cardView5, cardView6, cardView8, total, todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView4 = (CardView) findViewById(R.id.cardView4);
        cardView5 = (CardView) findViewById(R.id.cardView5);
        cardView6 = (CardView) findViewById(R.id.cardView6);
        cardView8 = (CardView) findViewById(R.id.cardView8);
        total = (CardView) findViewById(R.id.total);
        todo = (CardView) findViewById(R.id.todo);


        cardView4.setOnClickListener((View.OnClickListener) this);
        cardView5.setOnClickListener((View.OnClickListener) this);
        cardView6.setOnClickListener((View.OnClickListener) this);
        cardView8.setOnClickListener((View.OnClickListener) this);
        total.setOnClickListener((View.OnClickListener) this);
        todo.setOnClickListener((View.OnClickListener) this);


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent i;
        int viewId = R.id.cardView4;

        if (viewId == R.id.cardView4) {
            i = new Intent(this, cardView.class);
            startActivity(i);
            finish();
        }
        Intent j;
        int view = R.id.cardView8;

        if (view == R.id.cardView8) {
            j = new Intent(this, cardView.class);
            startActivity(j);
            finish();
        }
        Intent k;
        int views = R.id.total;

        if (views == R.id.total) {
            k = new Intent(this, cardView.class);
            startActivity(k);
            finish();
        }
        Intent p;
        int View = R.id.todo;

        if (View == R.id.todo) {
            p = new Intent(this, cardView.class);
            startActivity(p);
            finish();
        }


    }
}