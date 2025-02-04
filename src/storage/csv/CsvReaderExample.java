package storage.csv;

import model.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderExample {
    public static List<Student> readCsvFile(String fileName) {
        List<Student> students = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
                System.out.println(line);
            }
            students = getStudent(lines);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = readCsvFile("student.csv");
        for (Student student : students) {
            System.out.println(student);
        }
    }
//    viet 1 ham moi: tach chuoi ra, gan lai thuoc tinh cho doi tuong
    private static List<Student> getStudent(List<String> strings){
        List<Student> students = new ArrayList<>();
        strings.remove(0);
        for (String s : strings) {
            String[] split = s.split(WriteFileCSV.SEPARATOR);
            int id = Integer.parseInt(split[0]);
            String name = split[2];
            String code = split[1];
            Student student = new Student(id, name, code);
            students.add(student);
        }
        return students;
    }
}
