package service.impl;

import exception.InvalidBirthDateException;
import exception.InvalidCNPException;
import exception.NoStudentFoundException;
import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

import static validation.StudentValidation.validateBirthYear;
import static validation.StudentValidation.validateCnp;

public class StudentServiceImpl implements StudentService {

    List<Student> students;

    @Override
    public void addStudent(Student student) {
        boolean validStudent = true;
        try {
            if (!validateCnp(student.getCnp()))
                throw new InvalidCNPException("Invalid CNP");
        }
        catch (InvalidCNPException exception){
            validStudent = false;
            System.out.println(exception.getMessage());
        }
        try {
            if (!validateBirthYear(student.getBirthDate()))
                throw new InvalidBirthDateException("Studentul trebuie sa aiba minim 18 ani");
        }
        catch (InvalidBirthDateException exception){
            validStudent = false;
            System.out.println(exception.getMessage());
        }
        if(validStudent) {
            if (students == null)
                students = new ArrayList<>();
            students.add(student);
        }
    }

    @Override
    public List<Student> getStudents() throws Exception {
        try {
            if (students == null)
                throw new NoStudentFoundException("Lista studenti goala");
        }
        catch (NoStudentFoundException exception){
            System.out.println(exception.getMessage());
        }
        finally{
            System.out.println("Test finally");
        }
        return students;
    }
}
