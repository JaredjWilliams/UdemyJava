package com.example.udemyjavacourse.ideas.stopwatch;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.ideas.stopwatch.models.Stopwatch;

public class TimerViewHolder extends RecyclerView.ViewHolder {

    LinearLayout stopwatchLayout;
    Button startButton;
    Button stopButton;
    Button lapButton;
    TextView textView;
    TextView name;
    Stopwatch stopwatch;
    private final Handler uiHandler = new Handler(Looper.getMainLooper());

    public TimerViewHolder(@NonNull View itemView) {
        super(itemView);

        setupViews(itemView);

        startUpdatingUITask();
    }

    public void setupViews(View itemView) {
        stopwatchLayout = itemView.findViewById(R.id.stopwatch_layout);

        startButton = itemView.findViewById(R.id.start_button);
        stopButton = itemView.findViewById(R.id.stop_button);
        lapButton = itemView.findViewById(R.id.lap_button);

        textView = itemView.findViewById(R.id.timer_number);
        name = itemView.findViewById(R.id.athlete_name);

        setupStartButtonClick();
        setupStopButtonClick();
        setupLapButtonClick();
    }

    public void setName() {
        name.setText(stopwatch.getName());
    }

    private void setupStartButtonClick() {
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopwatch.startTimer();
            }
        });
    }

    private void setupStopButtonClick() {
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopwatch.stopTimer();
            }
        });
    }

    private void setupLapButtonClick() {
        lapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopwatch.lapTimer();
            }
        });
    }

    private void updateUI() {
        textView.setText(stopwatch.getElapsedTime());
    }

    private void startUpdatingUITask() {
        uiHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                updateUI();
                uiHandler.postDelayed(this, 1000);
            }
        }, 0);
    }
}
