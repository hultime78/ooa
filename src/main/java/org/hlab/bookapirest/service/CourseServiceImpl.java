package org.hlab.bookapirest.service;

import org.hlab.bookapirest.model.Course;
import org.hlab.bookapirest.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

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
    public void deleteCourseByID(Course course) {
        courseRepository.delete(course);
    }
}
