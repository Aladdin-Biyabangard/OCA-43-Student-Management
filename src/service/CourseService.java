package service;

import entity.CourseEntity;
import repository.CourseRepository;

public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addCourse(CourseEntity course) {

        courseRepository = new CourseRepository();

    }
}
