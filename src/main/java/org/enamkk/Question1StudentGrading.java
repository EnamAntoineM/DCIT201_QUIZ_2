package org.enamkk;

public class Question1StudentGrading {
    public boolean validateScore(double score) {
        return score >= 0;
    }

    public char calculateLetterGrade(double score) {
        if (score >= 80) {
            return 'A';
        } else if (80 > score && 70 <= score) {
            return 'B';
        } else if (70 > score && 60 <= score) {
            return 'C';
        } else if (60 > score && 50 <= score) {
            return 'D';
        } else if (50 > score && 45 <= score) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public void displayPerformanceMessage(char grade) {
        System.out.println(grade);
    }

    public void executeGradeReport(double score) {
        char letterGrade = ' ';
        if (validateScore(score)) {
            letterGrade = calculateLetterGrade(score);
            displayPerformanceMessage(letterGrade);
        } else {
            System.out.println("Invalid Score");
        }
    }
}
