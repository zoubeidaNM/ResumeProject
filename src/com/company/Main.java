package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Resume resume = new Resume();

        Scanner keyboard = new Scanner(System.in);

        String answer = "";

        // enter name and email address
        System.out.print("Enter name:");
        resume.setName(keyboard.nextLine());
        System.out.print("Enter Email address:");
        resume.setEmail(keyboard.nextLine());


        //enter the educational experiences
        do {

            System.out.print("Press (E) to enter an educational experience or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();
            if (answer.equalsIgnoreCase("e")) {
                EducationalExperience educationalExperience = new EducationalExperience();
                System.out.print("Enter school name:");
                educationalExperience.setSchoolName(keyboard.nextLine());
                System.out.print("Enter degree:");
                educationalExperience.setDegree(keyboard.nextLine());
                System.out.print("Enter year of completion:");
                educationalExperience.setYearCompletion(keyboard.nextLine());

                resume.addResumeItem(educationalExperience);
            }
        } while (!answer.equalsIgnoreCase("q"));

        //enter job experiences
        do {
            System.out.print("Press (J) to enter an job experience or (Q) to quit.");
            int dutyCounter = 0;
            answer = keyboard.next();
            keyboard.nextLine();
            if (answer.equalsIgnoreCase("j")) {
                JobExperience jobExperience = new JobExperience();
                System.out.print("Enter titleOfPosition:");
                jobExperience.setTitleOfPosition(keyboard.nextLine());
                System.out.print("Enter job place:");
                jobExperience.setPlace(keyboard.nextLine());
                System.out.print("Enter start date:");
                jobExperience.setStartDate(keyboard.nextLine());
                System.out.print("Enter end date:");
                jobExperience.setEndDate(keyboard.nextLine());

                // enter duties
                String answer2 = "";
                do {
                    System.out.print("   Press (D) to enter a duty or (Q) to quit.");
                    answer2 = keyboard.next();
                    keyboard.nextLine();
                    if (answer2.equalsIgnoreCase("D")) {

                        System.out.print("   Enter a duty:");
                        dutyCounter++;
                        Duty duty = new Duty("Duty" + dutyCounter, keyboard.nextLine());

                        jobExperience.addDuty(duty);
                    }
                } while (!answer2.equalsIgnoreCase("q"));

                resume.addResumeItem(jobExperience);
            }

        } while (!answer.equalsIgnoreCase("q"));

        //enter skills
        do {
            System.out.print("Press (S) to enter a skill or (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                Skill skill = new Skill();
                System.out.print("Enter skill name:");
                skill.setName(keyboard.nextLine());
                System.out.print("Enter skill rating:");
                skill.setRating(keyboard.nextLine());

                resume.addResumeItem(skill);
            }


        } while (!answer.equalsIgnoreCase("q"));

        System.out.println("\n============================================================================");
        System.out.println("Resume");
        System.out.println("============================================================================\n");
        System.out.println(resume);
        System.out.println("============================================================================");

    }
}