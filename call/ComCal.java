package call;

import logger.Logger;

/**
 * калькулятор для кч
 */

public class ComCal implements iCalculator {
    private Logger log;

    public ComCal(Logger log){
        this.log = log;
    }

    @Override
    public ComplexNumder add(ComplexNumder n1, ComplexNumder n2) {
        ComplexNumder result = n1.add(n2);
        log.log("Cложение: " + n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumder multiply(ComplexNumder n1, ComplexNumder n2) {
        ComplexNumder result = n1.multiplication(n2);
        log.log("Умножение: " + n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumder divide(ComplexNumder n1, ComplexNumder n2) {
        ComplexNumder result = n1.divide(n2);
        log.log("Деление: " + n1 + " / " + n2 + " = " + result);
        return result;
    }



}
