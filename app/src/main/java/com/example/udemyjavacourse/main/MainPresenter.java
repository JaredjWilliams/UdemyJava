package com.example.udemyjavacourse.main;

import com.example.udemyjavacourse.enums.Section;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPresenter {

    public List<Section> createSections() {
        return new ArrayList<>(Arrays.asList(Section.values()));
    }

}
