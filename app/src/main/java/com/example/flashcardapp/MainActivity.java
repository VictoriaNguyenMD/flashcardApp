package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.answer1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer1).setBackgroundColor(Color.RED);
            }
        });
        findViewById(R.id.answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer2).setBackgroundColor(Color.RED);
            }
        });
        findViewById(R.id.answer3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer3).setBackgroundColor(Color.GREEN);
            }
        });
        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            boolean isShowingAnswers = true;
            @Override
            public void onClick(View v) {
                if (isShowingAnswers)
                {
                    ImageView img1 = findViewById(R.id.toggle_choices_visibility);
                    img1.setImageResource(R.drawable.ic_hidden_eye);
                    findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer3).setVisibility(View.INVISIBLE);
                    isShowingAnswers = false;
                } else {
                    ImageView img2 = findViewById(R.id.toggle_choices_visibility);
                    img2.setImageResource(R.drawable.ic_unhidden_eye);
                    findViewById(R.id.answer1).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer3).setVisibility(View.VISIBLE);
                    isShowingAnswers = true;
                }
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               findViewById(R.id.answer1).setVisibility(View.VISIBLE);
               findViewById(R.id.answer1).setBackgroundColor(Color.parseColor("#838B8B"));
               findViewById(R.id.answer2).setVisibility(View.VISIBLE);
               findViewById(R.id.answer2).setBackgroundColor(Color.parseColor("#838B8B"));
               findViewById(R.id.answer3).setVisibility(View.VISIBLE);
               findViewById(R.id.answer3).setBackgroundColor(Color.parseColor("#838B8B"));
               findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
               findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
            }
        });

    }
}
