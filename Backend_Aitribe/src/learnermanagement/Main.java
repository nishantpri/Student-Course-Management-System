package learnermanagement;
import java.util.*;

import learnermanagement.Exception.EntityNotFound;
import learnermanagement.Service.StudentService;
import learnermanagement.Service.EnrollmentService;
import learnermanagement.Service.CourseService;
import learnermanagement.util.IdGenerator;


public class Main {


    static Scanner scanner = new Scanner(System.in);

    static StudentService studentService = new StudentService();
    static CourseService courseService = new CourseService();
    static EnrollmentService enrollmentService = new EnrollmentService();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== LearnTrack ==========");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment Management");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");

            try {

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        studentMenu();
                        break;

                    case 2:
                        courseMenu();
                        break;

                    case 3:
                        enrollmentMenu();
                        break;

                    case 0:

                        System.out.println("Thank You!");

                        scanner.close();

                        return;

                    default:

                        System.out.println("Invalid Choice");

                }

            }

            catch (Exception e) {

                System.out.println("Invalid Input");

            }

        }

    }
    private static void studentMenu() {

        while (true) {

            System.out.println("\n------ Student Menu ------");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Deactivate Student");
            System.out.println("0. Back");

            System.out.print("Enter Choice : ");

            try {

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:

                        System.out.print("First Name : ");
                        String first = scanner.nextLine();

                        System.out.print("Last Name : ");
                        String last = scanner.nextLine();

                        System.out.print("Email : ");
                        String email = scanner.nextLine();

                        System.out.print("Batch : ");
                        String batch = scanner.nextLine();

                        Student student = new Student(
                                IdGenerator.getNextStudentId(),
                                first,
                                last,
                                email,
                                batch,
                                true
                        );

                        studentService.addStudent(student);

                        break;

                    case 2:

                        studentService.listStudents();

                        break;

                    case 3:

                        System.out.print("Student ID : ");

                        int id =
                                Integer.parseInt(scanner.nextLine());

                        System.out.println(
                                studentService.findStudentById(id)
                        );

                        break;

                    case 4:

                        System.out.print("Student ID : ");

                        int deactivate =
                                Integer.parseInt(scanner.nextLine());

                        studentService.deactivateStudent(deactivate);

                        break;

                    case 0:

                        return;

                    default:

                        System.out.println("Invalid Choice");

                }

            }

            catch (EntityNotFound e) {

                System.out.println(e.getMessage());

            }

            catch (Exception e) {

                System.out.println("Invalid Input");

            }

        }

    }

    private static void courseMenu() {

        while (true) {

            System.out.println("\n------ Course Menu ------");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Search Course");
            System.out.println("4. Activate Course");
            System.out.println("5. Deactivate Course");
            System.out.println("0. Back");

            System.out.print("Enter Choice : ");

            try {

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:

                        System.out.print("Course Name : ");
                        String name = scanner.nextLine();

                        System.out.print("Description : ");
                        String desc = scanner.nextLine();

                        System.out.print("Duration : ");
                        int weeks =
                                Integer.parseInt(scanner.nextLine());

                        Course course =
                                new Course(
                                        IdGenerator.getNextCourseId(),
                                        name,
                                        desc,
                                        weeks,
                                        true
                                );

                        courseService.addCourse(course);

                        break;

                    case 2:

                        courseService.listCourses();

                        break;

                    case 3:

                        System.out.print("Course ID : ");

                        int id =
                                Integer.parseInt(scanner.nextLine());

                        System.out.println(
                                courseService.findCourseById(id)
                        );

                        break;

                    case 4:

                        System.out.print("Course ID : ");

                        int active =
                                Integer.parseInt(scanner.nextLine());

                        courseService.activateCourse(active);

                        break;

                    case 5:

                        System.out.print("Course ID : ");

                        int inactive =
                                Integer.parseInt(scanner.nextLine());

                        courseService.deactivateCourse(inactive);

                        break;

                    case 0:

                        return;

                    default:

                        System.out.println("Invalid Choice");

                }

            }

            catch (EntityNotFound e) {

                System.out.println(e.getMessage());

            }

            catch (Exception e) {

                System.out.println("Invalid Input");

            }

        }

    }
    private static void enrollmentMenu() {

        while (true) {

            System.out.println("\n------ Enrollment Menu ------");
            System.out.println("1. Enroll Student");
            System.out.println("2. View Student Enrollments");
            System.out.println("3. Complete Enrollment");
            System.out.println("4. Cancel Enrollment");
            System.out.println("0. Back");

            System.out.print("Enter Choice : ");

            try {

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:

                        System.out.print("Student ID : ");
                        int studentId =
                                Integer.parseInt(scanner.nextLine());

                        System.out.print("Course ID : ");
                        int courseId =
                                Integer.parseInt(scanner.nextLine());

                        System.out.print("Enrollment Date : ");
                        String date = scanner.nextLine();

                        Enrollment enrollment =
                                new Enrollment(
                                        IdGenerator.getNextEnrollmentId(),
                                        studentId,
                                        courseId,
                                        date,
                                        "ACTIVE"
                                );

                        enrollmentService.enrollStudent(enrollment);

                        break;

                    case 2:

                        System.out.print("Student ID : ");

                        int id =
                                Integer.parseInt(scanner.nextLine());

                        enrollmentService
                                .viewEnrollmentsByStudent(id);

                        break;

                    case 3:

                        System.out.print("Enrollment ID : ");

                        int complete =
                                Integer.parseInt(scanner.nextLine());

                        enrollmentService
                                .completeEnrollment(complete);

                        break;

                    case 4:

                        System.out.print("Enrollment ID : ");

                        int cancel =
                                Integer.parseInt(scanner.nextLine());

                        enrollmentService
                                .cancelEnrollment(cancel);

                        break;

                    case 0:

                        return;

                    default:

                        System.out.println("Invalid Choice");

                }

            }

            catch (Exception e) {

                System.out.println("Invalid Input");

            }

        }

    }

}

