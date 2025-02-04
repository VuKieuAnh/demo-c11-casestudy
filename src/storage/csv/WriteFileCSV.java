package storage.csv;

import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFileCSV {

    public static final String NEW_LINE = "\n";
    public static final String SEPARATOR = ",";
    public static final String FILE_HEADER = "id,code,name";

    public static void main(String[] args) {
        System.out.println("Write CSV file");
//        id, code, name
        Student s = new Student(1, "CG01", "Tam An");
        Student s1 = new Student(2, "CG02", "Thao An");
        List<Student> students = new ArrayList<Student>();
        students.add(s);
        students.add(s1);
        writeToFile("student.csv", students);
    }

    public static void writeToFile(String fileName, List<Student> students) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            fw.append(FILE_HEADER + NEW_LINE);
//            lap danh sach student -> moi lan lap ghi vao 1 dong
            for (Student student : students) {
                fw.append(student.getId() + SEPARATOR + student.getCode() + SEPARATOR + student.getName() + NEW_LINE);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
