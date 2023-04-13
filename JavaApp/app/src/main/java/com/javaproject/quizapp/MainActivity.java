package com.javaproject.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.javaproject.quizapp.databinding.ActivityMainBinding;
import com.javaproject.quizapp.model.Question;
import com.javaproject.quizapp.viewmodel.QuizViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    QuizViewModel quizViewModel;
    List<Question> questionList;

    static int result = 0;
    static int totalQuestions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        // Resetting the Scores:
        result = 0;
        totalQuestions = 0;

        // getting the response:
        quizViewModel = new ViewModelProvider(this)
                .get(QuizViewModel.class);
    }
}