package org.ponuch.lesson4.Repository;

import org.ponuch.lesson4.Model.Student;
import org.ponuch.lesson4.Model.User;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StudentRepository<T extends Student> {

    private String fileName = "students.txt";
    public void save(T student){
        try(FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write(student.toString());
            fileWriter.flush();

        }catch (Exception exception){}
    }
    public void remove(T student){
        try {
            var str = Files.readAllLines(Paths.get(fileName));
            str.removeIf(t -> t.contains(student.getName()));
            Files.write(Paths.get(fileName), str);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void edit(T student){
        try {
            var str = Files.readAllLines(Paths.get(fileName));
            str.removeIf(t -> t.contains(student.getName()));
            str.add(student.toString());
            Files.write(Paths.get(fileName), str);

        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public List<T> getAllStudents(){
        //todo распарсить файл в список студентов
        return null;
    }
}
