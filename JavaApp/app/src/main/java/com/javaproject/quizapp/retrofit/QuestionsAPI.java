package com.javaproject.quizapp.retrofit;

import com.javaproject.quizapp.model.QuestionsList;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface QuestionsAPI {
    String BASE_URL = "http://172.16.4.27/quiz/";
    // end point
    @GET("questionsapi.php")
    Call<QuestionsList> getQuestions();
}
