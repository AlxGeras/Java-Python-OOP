package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

/**
 * Сервис Уч
 */

public class TeacherService implements iUserService<Teacher> {
    private int cnt;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(Teacher ter) {
        //Teacher ter = new Teacher(firstName, secondName, age, cnt++,"");
        this.cnt++;
        teachers.add(ter);
    }

    

    /**
     * сортировка Студ по ФИ
     * 
     * @return newStudList возвращение отсортированного списка
     */
    public List<Teacher> getSortedByFIOTeacher() {
        List<Teacher> newTeacherList = new ArrayList<Teacher>(teachers);
        newTeacherList.sort(new PersonComparator<Teacher>());
        return newTeacherList;
    }

}
