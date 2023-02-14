package org.ponuch.lesson4.Service;

import org.ponuch.lesson4.Model.Teacher;

public interface TeacherService<T extends Teacher> {
    void add(Teacher teacher);

    void remove(Teacher teacher);

    void edit(Teacher teacher);

}
