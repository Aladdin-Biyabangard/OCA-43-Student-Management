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
        if (studentRepository.getStudents().containsKey(studentId)) {
            return true;
        }
        return false;
    }

    public void addStudent(StudentEntity student) {
        studentRepository.getStudents().put(student.getId(), student);
    }

    public void removeStudent(String studentId) {
        studentRepository.getStudents().remove(studentId);
    }

    public void updateStudent1(String studentId, StudentEntity updatedStudent) {
        Map<String, StudentEntity> students = studentRepository.getStudents();
        StudentEntity studentEntity = students.get(studentId);
        students.put(studentId, studentEntity);
    }
    public void enrollToCourse(String studentId,String courseId) {
        Map<String, StudentEntity> students = studentRepository.getStudents();
        student.







    }

}


//  StudentEntity studentEntity = studentRepository.getStudents().get(studentId);
//        studentEntity.getEnrolledCoursesIds().add(courseId);
//        studentRepository.getStudents().put(studentId, studentEntity);


