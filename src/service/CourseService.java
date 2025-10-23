package service;

import Exceptions.NotFoundException;
import entity.CourseEntity;
import entity.StudentEntity;
import repository.CourseRepository;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
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
        }else {
            throw new NotFoundException("Course not found");
        }
    }

    public void addStudentToCourse(String courseId, String studentId) {
        Map<String, CourseEntity> courses = courseRepository.getCourses();

        CourseEntity courseEntity = courses.get(courseId);
        courseEntity.getStudentIds().add(studentId);
        courses.put(courseId, courseEntity);

    }

    public List<StudentEntity> listStudents(String courseId) {
        Map<String, CourseEntity> courses = courseRepository.getCourses();

        List<StudentEntity> students = new ArrayList<>();

        Map<String, StudentEntity> allStudents = studentRepository.getStudents();
        for (String id : courses.get(courseId).getStudentIds()) {
            StudentEntity student = allStudents.get(id);
            if (student != null) {
                students.add(student);
            }
        }
        return students;
    }

    public void removeCourse(String courseId){
        if (checkCourse(courseId)){
        courseRepository.getCourses().remove(courseId);
        }
    }
}
