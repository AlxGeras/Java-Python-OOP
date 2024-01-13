package Controller;

import java.util.List;

import Model.*;

/** Интерфейс */
public interface iGetModel {
    List<Student> getAllStudent();

    boolean DTLstg(Long numder);
}
