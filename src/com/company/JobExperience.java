package com.company;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/* this class manage school experience data and writing*/

public class JobExperience extends ResumeItem{

    String titleOfPosition;
    String place;
    YearMonth startDate;
    YearMonth endDate;
    ArrayList<Duty> duties;

    public JobExperience(){
        duties = new  ArrayList<Duty>();
    }


    public JobExperience(String titleOfPosition, String place, YearMonth startDate, YearMonth endDate, ArrayList<Duty> duties) {
        this.titleOfPosition = titleOfPosition;
        this.place = place;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duties = duties;
    }


    public String getTitleOfPosition() {
        return titleOfPosition;
    }

    public void setTitleOfPosition(String titleOfPosition) {
        this.titleOfPosition = titleOfPosition;
    }

    public YearMonth getStartDate() {
        return startDate;
    }

    public void setStartDate(YearMonth startDate) {
        this.startDate = startDate;
    }

    public YearMonth getEndDate() {
        return endDate;
    }

    public void setEndDate(YearMonth endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Duty> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<Duty> duties) {
        this.duties = duties;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public void addDuty(Duty duty){
        duties.add(duty);
    }


    @Override
    public String toString() {

        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("MMMM yyyy");
        String dutiesStr = "";

        for(Duty duty:duties) {
            dutiesStr = dutiesStr + duty;
        }
        return titleOfPosition + "\n" +
                //place + ", " + startDate.getMonth()+ " " + startDate.getYear()+ " - " + endDate.getMonth() + " " +endDate.getYear() + "\n" +
                place + ", " + startDate.format(longFormat)+ " - " + endDate.format(longFormat) + "\n" +
                dutiesStr;

    }
}
