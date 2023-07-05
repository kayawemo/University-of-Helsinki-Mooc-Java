
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kayod
 */
public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    Statistics statistics = new Statistics();

    public void start() {
        readPoints();
        statistics.average();
        statistics.print();
        this.printGradeDistribution();

    }

    private void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int points = scanner.nextInt();

            if (points == -1) {
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            statistics.addPoint(points);
            statistics.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution (){
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            int stars = statistics.gradeFrequency(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
