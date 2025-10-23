package Service;

import entity.StudentEntity;
import repository.StudentRepository;

import java.util.Map;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public void removeStudent(String studentId) {
        Map<String, StudentEntity> students = studentRepository.getStudents();
        students.remove(studentId); 
    }
}
