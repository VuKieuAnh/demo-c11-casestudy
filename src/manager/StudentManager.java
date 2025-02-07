package manager;

import model.Student;
import storage.binary.*;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    IReadFileStudent readFileStudent = new ReadFile();
    IWriteFileStudent writeFileStudent = new WriteFile();
//    chi chua thao tac logic nghiep vu, khong chua thao tac nhap xuat du lieu
    List<Student> students = readFileStudent.readStudent("students.dat");
//    them student
    public void addStudent(Student student) {
        students.add(student);
//        ghi lai file
        writeFileStudent.writeFile(students);

    }
//    ds student
    public List<Student> getStudents() {
//        goi trong file
        students = readFileStudent.readStudent("students.dat");
        return students;
    }
}
