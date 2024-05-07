package com.virtusa.coursemanagementsystem.dto;

public class CourseDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
    private double rating;

    public CourseDTO() {
    }

    public CourseDTO(Long id, String name, String description, double price, double rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "CourseDTO [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", rating=" + rating + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
