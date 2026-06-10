package learnermanagement;

public class Enrollment {

        private int id;
        private int studentId;
        private int courseId;
        private String enrollmentDate;
        private String status;


        public Enrollment() {
        }


        public Enrollment(int id,
                          int studentId,
                          int courseId,
                          String enrollmentDate,
                          String status) {

            this.id = id;
            this.studentId = studentId;
            this.courseId = courseId;
            this.enrollmentDate = enrollmentDate;
            this.status = status;
        }



        public int getId() {
            return id;
        }

        public int getStudentId() {
            return studentId;
        }

        public int getCourseId() {
            return courseId;
        }

        public String getEnrollmentDate() {
            return enrollmentDate;
        }

        public String getStatus() {
            return status;
        }


        public void setId(int id) {
            this.id = id;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public void setEnrollmentDate(String enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Enrollment{" +
                    "id=" + id +
                    ", studentId=" + studentId +
                    ", courseId=" + courseId +
                    ", enrollmentDate='" + enrollmentDate + " " +
                    ", status='" + status + " " +
                    '}';
        }
    }

