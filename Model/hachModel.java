package Model;

import java.util.*;

import Controller.iGetModel;

public class hachModel implements iGetModel {
    /** Список студентов в HashMap */
    private HashMap<Long, Student> studentsHashMap;

    public hachModel(HashMap<Long, Student> students) {
        this.studentsHashMap = new HashMap<>();
    }

   
    public List<Student> getAllStudent() {
        return new ArrayList<>(studentsHashMap.values());
    }

    /**У даления студента из списка */
    @Override
    public boolean DTLstg(Long id) {
          boolean hasSdudentId = false;
          if (studentsHashMap.get(id) != null) {
              studentsHashMap.remove(id);
              hasSdudentId = true;
          }
         return hasSdudentId;
    }

}
