package com.example.udemyjavacourse.main;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Section;

import java.util.Collections;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    List<Section> sections = Collections.emptyList();
    Context context;

    public MainAdapter(List<Section> sections, Application application) {
        this.sections = sections;
        this.context = application;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_layout, parent, false);
        MainViewHolder holder = new MainViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.name.setText(sections.get(position).name + ": " + sections.get(position).descriptor);
    }

    @Override
    public int getItemCount() {
        return sections.size();
    }
}
