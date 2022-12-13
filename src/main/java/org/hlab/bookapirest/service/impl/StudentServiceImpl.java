package org.hlab.bookapirest.service.impl;

import org.hlab.bookapirest.model.Student;
import org.hlab.bookapirest.repository.StudentRepository;
import org.hlab.bookapirest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
       Optional<Student> optional=studentRepository.findById(id);
       Student student;
       if(optional.isPresent()){
           student=optional.get();
       }else {
           throw new RuntimeException("Student not found");
       }
       return optional;
    }

    @Override
    public void deleteStudentByID(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student temp=studentRepository.findById(student.getId()).orElse(null);
        if(temp!=null){
            temp.setFirstName(student.getFirstName());
            temp.setLastName(student.getLastName());
            temp.setFaculte(student.getFaculte());
            temp.setOption(student.getOption());
            temp.setPromotion(student.getPromotion());
            studentRepository.save(temp);
        } else throw new RuntimeException("Employee not found");

    }
}
