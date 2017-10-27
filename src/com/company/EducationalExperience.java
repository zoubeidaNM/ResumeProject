package com.company;

/* this class manage educational experience data and writing*/

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class EducationalExperience extends ResumeItem{
    private String schoolName;
    Year yearCompletion;
    private String degree;
    private String gpa;

    public EducationalExperience(){


    }

    public EducationalExperience(String schoolName, Year yearCompletetion, String degree, String gpa) {
        this.schoolName = schoolName;
        this.yearCompletion = yearCompletetion;
        this.degree = degree;
        this.gpa = gpa;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Year getYearCompletion() {
        return yearCompletion;
    }

    public void setYearCompletion(Year yearCompletion) {
        this.yearCompletion = yearCompletion;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString(){
        return degree + ",\n" +
                schoolName + ", " + yearCompletion + "\n";
    }
}
