import java.util.ArrayList;
import java.util.List;

import Model.*;
import View.*;
import Controller.*;

public class App {
  public static void main(String[] args) throws Exception {
    List<Student> students = new ArrayList<Student>();
    Student s1 = new Student("Андрей", "Сидоров", 22, 101);
    Student s2 = new Student("Андрей", "Петров", 23, 111);
    Student s3 = new Student("Игорь", "Лютиков", 32, 121);
    Student s4 = new Student("Олег", "Смирнов", 43, 301);
    Student s5 = new Student("Даша", "Незабудкина", 41, 171);
    Student s6 = new Student("Лена", "Лютова", 54, 104);
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    students.add(s6);

    FileModel fModel = new FileModel("StudentsDB1.txt");
    for (Student student : students) {
            fModel.addStudent(student);
        }
        
        iGetModel newFModel = fModel;
    fModel.saveAllStudentToFile();
    iGetView viewEng = new ViewEng();

    Controller controller = new Controller(viewEng, newFModel);
    controller.run();
  }
}
