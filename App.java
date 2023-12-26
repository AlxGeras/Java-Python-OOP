import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.*;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Александр", "Чернов", 25, (long) 101);
        Student s2 = new Student("Алексей", "Петров", 23, (long) 111);
        Student s3 = new Student("Дана", "Борисовв", 23, (long) 301);
        Student s4 = new Student("Анастасия", "Данилова", 24, (long) 121);
        Student s5 = new Student("Олег", "Иванов", 25, (long) 231);
        Student s6 = new Student("Петр", "Сидоров", 23, (long) 2345);

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

        StudentSteam team = new StudentSteam(2);
        team.addTeam(group);
        team.addTeam(group2);
        for (StudentGroup studentGroup : team) {
            System.out.println(studentGroup);
        }

        System.out.println("-----------------------------");

        Collections.sort(team.getTeams());
        for(StudentGroup studentGroup : team){
            System.out.println(studentGroup);
        }

    }
}
