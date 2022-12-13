package org.hlab.bookapirest.service.impl;

import org.hlab.bookapirest.model.Student;
import org.hlab.bookapirest.repository.StudentRepository;
import org.hlab.bookapirest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudentByID(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        if(studentRepository.findById(student.getId()).isPresent()){
            studentRepository.save(student);
        }
        else
        {
            throw new RuntimeException();
        }
    }
}