package org.enamkk;

public class Question2ClassAverageCalculation {
    double[] scores = new double[]{};
    public double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) /2;
    }

    public double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public double calculateClassAverage(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
}
