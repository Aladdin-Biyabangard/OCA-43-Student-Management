package service;

import entity.CourseEntity;
import entity.StudentEntity;
import repository.CourseRepository;
import repository.StudentRepository;

import java.util.List;
import java.util.Map;


public class StudentService {
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository){
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }



    public void addStudent(StudentEntity student){
        studentRepository.getStudents().put(student.getId(),student);
    }

    public void removeStudent(String studentId){
        studentRepository.getStudents().remove(studentId);
    }

    public void updateStudent(StudentEntity student){
        studentRepository.getStudents().put(student.getId(), student);
    }

    public List<StudentEntity> getStudents(){
        return List.copyOf(studentRepository.getStudents().values());
    }

    public void enrollToCourse(String studentId, String courseId){
        Map<String, CourseEntity> courses = courseRepository.getCourses();
        CourseEntity courseEntity = courses.get(courseId);
        courseEntity.getStudentIds().add(studentId);
        courses.put(courseId, courseEntity);
    }

}