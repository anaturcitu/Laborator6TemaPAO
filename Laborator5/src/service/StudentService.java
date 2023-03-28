package service;

import model.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student) throws Exception;

    List<Student> getStudents() throws Exception;

}
