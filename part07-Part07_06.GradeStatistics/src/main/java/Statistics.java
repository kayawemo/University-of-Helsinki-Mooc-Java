/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayod
 */

import java.util.ArrayList;
public class Statistics {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Statistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoint(int point) {

            this.points.add(point);
    }

    public double average() {
        int sum = 0;
        for (int p : points) {
            sum += p;
        }

        return 1.0 * sum / points.size();
    }

    public double averagePassingGrade() {
        int sum = 0;
        int counter = 0;
        for (int p : points) {
            if (p >= 50) {
                sum += p;
                counter++;

            }
        }
        if (counter == 0) {
            return -1;
        } else {
            return 1.0 * sum / counter;
        }


    }

    public double passPercentage() {
        int counter = 0;
        for (int p : points) {
            if (p >= 50) {
                counter++;
            }
        }

        return 1.0 * 100 * counter / points.size();
    }

    public void print() {
        System.out.println("Point average (all): " + this.average());

        double passingFlag = this.averagePassingGrade();
        if (passingFlag == -1.0){
            System.out.println("Point average (passing): -");
        }  else{
            System.out.println("Point average (passing): " + this.averagePassingGrade());
        }

        System.out.println("Pass percentage: " + this.passPercentage());
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
    }

    public int gradeFrequency(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public int pointsToGrades(int points) {

        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
}
