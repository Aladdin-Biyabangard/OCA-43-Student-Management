package entity;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class StudentEntity {
    private String id;
    private String name;
    private String email;
    private List<String> enrolledCoursesIds;

    public StudentEntity(String name, String email, List<String> enrolledCoursesIds) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.enrolledCoursesIds = enrolledCoursesIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getEnrolledCoursesIds() {
        return enrolledCoursesIds;
    }

    public void setEnrolledCoursesIds(List<String> enrolledCoursesIds) {
        this.enrolledCoursesIds = enrolledCoursesIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
