package com.example.udemyjavacourse.ideas.stopwatch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.ideas.stopwatch.models.Stopwatch;

import java.util.Collections;
import java.util.List;

public class TimerAdapter extends RecyclerView.Adapter<TimerViewHolder> {

    List<Stopwatch> stopwatchList;

    Context context;

    public TimerAdapter(List<Stopwatch> stopwatchList, Context context) {
        this.stopwatchList = stopwatchList;
        this.context = context;
    }

    @NonNull
    @Override
    public TimerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stopwatch_layout, parent, false);
        return new TimerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimerViewHolder holder, int position) {
        holder.stopwatch = stopwatchList.get(position);
        holder.setName();
    }

    @Override
    public int getItemCount() {
        return stopwatchList.size();
    }
}
