package com.example.udemyjavacourse.main;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        name = (TextView) itemView.findViewById(R.id.section);
    }
}
