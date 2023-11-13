package com.example.udemyjavacourse.enums;

public enum Chapter {

    INTRODUCTION("Introduction", false),
    METHOD_OVERLOADING("Method Overloading", false);

    public final String title;
    public boolean clicked;

    Chapter(String chapterTitle, boolean isClicked) {
        title = chapterTitle;
        clicked = isClicked;
    }
}
