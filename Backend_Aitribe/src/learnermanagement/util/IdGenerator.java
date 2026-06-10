package learnermanagement.util;

public class IdGenerator {


        private static int studentId = 100000;
        private static int courseId = 100;
        private static int enrollmentId = 26000;

        public static int getNextStudentId() {
            return ++studentId;
        }

        public static int getNextCourseId() {
            return ++courseId;
        }

        public static int getNextEnrollmentId() {
            return ++enrollmentId;
        }
}

