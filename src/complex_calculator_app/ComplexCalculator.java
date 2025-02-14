package complex_calculator_app;

public class ComplexCalculator {
    static double calculate(String value1, String value2, String operation) {
        double d1, d2;
        try {
            d1 = Double.parseDouble(value1);
            d2 = Double.parseDouble(value2);
        } catch (NumberFormatException e) {
            System.out.println("Could not format a value as a number.\n" + e.getMessage());
            return Double.NEGATIVE_INFINITY;
        }

        switch (operation) {
            case "+":
                return d1 + d2;
            case "-":
                return d1 - d2;
            case "*":
                return d1 * d2;
            case "/":
                return d1 / d2;
            default:
                System.out.println("You didn't choose a valid operation.");
                return Double.NEGATIVE_INFINITY;
        }
    }
}
