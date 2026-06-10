package learnermanagement.Service;
import learnermanagement.Exception.EntityNotFound;
import learnermanagement.Exception.InvalidInputException;
import learnermanagement.Student;
import java.util.*;

public class StudentService {

    private ArrayList<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }


    public void listStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }


    public Student findStudentById(int id) throws EntityNotFound {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }

        }

        throw new EntityNotFound("Student not found.");
    }

    public void deactivateStudent(int id) throws EntityNotFound {

        Student student = findStudentById(id);

        student.setActive(false);

        System.out.println("Student deactivated successfully.");
    }


    public void updateStudentEmail(int id, String email)
            throws EntityNotFound {

        Student student = findStudentById(id);

        student.setEmail(email);

        System.out.println("Email updated.");
    }
}
