package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Student;

public class StudentService implements iUserService<Student> {
    private int cnt;
    private List<Student> students;

    public StudentService() {

        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(Student per) {
       // Student per = new Student(firstName, firstName, age, cnt);
        this.cnt++;
        students.add(per);
    }
    

    /**
     * сортировка Студ по ФИ
     * @return newStudList возвращение отсортированного списка
     */
    public List<Student> getSortedByFIOStudents() {
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComparator<Student>());
        return newStudList;
    }

}
