package com.company;

import java.util.ArrayList;

/* this class manage resume data and writing*/

public class Resume {

    private String name;
    private String email;
    private int edExpMaxNumber;
    private int jobExpMaxNumber;
    private int skillMaxNumber;
    private int edExpMinNumber;
    private int jobExpMinNumber;
    private int skillMinNumber;

    private ArrayList<ResumeItem> resumeItems;

    public Resume(){
        name = "";
        email= "";
        resumeItems = new ArrayList<ResumeItem>();
        edExpMinNumber = 1;
        edExpMaxNumber = 10;
        jobExpMinNumber = 0;
        jobExpMaxNumber = 10;
        skillMinNumber = 1;
        skillMaxNumber = 20;

    }


    public Resume(String name, String email, ArrayList<ResumeItem> resumeItems) {
        name = name;
        this.email = email;
        this.resumeItems = resumeItems;

        edExpMinNumber = 1;
        edExpMaxNumber = 10;
        jobExpMinNumber = 0;
        jobExpMaxNumber = 10;
        skillMinNumber = 1;
        skillMaxNumber = 20;
    }



    public int getEducationalExpNumber() {
        int counter=0;
        for (ResumeItem resumeItem:resumeItems)
        {
            if(resumeItem.getClass().getSimpleName().equals("EducationalExperience")) {
                counter++;
            }
        }

         return counter;
    }


    public int getJobExpNumber() {
        int counter=0;
        for (ResumeItem resumeItem:resumeItems)
        {
            if(resumeItem.getClass().getSimpleName().equals("JobExperience")) {
                counter++;
            }
        }
        return counter;
    }


    public int getSkillsNumber() {
        int counter=0;
        for (ResumeItem resumeItem:resumeItems)
        {
          if(resumeItem.getClass().getSimpleName().equals("Skill")) {
                    counter++;
                }
        }

        return counter;
    }


   // write the resume in a string
    public String toString(){

        String ResItemString = "";
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (ResumeItem resumeItem:resumeItems)
        {

            if (resumeItem.getClass().getSimpleName().equals("EducationalExperience"))
            {
                if(counter1 == 0) {
                    ResItemString += (char)27 + "[1mEducation"+ (char)27 + "[0m\n";
                    counter1++;
                }
            }else if (resumeItem.getClass().getSimpleName().equals("JobExperience"))
            {
                if(counter2 == 0) {
                    ResItemString += (char)27 + "[1mExperience" + (char)27 + "[0m\n";
                    counter2++;
                }
            }else if(resumeItem.getClass().getSimpleName().equals("Skill")) {
                if (counter3 == 0) {
                    ResItemString += (char)27 + "[1mSkills" + (char)27 + "[0m\n";
                    counter3++;
                }
            }
            ResItemString = ResItemString+ resumeItem +"\n";
        }

        return  (char)27 + "[1m"+name + (char)27 + "[0m\n"+
                email + "\n\n" +
                ResItemString ;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<ResumeItem> getResumeItems() {
        return resumeItems;
    }

    public void setResumeItems(ArrayList<ResumeItem> resumeItems) {
        this.resumeItems = resumeItems;
    }

    public int getEdExpMaxNumber() {
        return edExpMaxNumber;
    }

    public int getJobExpMaxNumber() {
        return jobExpMaxNumber;
    }

    public int getSkillMaxNumber() {
        return skillMaxNumber;
    }

    public int getEdExpMinNumber() {
        return edExpMinNumber;
    }

    public int getJobExpMinNumber() {
        return jobExpMinNumber;
    }

    public int getSkillMinNumber() {
        return skillMinNumber;
    }

    public void addResumeItem(ResumeItem resumeItem) {
    resumeItems.add(resumeItem);
    }




}
