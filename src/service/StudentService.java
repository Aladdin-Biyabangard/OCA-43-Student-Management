package Service;

import entity.StudentEntity;
import repository.StudentRepository;

import java.math.BigDecimal;
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
        if (studentRepository.getStudents().containsKey(studentId)) {
            return true;
        }
        return false;
    }

    public void addStudent(StudentEntity student) {
        studentRepository.getStudents().put(student.getId(),student);
    }

    public void removeStudent(String studentId) {
        studentRepository.getStudents().remove(studentId );
    }

    public void updateStudent(String studentId, StudentEntity updateStudent) {


    }
}

