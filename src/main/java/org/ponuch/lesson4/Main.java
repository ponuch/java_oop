package org.ponuch.lesson4;

import org.ponuch.lesson4.Model.Student;
import org.ponuch.lesson4.Service.StudentService;
import org.ponuch.lesson4.Service.impls.StudentServiceImpl;
import org.ponuch.lesson4.View.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        view.printMenu();

        StudentService studentService = new StudentServiceImpl();
        studentService.add(new Student("Roman", 4.92f , 4));
    }


}
