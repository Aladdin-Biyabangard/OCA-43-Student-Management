package service;

import entity.CourseEntity;

import java.util.List;
import java.util.Map;

public class CourseService {

    public CourseEntity getCourse(String courseId){
        Map<String, CourseEntity> courses =  courseRepository.getCourses();

    }
}