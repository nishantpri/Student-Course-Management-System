package learnermanagement.Service;
import learnermanagement.Course;
import learnermanagement.Enrollment;
import learnermanagement.Exception.EntityNotFound;
import learnermanagement.Exception.InvalidInputException;
import learnermanagement.Student;

import java.util.*;




public class EnrollmentService {

    private ArrayList<Enrollment> enrollments;

    public EnrollmentService() {
        enrollments = new ArrayList<>();
    }

    // Enroll Student
    public void enrollStudent(Enrollment enrollment) {

        enrollments.add(enrollment);

        System.out.println("Enrollment successful.");
    }

    // View Enrollments of Student
    public void viewEnrollmentsByStudent(int studentId) {

        boolean found = false;

        for (Enrollment enrollment : enrollments) {

            if (enrollment.getStudentId() == studentId) {

                System.out.println(enrollment);

                found = true;

            }

        }

        if (!found) {

            System.out.println("No enrollments found.");

        }

    }

    // Complete Enrollment
    public void completeEnrollment(int enrollmentId) {

        for (Enrollment enrollment : enrollments) {

            if (enrollment.getId() == enrollmentId) {

                enrollment.setStatus("COMPLETED");

                System.out.println("Enrollment completed.");

                return;

            }

        }

        System.out.println("Enrollment not found.");
    }

    // Cancel Enrollment
    public void cancelEnrollment(int enrollmentId) {

        for (Enrollment enrollment : enrollments) {

            if (enrollment.getId() == enrollmentId) {

                enrollment.setStatus("CANCELLED");

                System.out.println("Enrollment cancelled.");

                return;

            }

        }

        System.out.println("Enrollment not found.");
    }

}
