package service;

import entity.CourseEntity;
import repository.CourseRepository;

import java.util.List;
import java.util.Map;

public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public void addCourse(CourseEntity course){
        courseRepository.getCourses().put(course.getId(), course);
    }

    public void updateCourse(CourseEntity course){
        courseRepository.getCourses().put(course.getId(), course);
    }
    
    public void removeCourse(String courseId){
        courseRepository.getCourses().remove(courseId);
    }


    public List<CourseEntity> getCourses(){
        return List.copyOf(courseRepository.getCourses().values());
    }
}