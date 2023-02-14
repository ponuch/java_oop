package org.ponuch.lesson4.Controller;

import org.ponuch.lesson4.Model.Student;
import org.ponuch.lesson4.Service.StudentService;
import org.ponuch.lesson4.Service.impls.StudentServiceImpl;

//Контроллер
public class StudentController {
    private StudentService studentService = new StudentServiceImpl();

    public void addStudentInfo(String name, float grade, int year){
        studentService.add(new Student(name,grade,year));
    }

}
