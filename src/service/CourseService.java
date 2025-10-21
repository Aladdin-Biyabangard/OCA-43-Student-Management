package service;

import entity.CourseEntity;
import repository.CourseRepository;

public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
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
}
