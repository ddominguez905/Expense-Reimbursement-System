package com.example.entity;

import java.time.*;

public class Reimburse {
    private int id;
    private double amount;
    private ReimbursementStatus status;
    private LocalDate localDate;

    private Employee employee;

    public Reimburse(int id, double amount, ReimbursementStatus status, LocalDate localDate, Employee employee) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.localDate = localDate;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ReimbursementStatus getStatus() {
        return status;
    }

    public void setStatus(ReimbursementStatus status) {
        this.status = status;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Reimburse{" +
                "id=" + id +
                ", amount=" + amount +
                ", status=" + status +
                ", localDate=" + localDate +
                ", employee=" + employee +
                '}';
    }


}
