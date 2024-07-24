package com.example.beuengineers.Syllabus;

import java.util.List;

public class Branch {
    private String name;
    private List<Semester> semesters;

    public Branch(String name, List<Semester> semesters) {
        this.name = name;
        this.semesters = semesters;
    }

    public String getName() {
        return name;
    }

    public List<Semester> getSemesters() {
        return semesters;
    }
}
