package com.company;

/* this class manage  skill data and writing
* */

public class Skill extends ResumeItem{
    String name;
    String rating;

    public Skill(){}

    public Skill(String field, String rating) {
        this.name = field;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    @Override
    public String toString(){
        return name + ", " + rating;

    }
}
