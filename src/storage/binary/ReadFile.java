package storage.binary;

import model.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile implements IReadFileStudent {
//    public static void main(String[] args) {
//        List<Student> students = readFile("students.dat");
//        System.out.println(students);
//    }
    public List<Student> readStudent(String fileName) {
        List<Student> students = new ArrayList<>();
        File file = new File(fileName);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            List<Student> students1 = (List<Student>) ois.readObject();
            return students1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
