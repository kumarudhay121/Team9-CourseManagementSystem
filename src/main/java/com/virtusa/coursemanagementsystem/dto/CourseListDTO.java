package com.virtusa.coursemanagementsystem.dto;

public class CourseListDTO {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private String instructor;

    // Constructor

    public CourseListDTO() {

    }

    public CourseListDTO(int courseId, String courseName, String courseDescription, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.instructor = instructor;
    }

    // Getters and setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    // toString() method to display course information
    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription=" + courseDescription
                + ", instructor=" + instructor + "]";
    }
}
