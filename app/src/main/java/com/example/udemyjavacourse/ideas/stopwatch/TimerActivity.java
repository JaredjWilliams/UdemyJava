package com.example.udemyjavacourse.ideas.stopwatch;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.ideas.stopwatch.models.Stopwatch;

import java.util.ArrayList;
import java.util.List;

public class TimerActivity extends AppCompatActivity {



    private List<Stopwatch> stopwatchList = new ArrayList<Stopwatch>();
    private Button addTimerButton;
    private Button startAllButton;
    TimerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_timer);

        setupViews();
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.stopwatch_recycler_view);
        adapter = new TimerAdapter(stopwatchList, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupViews() {
        addTimerButton = findViewById(R.id.add_timer_button);
        startAllButton = findViewById(R.id.start_all_button);

        setupRecyclerView();

        setupNewTimerButton();
        setupStartAllButton();
    }

    private void setupNewTimerButton() {
        addTimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTimer();
            }
        });
    }

    private void setupStartAllButton() {
        startAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAllTimers();
            }
        });
    }

    private void addTimer() {
        stopwatchList.add(new Stopwatch("Jared Williams"));
        adapter.notifyItemInserted(stopwatchList.size() - 1);
    }

    private void startAllTimers() {
        for (Stopwatch stopwatch : stopwatchList) {
            stopwatch.startTimer();
        }
    }
}
