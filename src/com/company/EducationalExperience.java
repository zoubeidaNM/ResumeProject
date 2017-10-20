package com.company;

/* this class manage educational experience data and writing*/

public class EducationalExperience extends ResumeItem{
    private String schoolName;
    private String yearCompletion;
    private String degree;
    private String gpa;

    public EducationalExperience(){

    }

    public EducationalExperience(String schoolName, String yearCompletetion, String degree, String gpa) {
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

    public String getYearCompletion() {
        return yearCompletion;
    }

    public void setYearCompletion(String yearCompletion) {
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
