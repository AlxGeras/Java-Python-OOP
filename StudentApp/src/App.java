import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentService.AverageAge;
import StudentService.TeacherService;
import StudentDomen.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Александр", "Чернов", 25, (long) 101);
        Student s2 = new Student("Алексей", "Петров", 23, (long) 111);
        Student s3 = new Student("Дана", "Борисовв", 23, (long) 301);
        Student s4 = new Student("Анастасия", "Данилова", 24, (long) 121);
        Student s5 = new Student("Олег", "Иванов", 25, (long) 231);
        Student s6 = new Student("Петр", "Сидоров", 23, (long) 2345);
        Teacher t1 = new Teacher("Иван", "Иванов", 45, 3450, "Docent");
        Teacher t3 = new Teacher("Иван", "Алексеевич", 43, 3451, "Doctor");
        Teacher t2 = new Teacher("Петр", "Петров", 65, 330, "Doctor");

        List<Student> lisStud = new ArrayList<Student>();
        lisStud.add(s1);
        lisStud.add(s2);
        lisStud.add(s3);
        lisStud.add(s4);
        StudentGroup group = new StudentGroup(lisStud, 23454);

        List<Student> lisStud2 = new ArrayList<Student>();
        lisStud2.add(s5);
        lisStud2.add(s6);
        StudentGroup group2 = new StudentGroup(lisStud2, 15454);

        List<Teacher> listT = new ArrayList<>();
        listT.add(t1);
        listT.add(t2);
        listT.add(t3);

        StudentSteam team = new StudentSteam(2);
        team.addTeam(group);
        team.addTeam(group2);
        for (StudentGroup studentGroup : team) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");

        Collections.sort(team.getTeams());
        for (StudentGroup studentGroup : team) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");

        System.out.println("Средний возраст Группы 1: ");
        AverageAge.getAverageAge(lisStud);
        System.out.println("Средний возраст Группы 2: ");
        AverageAge.getAverageAge(lisStud2);
        System.out.println("Средний возраст Teacher: ");
        AverageAge.getAverageAge(listT);


        TeacherService ts = new TeacherService();
        ts.create(t1);
        ts.create(t2);
        ts.create(t3);
        System.out.println("Отсортироавнный список учителей: ");
         System.out.println (ts.getSortedByFIOTeacher());
       

    }
}
