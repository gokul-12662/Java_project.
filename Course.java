package edu.ccrm.domain;

public class Course {
    private String code;
    private String title;
    private int credits;

    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course[\n" +
               "  Code: " + code + ",\n" +
               "  Title: " + title + ",\n" +
               "  Credits: " + credits + "\n" +
               "]";
    }
}