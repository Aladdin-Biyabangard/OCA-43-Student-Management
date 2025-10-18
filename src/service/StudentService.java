package service;

import entity.CourseEntity;
import entity.StudentEntity;
import repository.StudentRepository;

import java.util.List;
import java.util.Map;

public class StudentService {
    private StudentRepository studentRepository;
    private CourseService courseService;
    private

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public StudentService(CourseService courseService){
        this.courseService = courseService;
    }
    public void enrollStudent(){
        CourseEntity course = courseService.getCourse(String.valueOf(1));
    }
}
