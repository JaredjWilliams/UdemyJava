package com.example.udemyjavacourse.udemy_section_five;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UdemySectionFivePresenter {

    UdemySectionFiveViewInterface view;
    private UdemySectionFiveHolderInterface viewHolder;

    public UdemySectionFivePresenter(UdemySectionFiveViewInterface view) {
        this.view = view;
    }
    public void setUdemySectionViewHolder(UdemySectionFiveHolderInterface holder) {
        this.viewHolder = holder;
    }

    public List<Chapter> createChapters() {
        return new ArrayList<>(Arrays.asList(Chapter.values()));
    }

    public double convertToCentimeters(int height) {
        return height * 2.54;
    }

    public double convertToCentimeters(int feet, int inches) {
        int feetToInches = ( feet * 12) + inches;

        return convertToCentimeters(feetToInches);
    }

    public void overLoadMethodChallenge(int[] parameters) {
        String text = String.valueOf(convertToCentimeters(parameters[0], parameters[1]));
        viewHolder.setMethodOverloadChallengeInput(text);
    }

    public void onEnterPressed(EditText editText) {
        if (editText.getId() == R.id.method_overloading_challenge || editText.getId() == R.id.method_overloading_feet) {
            int[] parameters = viewHolder.getMethodOverloadChallengeParameters();
            overLoadMethodChallenge(parameters);
        }
    }

    public void setEditListener(EditText editText) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    onEnterPressed(editText);
                    return true;
                }
                return false;
            }
        });
    }

}
