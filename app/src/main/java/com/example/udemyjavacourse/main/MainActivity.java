package com.example.udemyjavacourse.main;


import android.os.Bundle;

import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Section;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ComponentActivity {

    MainPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setPresenter();

        setContentView(R.layout.activity_main);

        List<Section> sections = presenter.createSections();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MainAdapter adapter = new MainAdapter(sections, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setPresenter() {
        presenter = new MainPresenter();
    }

}
