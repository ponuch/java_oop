package org.ponuch.lesson4.Service.impls;

import org.ponuch.lesson4.Model.Student;
import org.ponuch.lesson4.Repository.StudentRepository;
import org.ponuch.lesson4.Service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository repository = new StudentRepository();

    @Override
    public void add(Student student) {
        if (student != null) {
            repository.save(student);
        } else {
            System.out.println("Student is null!");
        }


    }

    @Override
    public void remove(Student student) {
        if (student != null){
            repository.remove(student);
        }


    }

    @Override
    public void edit(Student student) {
        if (student != null){
            repository.edit(student);
        }

    }

    @Override
    public List getAllStudents() {
        return repository.getAllStudents();
    }
}
