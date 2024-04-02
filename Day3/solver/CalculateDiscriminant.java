    package solver;

    import java.util.function.Function;

    public class CalculateDiscriminant implements Function<double[], Double> {
        @Override
        public Double apply(double[] coefficients) {
            double a = coefficients[0];
            double b = coefficients[1];
            double c = coefficients[2];
            // Calculate and return the discriminant
            return b * b - 4 * a * c;
        }
    }
