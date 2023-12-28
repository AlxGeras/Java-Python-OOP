package Controllers;

import StudentDomen.*;
import StudentService.EmploeeService;

public class EmploeeController implements iUserController<Emploee> {
    private final EmploeeService empServ = new EmploeeService();

    @Override
    public void create(Emploee emploee) {
        empServ.create(emploee);
    }

    static public <T extends Emploee> void paySalaty(T person) {
        System.out.println((person).getFirstName() + " выплачена зарплата 10000р.");
    }

}
