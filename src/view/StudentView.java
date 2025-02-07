package view;

import manager.StudentManager;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {
//        menu: 1: de them moi student
        showAllStudents();
//        2: hien thi danh sach student
//        addNewStudent();
    }
//    lam viec voi nguoi dung
    public static void addNewStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = input.nextInt();
        System.out.println("Enter student code: ");
        String code = input.next();
        System.out.println("Enter student name: ");
        String name = input.next();
        Student student = new Student(id, code, name);
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student);
    }

    public static void showAllStudents() {
        System.out.println("-------Danh sach HS-------");
        List<Student> students = new StudentManager().getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
