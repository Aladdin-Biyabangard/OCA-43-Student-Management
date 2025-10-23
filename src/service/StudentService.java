package service;

import Exceptions.NotFoundException;
import entity.CourseEntity;
import entity.StudentEntity;
import repository.CourseRepository;
import repository.StudentRepository;

import java.util.List;
import java.util.Map;


public class StudentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }


    public void updateStudent(String studentId, StudentEntity updateStudent) {
        if (checkStudent(studentId)) {
            studentRepository.getStudents().put(studentId, updateStudent);
        }

    }

    public boolean checkStudent(String studentId) {
        if (studentRepository.getStudents().containsKey(studentId)) {
            return true;
        } else {
            throw new NotFoundException("Student Not Found");
        }
    }

    public void addStudent(StudentEntity student) {
        studentRepository.getStudents().put(student.getId(), student);
    }

    public void removeStudent(String studentId) {
        if (checkStudent(studentId)) {
            studentRepository.getStudents().remove(studentId);
        }
    }

    public void enrollToCourse(String studentId, String courseId) {
        Map<String, CourseEntity> courses = courseRepository.getCourses();

        CourseEntity course = courses.get(courseId);
        course.getStudentIds().add(studentId);
        courses.put(courseId, course);
    }

    public void listCourse(String studentId) {
        StudentEntity student = studentRepository.getStudents().get(studentId);
        List<String> enrolledCoursesIds = student.getEnrolledCoursesIds();
        for (String ids : enrolledCoursesIds) {
            CourseEntity course = courseRepository.getCourses().get(ids);

        }
    }
}
