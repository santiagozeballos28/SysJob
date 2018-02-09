package com.company.model;

/**
 *
 * @author santiago.mamani
 */
public class Employee {

    private int idEmployee;
    private String lastName;
    private String firstName;
    private String email;
    private String dateOfHire;

    public Employee() {
    }

    public Employee(int idEmployee, String lastName, String firstName, String email, String dateOfHire) {
        this.idEmployee = idEmployee;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.dateOfHire = dateOfHire;
    }

    public Employee(String lastName, String firstName, String email, String dateOfHire) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.dateOfHire = dateOfHire;
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
}
