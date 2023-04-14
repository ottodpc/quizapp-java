package com.javaproject.quizapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.javaproject.quizapp.model.QuestionsList;
import com.javaproject.quizapp.repository.QuizRepository;

// this class will act like view model for this layout ("extends ViewModel")
public class QuizViewModel extends ViewModel {
    QuizRepository repository = new QuizRepository();
    LiveData<QuestionsList> questionsListLiveData;
    public QuizViewModel() {
        System.out.println("2 🔴🚨hi");
        // connect view model with repo with the constructor
        questionsListLiveData =  repository.getQuestionsFromAPI();
    }
    // getter
    public LiveData<QuestionsList> getQuestionsListLiveData(){
        return questionsListLiveData;
    }
}
