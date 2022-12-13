package org.hlab.bookapirest.service;

import org.hlab.bookapirest.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getStudents();
    Optional<Student> findStudentById(long id);
    void deleteStudentByID(long id);
    void updateStudent(Student student);

}
