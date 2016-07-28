package com.andraskesik.codecoolapp.callbacks;

import android.content.Context;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

public class SurveyHandler<Question> extends Handler {

    public SurveyHandler(Context context) {
        super(context);
    }

    @Override
    public void onResponse(Call call, Response response) {
        super.onResponse(call, response);
        ArrayList<Question> questionList = (ArrayList<Question>) response.body();
        for (Question q : questionList) {
            //mTextView.append(q.toString());
        }
    }
}
