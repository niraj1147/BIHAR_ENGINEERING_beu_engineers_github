package com.example.beuengineers.Syllabus;



import java.util.List;

public class Semester {
    private String name;
    private List<String> syllabus;

    public Semester(String name, List<String> syllabus) {
        this.name = name;
        this.syllabus = syllabus;
    }

    public String getName() {
        return name;
    }

    public List<String> getSyllabus() {
        return syllabus;
    }
}

