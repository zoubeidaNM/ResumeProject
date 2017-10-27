package com.company;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Resume resume = new Resume();

        // get resume Max in Nin numbers
        int maxEdExp = resume.getEdExpMaxNumber();
        int minEdExp = resume.getEdExpMinNumber();
        int maxJobExp = resume.getJobExpMaxNumber();
        int minJobExp = resume.getJobExpMinNumber();
        int minSkill = resume.getSkillMinNumber();
        int maxSkill = resume.getSkillMaxNumber();

        //answer from the user
        String answer = "";

        writeWelcomeMessage(resume);

        // enter name and email address
        System.out.print("Enter name:");
        resume.setName(keyboard.nextLine());
        String emailAdress = "";
        boolean emailValid=false;
        do {
            System.out.print("Enter Email address:");
            emailAdress = keyboard.nextLine();
            emailValid = isValidEmailAddress(emailAdress);
            if(!emailValid) {
                System.out.println("   Enter a valid email address.");
            }
        }while (!emailValid);
        resume.setEmail(emailAdress);

        //enter the educational experiences
        /*-------------------------------------------------------------------------------------------------------------------------*/
        do {
            System.out.println("\nYou have "+(char)27 + "[1m" +resume.getEducationalExpNumber()+  (char)27 +"[0m educational experiences entred.");
            if(minEdExp != 0 && (resume.getEducationalExpNumber() < minEdExp)) {
                System.out.println("You have to enter a minimum of " +(char)27 + "[1m"+ minEdExp + (char)27 +"[0m educational experiences.");
            }
            System.out.print("\nPress (E) to enter an educational experience or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();

            if (answer.equalsIgnoreCase("e")) {
                //enter educational experience
                if (resume.getEducationalExpNumber() < maxEdExp) {
                    //add educational experience if the number of educational experiences is between minEdExp and maxEdExp
                    addEducationalExperience(resume);
                } else {
                    // display a message if the user reached the maxEdExp number of educational experiences and quit
                    System.out.println((char)27 +"[31m\n***You can only enter a maximum of " +(char)27 +"[1m"+ maxEdExp + (char)27 +"[31m educational experiences.");
                    System.out.println((char)27 +"[1mPress (Enter) to continue."+(char)27 +"[0m");
                    keyboard.nextLine();
                    answer = "Q";
                }
            } else if (answer.equalsIgnoreCase("Q")) {
                //check if the user entered  the minEdExp number of educational experiences
                if (resume.getEducationalExpNumber() < minEdExp) {
                    // display a message if the user did not reach the minEdExp number of educational experiences
                    System.out.println((char)27 + "[31m***\nYou have to enter at least " +(char)27 + "[1m"+ minEdExp + (char)27 + "[31m educational experience");
                    System.out.println("Press (Enter) to continue."+(char)27 + "[0m");
                    keyboard.nextLine();
                    answer = "No Quit";
                }
            }
        } while (!answer.equalsIgnoreCase("q"));

        //enter job experiences
        /*-------------------------------------------------------------------------------------------------------------------------*/
        do {
            System.out.println("\nYou have "+ (char)27 + "[1m"+ resume.getJobExpNumber()+(char)27 + "[0m job experiences entred.\n");
            if(minJobExp != 0) {
                System.out.println("You have to enter a minimum of " +(char)27 + "[1m"+ minJobExp + (char)27 + "[0m job experiences.\n");
            }
            System.out.print("Press (J) to enter an job experience or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();
            if (answer.equalsIgnoreCase("j")) {
                if (resume.getJobExpNumber() < maxJobExp) {
                    //add a job experience if the number of job experiences is between minJobExp and maxJobExp
                    addJobExperience(resume);
                } else {
                    // display a message if the user reached the maxJobExp number of job experiences and quit
                    System.out.println((char)27 +"[31m\n***You can only enter a maximum of " +(char)27 +"[1m"+ maxJobExp + (char)27 +"[31m job experiences.");
                    System.out.println((char)27 +"[1mPress (Enter) to continue."+(char)27 +"[0m");
                    keyboard.nextLine();
                    answer = "Q";
                }
            } else if (answer.equalsIgnoreCase("Q")) {
                //check if the user entered  the minJobExp number of job experiences
                if (resume.getJobExpNumber() < minJobExp) {
                    // display a message if the user did not reach the minJobExp number of job experiences
                    System.out.println((char)27 + "[31m***\nYou have to enter at least " +(char)27 + "[1m"+ minJobExp + (char)27 + "[31m job experience");
                    System.out.println("Press (Enter) to continue."+(char)27 + "[0m");
                    keyboard.nextLine();
                    answer = "No Quit";
                }
            }
        } while (!answer.equalsIgnoreCase("q"));

        //enter skills
        /*-------------------------------------------------------------------------------------------------------------------------*/
        do {
            System.out.println("\nYou have "+ (char)27 +"[1m"+ resume.getSkillsNumber()+(char)27 +"[0m skills entred.");
            if(minSkill != 0) {
                System.out.println("You have to enter a minimum of " + (char)27 +"[1m"+resume.getSkillMinNumber() + (char)27 +"[0m skills.");
            }
            System.out.println("\nPress (S) to enter a skill or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();

            if (answer.equalsIgnoreCase("s")) {
                if (resume.getSkillsNumber() < maxSkill) {
                    //add a skill if the number of skills is between minSkill and maxSkill
                    addSkill(resume);
                } else {
                    // display a message if the user reached the maxSkill number of skills and quit
                    System.out.println((char)27 +"[31m\n***You can only enter a maximum of " +(char)27 +"[1m"+ maxSkill + (char)27 +"[31m skills.");
                    System.out.println((char)27 +"[1mPress (Enter) to continue."+(char)27 +"[0m");
                    keyboard.nextLine();
                    answer = "Q";
                }
            } else if (answer.equalsIgnoreCase("Q")) {
                //check if the user entered  the minSkill number of skill
                if (resume.getSkillsNumber() < minSkill) {
                    // display a message if the user did not reach the minSkill number of skills
                    System.out.println((char)27 + "[31m\n***You have to enter at least " +(char)27 + "[1m"+ minSkill + (char)27 + "[31m skills");
                    System.out.println("Press (Enter) to continue."+(char)27 + "[0m");
                    keyboard.nextLine();
                    answer = "No Quit";
                }
            }
        } while (!answer.equalsIgnoreCase("q"));

        //display the resume
        displayResume(resume);
    }

    // write a welcome message to the user
    public static void writeWelcomeMessage(Resume resume){
        System.out.println("---------------------------------------------------------------");
        System.out.println((char)27 +"[1m Welcome to Robo Resume");
        System.out.println((char)27 + "[0m---------------------------------------------------------------");
        System.out.println("You have to enter between " + (char)27 + "[1m" + resume.getEdExpMinNumber()+ (char)27 + "[0m and "+
                (char)27 + "[1m" + resume.getEdExpMaxNumber() + (char)27 +"[0m educational experiences.");
        System.out.println("You have to enter between " + (char)27 + "[1m" + resume.getJobExpMinNumber()+ (char)27 + "[0m and "+
                (char)27 + "[1m" + resume.getJobExpMaxNumber() + (char)27 +"[0m job experiences.");
        System.out.println("You have to enter between " + (char)27 + "[1m" + resume.getSkillMinNumber()+ (char)27 + "[0m and "+
                (char)27 + "[1m" + resume.getSkillMaxNumber() + (char)27 +"[0m skills.\n");
    }

    // ask the user to enter the attributes of an EducationalExperience
    // and add it to the resume
    public static void addEducationalExperience(Resume resume) {
        Scanner keyboard = new Scanner(System.in);

        EducationalExperience educationalExperience = new EducationalExperience();
        System.out.print("\n  Enter school name:");
        educationalExperience.setSchoolName(keyboard.nextLine());
        System.out.print("  Enter degree:");
        educationalExperience.setDegree(keyboard.nextLine());
        Year yearCompletion = null;
        do {
            System.out.print("  Enter year of completion "+(char)27+"[1m(format yyyy)"+(char)27+"[0m:");
            String YearCompletionStr = keyboard.next();
            keyboard.nextLine();

            yearCompletion = parseYearCompletion(YearCompletionStr);
        } while (yearCompletion == null);
        educationalExperience.setYearCompletion(yearCompletion);

        resume.addResumeItem(educationalExperience);

    }

    // ask the user to enter the attributes of a jobExperience
    // and add it to the resume
    public static void addJobExperience(Resume resume) {
        Scanner keyboard = new Scanner(System.in);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MM yyyy");

        String answer = "";
        int dutyCounter = 0;

        JobExperience jobExperience = new JobExperience();
        System.out.print("  Enter titleOfPosition:");
        jobExperience.setTitleOfPosition(keyboard.nextLine());
        System.out.print("  Enter job place:");
        jobExperience.setPlace(keyboard.nextLine());
        //enter the start year and make sure it is valid
        YearMonth startDate = null;
        do {
            System.out.print("  Enter start date "+(char)27+"[1m(format mm/yyyy)"+(char)27+"[0m:");
            String startDateStr = keyboard.nextLine();
            startDate = parseJobYear(startDateStr);
        } while (startDate == null);
        jobExperience.setStartDate(startDate);

        //enter the end year and make sure it is valid
        YearMonth endDate = null;

        do {
             System.out.print("  Enter end date "+(char)27+"[1m(format mm/yyyy)"+(char)27+"[0m:");
            String endDateStr = keyboard.nextLine();
            endDate = parseJobYear(endDateStr);
        } while (endDate == null);
        jobExperience.setEndDate(endDate);

        do {
            System.out.print("   Press (D) to enter a duty or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();
            if (answer.equalsIgnoreCase("D")) {

                System.out.print("     Enter a duty:");
                dutyCounter++;
                Duty duty = new Duty("Duty" + dutyCounter, keyboard.nextLine());

                jobExperience.addDuty(duty);
            }
        } while (!answer.equalsIgnoreCase("q"));

        resume.addResumeItem(jobExperience);

    }

    // ask the user to enter the attributes of a skill
    // and add it to the resume
    public static void addSkill(Resume resume) {
        Scanner keyboard = new Scanner(System.in);

        Skill skill = new Skill();
        System.out.print("  Enter skill name:");
        skill.setName(keyboard.nextLine());
        System.out.print("  Enter skill rating:");
        skill.setRating(keyboard.nextLine());

        resume.addResumeItem(skill);

    }

    //get the user year of completion and make sure it is valid
    public static Year parseYearCompletion(String yearStr){

        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("yyyy");

        Year year = null;
         try {
                year = year.parse(yearStr, dTF);

                if (year.isAfter(year.now())) {
                    System.out.println("    The year is in the past. Enter a valid year.");
                    year = null;
                }
            } catch (Exception e) {
                System.out.println("    Unable to convert the string you entered " + yearStr+  " to a year (yyyy). Please try again!");

            }

        return year;

    }

    //get the user year of completion and make sure it is valid
    public static YearMonth parseJobYear(String dateStr){

        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("MM/yyyy");

        YearMonth date = null;

        try {
            date = date.parse(dateStr, dTF);

            if (date.isAfter(YearMonth.now())) {
                System.out.println("    The date is in the past. Enter a valid date.");
                date = null;
            }
        } catch (Exception e) {
            System.out.println("    Unable to convert the string you entered " + dateStr + " to a date (mm/yyyy). Enter a valid date!");

        }

        return date;
    }
    //make sure the email address is valid
    public static boolean isValidEmailAddress(String email) {
             String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
            java.util.regex.Matcher m = p.matcher(email);
            return m.matches();
    }

    // display the resume to the console
    public static void displayResume(Resume resume) {

        System.out.println((char)27 +"[35m\n============================================================================" +(char)27 + "[0m");
        System.out.println((char)27 +"[1mResume"+(char)27 + "[0m");
        System.out.println((char)27 +"[35m============================================================================"+(char)27 + "[0m\n");
        System.out.println(resume);
        System.out.println((char)27 +"[35m============================================================================"+(char)27 + "[0m");

    }
}