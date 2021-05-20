/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
import java.util.ArrayList;

public class GradeBook {

    private ArrayList<Integer> grades;

    public GradeBook() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int gradeToAdd) {

        if (gradeToAdd >= 0 && gradeToAdd <= 100) {

            this.grades.add(gradeToAdd);
        }

    }

    public String gradeAverage() {
        double result = 0;
        int sum = 0;

        for (int grade : this.grades) {
            sum += grade;

        }
        result = 1.0 * sum / this.grades.size();

        return result + "";
    }

    public String gradeAveragePassing() {

        double result = 0;
        int sum = 0;
        int passingCount = 0;

        for (int grade : this.grades) {

            if (grade > 49) {
                passingCount++;
                sum += grade;
            }

        }

        result = 1.0 * sum / passingCount;
        if (sum == 0) {
            return "-";
        } else {

            return result + "";
        }

    }

    public String passingPercentage() {

        double result = 0;

        int count = 0;

        for (int grade : this.grades) {

            if (grade > 49) {

                count++;
            }

        }
        result = 100.0 * count / grades.size();

        return result + "";

    }

    public void printGradeDistribution() {

        int[] gradeDistArr = new int[6]; // 0 through 5

        //from my understanding Array's are already initilized with 0. So ill just loop and add to them
        //using previous exercise p3_22 printlnstars to help with this method.
        for (int grade : this.grades) {

            if (grade >= 90) {
                gradeDistArr[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); //line break
            gradDistIndex--;
        }

    }

    public void printGrades() {

        System.out.print("Point average (all): " + this.gradeAverage() + "\n"
                + "Point average (passing): " + this.gradeAveragePassing() + "\n"
                + "Pass percentage: " + this.passingPercentage() + "\n");

        printGradeDistribution();

    }
}
