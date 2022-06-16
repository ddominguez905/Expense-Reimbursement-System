package com.example.entity;

import java.util.Objects;

//Fields that map to database
public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    private int employeeId;
    private EmployeeRole role;

    public Employee(String firstName, String lastName, int id, EmployeeRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = id;
        this.role = role;
    }

    public Employee() {
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && role == employee.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeRole);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", role=" + role +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.role.compareTo(o.getRole());
    }
}

