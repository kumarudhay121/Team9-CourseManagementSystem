package com.virtusa.coursemanagementsystem.util;


import com.virtusa.coursemanagementsystem.dto.CourseListDTO;

import java.util.List;

public class EnrolledCoursesService {
    private EnrolledCoursesDAO enrolledCoursesDAO;

    public EnrolledCoursesService() {
        this.enrolledCoursesDAO = new EnrolledCoursesDAO();
    }

    // Method to retrieve enrolled courses using DAO layer
    public List<CourseListDTO> retrieveEnrolledCourses(String studentId) {
        return enrolledCoursesDAO.retrieveEnrolledCourses(studentId);
    }
}
