package com.example.udemyjavacourse.udemy_section_five;

import android.content.Context;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Chapter;

public class UdemySectionFiveViewHolder extends RecyclerView.ViewHolder implements UdemySectionFiveHolderInterface {

    public UdemySectionFivePresenter presenter;
    public LinearLayout chapterLayout;
    public Chapter chapter;
    EditText methodOverloadChallengeInput;
    TextView methodOverloadChallengeResult;
    EditText methodOverloadChallengeFeet;
    Context context;
    TextView name;
    public UdemySectionFiveViewHolder(@NonNull View itemView) {
        super(itemView);

        chapterLayout = itemView.findViewById(R.id.chapter_container);
        name = itemView.findViewById(R.id.chapter_title);

        if (chapter != null) {
            setChallengeVisibility(chapter, itemView);
        }


    }

    public void bind(UdemySectionFivePresenter presenter) {
        this.presenter = presenter;
        presenter.setUdemySectionViewHolder(this);
    }

    public void setChallengeVisibility(Chapter chapter, View itemView) {
        switch (chapter) {
            case INTRODUCTION -> itemView.findViewById(R.id.section_five_challenges_layout).setVisibility(View.GONE);
            case METHOD_OVERLOADING -> setUpMethods();

        }
    }

    public void setUpMethods() {
        itemView.findViewById(R.id.section_five_challenges_layout).setVisibility(View.VISIBLE);

        bindViews(itemView);
        setInputTypes();
        setEditTextListeners();
    }

    private void setEditTextListeners() {
        presenter.setEditListener(methodOverloadChallengeInput);
        presenter.setEditListener(methodOverloadChallengeFeet);
    }

    private void bindViews(View itemView) {
        methodOverloadChallengeInput = itemView.findViewById(R.id.method_overloading_challenge);
        methodOverloadChallengeResult = itemView.findViewById(R.id.method_overloading_challenge_result);
        methodOverloadChallengeFeet = itemView.findViewById(R.id.method_overloading_feet);
    }



    private void setInputTypes() {
        methodOverloadChallengeInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        methodOverloadChallengeFeet.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
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
