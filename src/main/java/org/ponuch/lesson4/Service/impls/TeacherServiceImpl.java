package org.ponuch.lesson4.Service.impls;

import org.ponuch.lesson4.Model.Teacher;
import org.ponuch.lesson4.Repository.TeacherRepository;
import org.ponuch.lesson4.Service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void add(Teacher teacher) {
        if (teacher != null){
            teacherRepository.save(teacher);
        }

    }

    @Override
    public void remove(Teacher teacher) {
        if (teacher != null){
            teacherRepository.remove(teacher);
        }

    }

    @Override
    public void edit(Teacher teacher) {
        if (teacher != null){
            teacherRepository.edit(teacher);
        }

    }
}
