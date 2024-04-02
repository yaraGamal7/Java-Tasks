import solver.CalculateDiscriminant;
import solver.CalculateRoot;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        // Coefficients of the quadratic equation (ax^2 + bx + c = 0)
        double[] coefficients = {1.0, -3.0, 2.0};

        // Calculate the discriminant using the coefficients a, b, and c
        double discriminant = new CalculateDiscriminant().apply(coefficients);

        // Calculate the roots based on the discriminant
        Double[] roots = new CalculateRoot().apply(new Object[]{coefficients, discriminant});

        // Print the roots
        if (roots != null) {
            if (roots.length == 2) {
                System.out.println("Root 1: " + roots[0]);
                System.out.println("Root 2: " + roots[1]);
            } else {
                System.out.println("Root 1 and Root 2 (equal roots): " + roots[0]);
            }
        } else {
            System.out.println("Roots are imaginary.");
        }
    }
}
