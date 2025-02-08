package calculator_app;

import java.math.BigDecimal;

public class Calculator {

    static double calculate(String value1, String value2) {
        BigDecimal v1 = new BigDecimal(value1);
        BigDecimal v2 = new BigDecimal(value2);

        BigDecimal result = v1.add(v2);

        return result.doubleValue();
    }

}
