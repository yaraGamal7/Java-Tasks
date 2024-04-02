package solver;

import java.util.function.Function;

public class CalculateRoot implements Function<Object[], Double[]> {

    @Override
    public Double[] apply(Object[] inputs) {
        double[] coefficients = (double[]) inputs[0];
        double discriminant = (double) inputs[1];

        double a = coefficients[0];
        double b = coefficients[1];
    
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new Double[]{root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new Double[]{root};
        } else {
            // Imaginary roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            return new Double[]{realPart + imaginaryPart, realPart - imaginaryPart};
        }
    }
}
