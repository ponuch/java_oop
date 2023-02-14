package org.ponuch.lesson4.Service;

import org.ponuch.lesson4.Model.Student;

import java.util.List;

public interface StudentService<T extends Student> {
    void add(T student);

    void remove(T student);

    void edit(T student);

    List<T> getAllStudents();

}
