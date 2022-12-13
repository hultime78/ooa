package org.hlab.bookapirest.service.impl;

import org.hlab.bookapirest.model.Course;
import org.hlab.bookapirest.repository.CourseRepository;
import org.hlab.bookapirest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseByID(long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void deleteCourseByID(long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public void updateCourse(Course course) {
        Course temp=courseRepository.findById(course.getId()).orElse(null);
        if(temp!=null){
            temp.setName(course.getName());
            temp.setPoints(course.getPoints());
            courseRepository.save(temp);
        }else throw new RuntimeException();
    }
}
