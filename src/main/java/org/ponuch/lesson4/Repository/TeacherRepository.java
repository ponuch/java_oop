package org.ponuch.lesson4.Repository;

import org.ponuch.lesson4.Model.Teacher;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TeacherRepository<T extends Teacher> {
    private String fileName = "teacher.txt";
    public void save(T teacher){
        try(FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write(teacher.toString());
            fileWriter.flush();

        }catch (Exception exception){}
    }
    public void remove(T teacher) {
        try {
            var str = Files.readAllLines(Paths.get(fileName));
            str.removeIf(t -> t.contains(teacher.getName()));
            Files.write(Paths.get(fileName), str);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void edit(T teacher){
        try {
            var str = Files.readAllLines(Paths.get(fileName));
            str.removeIf(t -> t.contains(teacher.getName()));
            str.add(teacher.toString());
            Files.write(Paths.get(fileName), str);

        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
