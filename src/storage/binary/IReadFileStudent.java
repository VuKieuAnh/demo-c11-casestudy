package storage.binary;

import model.Student;

import java.util.List;

public interface IReadFileStudent {
    List<Student> readStudent(String fileName);
}
