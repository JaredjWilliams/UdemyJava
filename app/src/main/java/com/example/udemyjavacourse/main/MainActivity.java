package com.example.udemyjavacourse.main;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Section;
import com.example.udemyjavacourse.udemy_section_one.UdemySectionOneActivity;
import com.example.udemyjavacourse.udemy_section_two.UdemySectionTwoActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ComponentActivity implements MainViewClickListenerInterface, MainViewInterface {

    MainPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setPresenter();

        setContentView(R.layout.activity_main);

        List<Section> sections = presenter.createSections();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MainAdapter adapter = new MainAdapter(sections, getApplication(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setPresenter() {
        presenter = new MainPresenter(this);
    }

    @Override
    public void onItemClicked(Section section) {
        presenter.startActivity(section);
    }

    @Override
    public void startSectionOneActivity() {
        startActivity(new Intent(this, UdemySectionOneActivity.class));
    }

    @Override
    public void startSectionTwoActivity() {
        startActivity(new Intent(this, UdemySectionTwoActivity.class));
    }

    @Override
    public void startSectionThreeActivity() {

    }

    @Override
    public void startSectionFourActivity() {

    }

    @Override
    public void startSectionFiveActivity() {

    }
}
