package com.example.student.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

  private @Id
  @GeneratedValue Long id;
  private String name;
  private String email;
    private LocalDateTime registrationDate;

    public Student(String email, String name, LocalDateTime registrationDate) {
        this.email = email;
        this.name = name;
        this.registrationDate = registrationDate;
    }
  
    public Student() {
        //TODO Auto-generated constructor stub
    }



  // Default constructor
  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }



  public void setId(Long id) {
    this.id = id;
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

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}