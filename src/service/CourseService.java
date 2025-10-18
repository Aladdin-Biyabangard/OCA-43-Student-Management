package service;

import entity.CourseEntity;
import repository.CourseRepository;
import repository.StudentRepository;

import java.util.Map;

public class CourseService {
    private CourseRepository courseRepository;
    private StudentRepository studentRepository;

    public CourseService(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    public void addCourse(CourseEntity course) {
        courseRepository.getCourses().put(course.getId(), course);
    }

    public void updateCourse(String courseId, CourseEntity updatedCourse) {
        if (checkCourse(courseId)) {
            courseRepository.getCourses().put(courseId, updatedCourse);
        }
    }


    public boolean checkCourse(String id) {
        if (courseRepository.getCourses().containsKey(id)) {
            return true;
        }
        return false;
    }

    public void addStudentToCourse(String courseId, String studentId) {
        Map<String, CourseEntity> courses = courseRepository.getCourses();

        CourseEntity courseEntity = courses.get(courseId);
        courseEntity.getStudentIds().add(studentId);
        courses.put(courseId,courseEntity);

    }
}
