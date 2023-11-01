package com.example.udemyjavacourse.enums;

public enum Section {
    SECTION_ONE("Section 1", "Getting Started"),
    SECTION_TWO("Section 2", "Programming Tools Setup"),
    SECTION_THREE("Section 3", "First Steps"),
    SECTION_FOUR("Section 4", "IntelliJ Basics"),
    SECTION_FIVE("Section 5", "Expressions, Statements, & More")
    ;

        public final String name;
        public final String descriptor;

        Section(String sectionName, String sectionDescriptor) {
            name = sectionName;
            descriptor = sectionDescriptor;
        }
}
