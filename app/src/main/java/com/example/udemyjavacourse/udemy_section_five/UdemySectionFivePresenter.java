package com.example.udemyjavacourse.udemy_section_five;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.main.MainActivity;

public class UdemySectionFivePresenter {

    UdemySectionFiveViewInterface view;

    public UdemySectionFivePresenter(UdemySectionFiveActivity view) {
        this.view = view;
    }

    public void setText(String text) {
        view.setMethodOverloadChallengeInput(text);
    }

//    public double convertToCentimeters(int height) {
//
//    }
//
//    public double convertToCentimeters(int feet, int inches) {
//
//    }


    public void setEditListener(EditText editText) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    if (editText.getId() == R.id.method_overloading_challenge) {
                        
                    } else {
                        System.out.println("testing two");
                    }

                    return true;
                }

                return false;
            }
        });
    }

}
