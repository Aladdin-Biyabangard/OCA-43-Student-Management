package repository;

import entity.CourseEntity;

import java.util.HashMap;
import java.util.Map;

public class CourseRepository {
    private Map<String, CourseEntity> courses = new HashMap<>();

    public Map<String, CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, CourseEntity> courses) {
        this.courses = courses;
    }
}
