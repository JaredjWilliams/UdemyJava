package com.example.udemyjavacourse.udemy_section_five;

import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Chapter;

import java.util.List;

public class UdemySectionFiveActivity extends AppCompatActivity implements UdemySectionFiveClickListenerInterface, UdemySectionFiveViewInterface {

    LinearLayout methodOverloadLayout;
    EditText methodOverloadChallengeInput;
    TextView methodOverloadChallengeResult;
    EditText methodOverloadChallengeFeet;
    TextView methodOverloadChallengeFeetResult;

    UdemySectionFivePresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createPresenter();

        setContentView(R.layout.activity_udemy_section_five);

        List<Chapter> chapters = presenter.createChapters();

        bindViews();
        setInputTypes();
        setEditTextListeners();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.section_five_recycler_view);
        UdemySectionFiveAdapter adapter = new UdemySectionFiveAdapter(chapters, getApplication(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setEditTextListeners() {
        presenter.setEditListener(methodOverloadChallengeInput);
        presenter.setEditListener(methodOverloadChallengeFeet);
    }

    private void createPresenter() {
        presenter = new UdemySectionFivePresenter(this);
    }

    private void bindViews() {
        methodOverloadChallengeInput = findViewById(R.id.method_overloading_challenge);
        methodOverloadChallengeResult = findViewById(R.id.method_overloading_challenge_result);
        methodOverloadChallengeFeet = findViewById(R.id.method_overloading_feet);
    }

    private void setInputTypes() {
//        methodOverloadChallengeInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
//        methodOverloadChallengeFeet.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
    }

    @Override
    public int[] getMethodOverloadChallengeParameters() {

        if (methodOverloadChallengeInput.getText().toString().equals("") || methodOverloadChallengeFeet.getText().toString().equals("")) {
            return new int[] {0, 0};
        }

        return new int[]{Integer.parseInt(methodOverloadChallengeFeet.getText().toString()), Integer.parseInt(methodOverloadChallengeInput.getText().toString())};
    }

    @Override
    public void setMethodOverloadChallengeInput(String text) {
        methodOverloadChallengeResult.setText(text + " cm");
    }
}
