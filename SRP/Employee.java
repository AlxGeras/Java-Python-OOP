package SRP;

import java.util.Date;

public class Employee {

    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * конструктор класса сотрудник
     * 
     * @param name       имя
     * @param dob        дата рождения
     * @param baseSalary з.п
     * 
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * 
     * @return инфо о сотруднике
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    /**
     * расчет з\п
     */

    private class Salcal {
        /**
         * @return з\п с налогом
         */
        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);// налог
            return baseSalary - tax;
        }
    }

}
