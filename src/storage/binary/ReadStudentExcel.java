package storage.binary;

import model.Student;

import java.util.Collections;
import java.util.List;
//tao ra class moi dua tren ban mo ta cua abstract
public class ReadStudentExcel implements IReadFileStudent {
    @Override
    public List<Student> readStudent(String fileName) {
        return Collections.emptyList();
    }
}
