package extra;

import java.io.IOException;
import java.util.Arrays;

public class ZadanieDodatkowe17_3 {

    public double calculateWeightedAverage(int[] grades, int[] weights) throws IOException {

        if (grades.length != weights.length) {
            throw new IllegalArgumentException("invalid input: grades and weights are not equal");
        }

        if (grades.length == 0 && weights.length == 0) {
            throw new IllegalArgumentException("invalid input: grades and weights are empty");
        }

        for (int grade : grades) {
            if (grade < 1 || grade > 6) {
                throw new IllegalArgumentException("invalid input: grade must be between 1 and 6");
            }
        }

        for (int weight : weights) {
            if (weight < 1 || weight > 10) {
                throw new IllegalArgumentException("invalid input: weight must be between 1 and 10");
            }
        }

        return excecuteCalculation(grades, weights);
    }

    private double excecuteCalculation(int[] grades, int[] weights) {

        double result = 0;

        for (int i = 0; i < grades.length; i++) {
            result += (grades[i] * weights[i]);
        }

        return result / Arrays.stream(grades).sum();
    }
}
