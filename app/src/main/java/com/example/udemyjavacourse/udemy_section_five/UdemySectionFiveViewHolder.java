package com.example.udemyjavacourse.udemy_section_five;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Chapter;

public class UdemySectionFiveViewHolder extends RecyclerView.ViewHolder {

    public UdemySectionFivePresenter presenter;
    public LinearLayout chapterLayout;
    public Chapter chapter;
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

    public void setChallengeVisibility(Chapter chapter, View itemView) {
        switch (chapter) {
            case INTRODUCTION -> itemView.findViewById(R.id.section_five_challenges_layout).setVisibility(View.GONE);
            case METHOD_OVERLOADING -> itemView.findViewById(R.id.section_five_challenges_layout).setVisibility(View.VISIBLE);
        }
    }



    public void hideView() {

    }
}
