import model.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.Calendar;
import java.util.Locale;

import static util.MathOperations.divideTwoNumbers;
import static util.ReadFromFile.readFileContent;

public class Main {

    public static void main(String[] args) throws Exception {

        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.MONTH, 2);
        Student student = new Student("Student1", "1234587891234", calendar.getTime());

        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        calendar.set(Calendar.MONTH, 9);
        Student student2 = new Student("Student2" , "1234587891234", calendar.getTime());
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.addStudent(student);
        studentService.addStudent(student2);
        System.out.println(studentService.getStudents());

        readFileContent();

        System.out.println(divideTwoNumbers(12, 7));
    }


}
