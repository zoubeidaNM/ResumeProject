package com.company;

import java.util.ArrayList;

/* this class manage school experience data and writing*/

public class JobExperience extends ResumeItem{

    String titleOfPosition;
    String place;
    String startDate;
    String endDate;
    ArrayList<Duty> duties;

    public JobExperience(){
        duties = new  ArrayList<Duty>();
    }


    public JobExperience(String titleOfPosition, String place, String startDate, String endDate, ArrayList<Duty> duties) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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

        String dutiesStr = "";

        for(Duty duty:duties) {
            dutiesStr = dutiesStr + duty;
        }
        return titleOfPosition + "\n" +
                place + ", " + startDate + " - " + endDate + "\n" +
                dutiesStr;

    }
}
