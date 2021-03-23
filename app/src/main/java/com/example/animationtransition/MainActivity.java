package com.example.animationtransition;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {
    Button  windmill, swipe_left, swipe_right, split, shrink, card, zoom, fade, spin, diagonal, slide_up, slide_down,slide_left, slide_right ,in_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntFunction();
        IntLisener();
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();

        Animatoo.animateZoom(MainActivity.this);
        Animatoo.animateFade(MainActivity.this);
        Animatoo.animateWindmill(MainActivity.this);
        Animatoo.animateSpin(MainActivity.this);
        Animatoo.animateDiagonal(MainActivity.this);
        Animatoo.animateSplit(MainActivity.this);
        Animatoo.animateShrink(MainActivity.this);
        Animatoo.animateCard(MainActivity.this);
        Animatoo.animateInAndOut(MainActivity.this);
        Animatoo.animateSwipeLeft(MainActivity.this);
        Animatoo.animateSwipeRight(MainActivity.this);
        Animatoo.animateSlideLeft(MainActivity.this);
        Animatoo.animateSlideRight(MainActivity.this);
        Animatoo.animateSlideDown(MainActivity.this);
        Animatoo.animateSlideUp(MainActivity.this);
    }

    private void IntLisener() { // start lisener

        windmill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateWindmill(MainActivity.this);



            }
        });

        //swipe left

        swipe_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSwipeLeft(MainActivity.this);


            }
        });

        //swipe right

        swipe_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSwipeRight(MainActivity.this);

            }
        });

        //split

        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSplit(MainActivity.this);

            }
        });

        //shrink

        shrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateShrink(MainActivity.this);

            }
        });


        //card

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateCard(MainActivity.this);

            }
        });

        //zoom
        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateZoom(MainActivity.this);
                Toast.makeText(MainActivity.this, "ddd", Toast.LENGTH_SHORT).show();

            }
        });

        //spin

        spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSpin(MainActivity.this);

            }
        });

        //fade

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateFade(MainActivity.this);

            }
        });

        //diagonal

        diagonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateDiagonal(MainActivity.this);

            }
        });

        //slide up
        slide_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSlideUp(MainActivity.this);

            }
        });

        //slide down
        slide_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSlideDown(MainActivity.this);

            }
        });

        //slide right
        slide_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSlideRight(MainActivity.this);
            }
        });

        //slide left
        slide_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateSlideLeft(MainActivity.this);

            }
        });

        //in_out

        in_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewPage.class));
                Animatoo.animateInAndOut(MainActivity.this);
               // Toast.makeText(MainActivity.this, "ddd", Toast.LENGTH_SHORT).show();

            }
        });
    } //end lisener

    private void IntFunction() {

        windmill = findViewById(R.id.windmillBtn);
        swipe_left = findViewById(R.id.swipeleftBtn);
        swipe_right = findViewById(R.id.swiperightBtn);
        split = findViewById(R.id.splitBtn);
        shrink=findViewById(R.id.shrinkBtn);
        card = findViewById(R.id.cardBtn);
        zoom = findViewById(R.id.zoomBtn);
        spin=findViewById(R.id.spinBtn);
        fade =findViewById(R.id.fadeBtn);
        diagonal =findViewById(R.id.diagonalBtn);
        slide_up=findViewById(R.id.slideupBtn);
        slide_down=findViewById(R.id.slidedownBtn);
        slide_left=findViewById(R.id.slideleftBtn);
        slide_right=findViewById(R.id.sliderightBtn);
        in_out=findViewById(R.id.inandoutBtn);
    }
}