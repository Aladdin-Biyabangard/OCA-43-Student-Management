package service;

import entity.StudentEntity;
import repository.StudentRepository;

import java.util.Map;


public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void updateStudent(String studentId, StudentEntity updateStudent) {
        if (checkStudent(studentId)) {
            studentRepository.getStudents().put(studentId, updateStudent);
        }

    }

    public boolean checkStudent(String studentId) {
        Map<String, StudentEntity> students = studentRepository.getStudents();

        for (String id : students.keySet()) {
            if (id.equals(studentId)) {
                return true;
            }
        }
        return false;
    }
}
