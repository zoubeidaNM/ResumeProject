package com.company;

import java.util.ArrayList;

/* this class manage resume data and writing*/

public class Resume {

    private String name;
    private String email;

    private ArrayList<ResumeItem> resumeItems;

    public Resume(){
        name = "";
        email= "";
        resumeItems = new ArrayList<ResumeItem>();

    }


    public Resume(String name, String email, ArrayList<ResumeItem> resumeItems) {
        name = name;
        this.email = email;
        this.resumeItems = resumeItems;
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
                    ResItemString += "Education \n";
                    counter1++;
                }
            }else if (resumeItem.getClass().getSimpleName().equals("JobExperience"))
            {
                if(counter2 == 0) {
                    ResItemString += "Experience \n";
                    counter2++;
                }
            }else if(resumeItem.getClass().getSimpleName().equals("Skill")) {
                if (counter3 == 0) {
                    ResItemString += "Skills \n";
                    counter3++;
                }
            }
            ResItemString = ResItemString+ resumeItem +"\n";
        }

        return  name + "\n"+
                email + "\n\n" +
                ResItemString ;
    }


    public void addResumeItem(ResumeItem resumeItem) {
    resumeItems.add(resumeItem);
    }
}
