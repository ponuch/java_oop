package org.ponuch.lesson4.View;

import org.ponuch.lesson4.Model.Student;
import org.ponuch.lesson4.Model.Teacher;
import org.ponuch.lesson4.Service.StudentService;
import org.ponuch.lesson4.Service.TeacherService;
import org.ponuch.lesson4.Service.impls.StudentServiceImpl;
import org.ponuch.lesson4.Service.impls.TeacherServiceImpl;

import java.util.List;
import java.util.Scanner;

//Меню
public class StudentView {
    private TeacherService teacherService = new TeacherServiceImpl();
    private StudentService studentService = new StudentServiceImpl();

    public void printMenu () {
        System.out.println("""
            Выберите действие: 
            1. Добавить студента
            2. Удалить студента
            3. Редактировать студента
            4. Список всех студентов
            5. Добавить преподавателя
            6. Удалить преподавателя
            7. Редактировать преподавателя
        """);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number){
            case 1:
                studentService.add(new Student("Roman", 4.92f , 4));
                break;
            case 2:
                studentService.remove(new Student("Vasya", 4.92f , 4));
                break;
            case 3:
                studentService.edit(new Student("John", 4.92f , 5));
                break;
                case 4:
                    studentService.getAllStudents();
                break;
            case 5:
                teacherService.add(new Teacher("John Dow", List.of(new Student("Kolyan", 4.92f , 5))));
                break;
            case 6:
                teacherService.remove(new Teacher("John Dow2", List.of(new Student("John", 4.92f , 5))));
                break;
            case 7:
                teacherService.edit(new Teacher("John Dow3", List.of(new Student("Dr Trash", 4.92f , 5))));
                break;
        }
    }

}
