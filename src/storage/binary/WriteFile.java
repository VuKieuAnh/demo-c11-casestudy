package storage.binary;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        Student s = new Student(1, "CG01", "Tam An");
        Student s1 = new Student(2, "CG02", "Thao An");
        List<Student> students = new ArrayList<Student>();
        students.add(s);
        students.add(s1);
        writeFile(students);
    }
    public static void writeFile(List<Student> students) {
        File file = new File("students.dat");
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
