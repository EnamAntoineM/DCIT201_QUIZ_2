package org.enamkk;

public class Question1StudentGrading {
    public boolean validateScore(double score) {
        return score >= 0;
    }

    public char calculateLetterGrade(double score) {
        if (score >= 80) {
            return 'A';
        } else if (score >= 70) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else if (score >= 45) {
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
