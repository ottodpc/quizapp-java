package com.javaproject.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.javaproject.quizapp.databinding.ActivityMainBinding;
import com.javaproject.quizapp.model.Question;
import com.javaproject.quizapp.model.QuestionsList;
import com.javaproject.quizapp.viewmodel.QuizViewModel;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    QuizViewModel quizViewModel;
    List<Question> questionList;

    static int result = 0;
    static int totalQuestions = 0;
    List<Question> questionsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionsList = new ArrayList<>();

        activityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        // Resetting the Scores:
        result = 0;
        totalQuestions = 0;

        // getting the response:
        quizViewModel = new ViewModelProvider(this)
                .get(QuizViewModel.class);


        // Displaying the First Question
        quizViewModel.getQuestionsListLiveData().observe(this, new Observer<QuestionsList>() {
            @Override
            public void onChanged(QuestionsList questions) {
                questionsList  = questions;

                Log.i("TAGY","The first Question: "+questions.get(0));

                activityMainBinding.txtQuestion.setText("Question 1 :  " +questions.get(0).getQuestion());
                activityMainBinding.radio1.setText(questions.get(0).getOption1());
                activityMainBinding.radio2.setText(questions.get(0).getOption2());
                activityMainBinding.radio3.setText(questions.get(0).getOption3());
                activityMainBinding.radio4.setText(questions.get(0).getOption4());
            }
        });
    }
}