import java.util.*;
import java.math.*;
import java.text.DecimalFormat;
public class GradeCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the student : ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects : ");
        int n = sc.nextInt();
        int t_marks = 0;
        int fail = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i+1) + " : ");
            int marks = sc.nextInt();
            t_marks += marks;
            if(marks < 33) {
                fail++;
            }
        }
        System.out.println("Total marks obtained in " + n + " subjects : " + t_marks);
        double avg_marks = t_marks / (double)n;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Average Percentage : " + df.format(avg_marks) + "%");
        char grade;
        if(fail > 0) {
            System.out.println(name + " has failed in " + fail + " subjects");
            grade = 'F';
        }
        else if(avg_marks >= 90) {
            grade = 'A';
        }
        else if(avg_marks >= 80) {
            grade = 'B';
        }
        else if(avg_marks >= 70) {
            grade = 'C';
        }
        else if(avg_marks >= 50) {
            grade = 'D';
        }
        else if(avg_marks >= 30) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        System.out.println("Final Grade : " + grade);
    }
}