package com.example.udemyjavacourse.udemy_section_five;

import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.udemyjavacourse.R;

public class UdemySectionFiveActivity extends AppCompatActivity implements UdemySectionFiveViewInterface {

    EditText methodOverloadChallengeInput;
    TextView methodOverloadChallengeResult;

    UdemySectionFivePresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createPresenter();

        setContentView(R.layout.activity_udemy_section_five);

        bindViews();
        setEditTextListeners();

        methodOverloadChallengeInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
    }

    private void setEditTextListeners() {
        presenter.setEditListener(methodOverloadChallengeInput);
    }

    private void createPresenter() {
        presenter = new UdemySectionFivePresenter(this);
    }

    private void bindViews() {
        methodOverloadChallengeInput = findViewById(R.id.method_overloading_challenge);
        methodOverloadChallengeResult = findViewById(R.id.method_overloading_challenge_result);
    }

    @Override
    public void setMethodOverloadChallengeInput(String text) {
        System.out.println(text);
        methodOverloadChallengeResult.setText(text + "cm");
    }
}
