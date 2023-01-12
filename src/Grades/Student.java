package Grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String joshuamramos32, int[] ints) {
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage() {
        int average = 0;
        for (Integer grade : grades) {
            average += grade;

        }
        return (double) average / grades.size();
    }
}



