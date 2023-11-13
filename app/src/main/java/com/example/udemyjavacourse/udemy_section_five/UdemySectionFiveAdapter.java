package com.example.udemyjavacourse.udemy_section_five;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Chapter;

import java.util.Collections;
import java.util.List;

public class UdemySectionFiveAdapter extends RecyclerView.Adapter<UdemySectionFiveViewHolder> {

    private UdemySectionFivePresenter presenter;
    UdemySectionFiveClickListenerInterface clickListener;
    List<Chapter> chapters = Collections.emptyList();
    Context context;
    public UdemySectionFiveAdapter(List<Chapter> chapters, Application application, UdemySectionFiveClickListenerInterface clickListener, UdemySectionFivePresenter presenter) {
        this.chapters = chapters;
        this.context = application;
        this.clickListener = clickListener;
        this.presenter = presenter;
    }
    @NonNull
    @Override
    public UdemySectionFiveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chapter_layout, parent, false);
        UdemySectionFiveViewHolder holder = new UdemySectionFiveViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UdemySectionFiveViewHolder holder, int position) {
        Chapter chapter = chapters.get(position);

        holder.chapter = chapter;
        holder.name.setText(chapter.title);
        holder.bind(presenter);
        holder.setChallengeVisibility(chapter, holder.itemView);
        setOnClickListener(holder.itemView, holder, chapter);
    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }

    public void setOnClickListener(View itemView, UdemySectionFiveViewHolder holder, Chapter chapter) {
        itemView.findViewById(R.id.chapter_caret).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewGroup.LayoutParams params = holder.itemView.getLayoutParams();

                if (chapter.clicked) {
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    chapter.clicked = false;
                } else {
                    params.height = 300;
                    chapter.clicked = true;
                }

                holder.itemView.setLayoutParams(params);

            }
        });
    }

}
