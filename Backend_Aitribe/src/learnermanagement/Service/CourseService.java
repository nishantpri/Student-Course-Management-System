package learnermanagement.Service;
import learnermanagement.Course;
import learnermanagement.Exception.EntityNotFound;
import learnermanagement.Exception.InvalidInputException;
import learnermanagement.Student;

import java.util.*;

    public class CourseService {

        private ArrayList<Course> courses;

        public CourseService() {
            courses = new ArrayList<>();
        }

        // Add Course
        public void addCourse(Course course) {
            courses.add(course);
            System.out.println("Course added successfully.");
        }

        // View All Courses
        public void listCourses() {

            if (courses.isEmpty()) {
                System.out.println("No courses available.");
                return;
            }

            for (Course course : courses) {
                System.out.println(course);
            }
        }

        // Search Course
        public Course findCourseById(int id)
                throws EntityNotFound {

            for (Course course : courses) {

                if (course.getId() == id) {
                    return course;
                }

            }

            throw new EntityNotFound("Course not found.");
        }

        // Activate Course
        public void activateCourse(int id)
                throws EntityNotFound {

            Course course = findCourseById(id);

            course.setActive(true);

            System.out.println("Course activated.");
        }

        // Deactivate Course
        public void deactivateCourse(int id)
                throws EntityNotFound {

            Course course = findCourseById(id);

            course.setActive(false);

            System.out.println("Course deactivated.");
        }

    }

