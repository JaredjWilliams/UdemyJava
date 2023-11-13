package com.example.udemyjavacourse.udemy_section_five;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udemyjavacourse.R;
import com.example.udemyjavacourse.enums.Chapter;

import java.util.List;

public class UdemySectionFiveActivity extends AppCompatActivity implements UdemySectionFiveClickListenerInterface, UdemySectionFiveViewInterface {

    LinearLayout methodOverloadLayout;

    TextView methodOverloadChallengeFeetResult;

    UdemySectionFivePresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createPresenter();

        setContentView(R.layout.activity_udemy_section_five);

        List<Chapter> chapters = presenter.createChapters();



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.section_five_recycler_view);
        UdemySectionFiveAdapter adapter = new UdemySectionFiveAdapter(chapters, getApplication(), this, presenter);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



    private void createPresenter() {
        presenter = new UdemySectionFivePresenter(this);
    }


}
