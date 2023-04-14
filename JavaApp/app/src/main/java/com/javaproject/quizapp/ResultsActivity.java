package com.javaproject.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.javaproject.quizapp.databinding.ActivityResultsBinding;


public class ResultsActivity extends AppCompatActivity {
    ActivityResultsBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this,R.layout.activity_results);

        System.out.println("✅ ✅ binding: "+MainActivity.username);

        binding.txtAnswer.setText(MainActivity.username+", ton score final: "
                +MainActivity.result
                +"/"+MainActivity.totalQuestions);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResultsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });



    }
}