package repository;

import entity.StudentEntity;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

    private Map<String, StudentEntity> students = new HashMap<>();

    public Map<String, StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(Map<String, StudentEntity> students) {
        this.students = students;
    }
}
