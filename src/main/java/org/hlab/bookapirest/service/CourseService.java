package org.hlab.bookapirest.service;

import org.hlab.bookapirest.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    Course saveCourse(Course course);
    List<Course> getCourses();
    Optional<Course> getCourseByID(long id);
    void deleteCourseByID(Course course);
}
