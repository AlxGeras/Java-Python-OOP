import java.util.Scanner;

import call.ComCal;
import call.ComplexNumder;
import call.iCalculator;
import logger.FL;
import logger.Logger;

public class App {
    public static void main(String[] args) throws Exception {

        Logger log = new FL("log.txt");
        iCalculator cal = new ComCal(log);
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите действительную часть:");
        double material = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary1 = iScanner.nextDouble();
        ComplexNumder n1 = new ComplexNumder(material, imaginary1);

        System.out.print("Введите действие (+,*,/): ");
        char oper = iScanner.next().charAt(0);

        // Просим пользователя ввести второе комплексное число
        System.out.println("Введите действительную часть:");
        double material2 = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary2 = iScanner.nextDouble();
        ComplexNumder n2 = new ComplexNumder(material2, imaginary2);

        switch (oper) {
            case '+':
                ComplexNumder sum = cal.add(n1, n2);
                System.out.println("Сумма: " + sum);
                break;
            case '*':
                ComplexNumder prod = cal.multiply(n1, n2);
                System.out.println("Произведение: " + prod);
                break;
            case '/':
                ComplexNumder quot = cal.divide(n1, n2);
                System.out.println("Частное: " + quot);
                break;
            default:
                System.out.println("Ошибка");
                break;

        }
        iScanner.close();

    }

}
