package org.ponuch.lesson4;

import org.ponuch.lesson4.Model.Student;
import org.ponuch.lesson4.Service.StudentService;
import org.ponuch.lesson4.Service.impls.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        studentService.add(new Student("Roman", 4.92f , 4));
    }


}
