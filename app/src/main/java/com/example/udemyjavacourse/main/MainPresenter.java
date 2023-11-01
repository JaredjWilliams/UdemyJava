package com.example.udemyjavacourse.main;

import com.example.udemyjavacourse.enums.Section;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPresenter {

    MainViewInterface view;

    public MainPresenter(MainActivity view) {
        this.view = view;
    }

    public List<Section> createSections() {
        return new ArrayList<>(Arrays.asList(Section.values()));
    }

    public void startActivity(Section section) {
        switch (section) {
            case SECTION_ONE -> view.startSectionOneActivity();
            case SECTION_TWO -> view.startSectionTwoActivity();
            case SECTION_THREE -> view.startSectionThreeActivity();
            case SECTION_FOUR -> view.startSectionFourActivity();
            case SECTION_FIVE -> view.startSectionFiveActivity();
        }
    }

}
