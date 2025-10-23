package service;

import entity.CourseEntity;
import entity.StudentEntity;
import repository.CourseRepository;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReportingService {
    CourseRepository courseRepository;
    StudentRepository studentRepository;

    public ReportingService(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getAllStudents() {
        Map<String, StudentEntity> students = studentRepository.getStudents();
        List<StudentEntity> studentList = new ArrayList<>();
        for (Map.Entry<String, StudentEntity> entry : students.entrySet()) {
            studentList.add(entry.getValue());
        }
        return studentList;
    }

    public List<CourseEntity> getAllCourses() {
        Map<String, CourseEntity> courses = courseRepository.getCourses();
        List<CourseEntity> courseList = new ArrayList<>();
        for (Map.Entry<String, CourseEntity> entry : courses.entrySet()) {
            courseList.add(entry.getValue());
        }
        return courseList;
    }
}
