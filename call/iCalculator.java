package call;

/*
 * Интерфейс
 */
public interface iCalculator {

    /**
     * сложение
     * 
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumder add(ComplexNumder n1, ComplexNumder n2);

    /**
     * умножение
     * 
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumder multiply(ComplexNumder n1, ComplexNumder n2);

    /**
     * деление
     * 
     ** @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumder divide(ComplexNumder n1, ComplexNumder n2);
}
