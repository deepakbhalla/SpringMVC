package com.demo.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;

public class Employee {

  @Size(min = 5, max = 10)
  public String firstName;

  @Size(min = 5, max = 10)
  public String lastName;

  @NotNull
  @Min(15)
  private int age = 15;

  @Size(min = 5, max = 10)
  public String address;

  @Email
  public String email;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
