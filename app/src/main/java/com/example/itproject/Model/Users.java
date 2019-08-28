package com.example.itproject.Model;

public class Users {
    private  String surname, othernames, department, faculty, regNumber, studentID, password;

    private Users () {

    }

    public Users(String surname, String othernames, String department, String faculty, String regNumber, String studentID, String password) {
        this.surname = surname;
        this.othernames = othernames;
        this.department = department;
        this.faculty = faculty;
        this.regNumber = regNumber;
        this.studentID = studentID;
        this.password = password;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOthernames() {
        return othernames;
    }

    public void setOthernames(String phone) {
        this.othernames = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String password) {
        this.department = password;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String image) {
        this.faculty = image;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String address) {
        this.regNumber = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String address) {
        this.studentID = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String address) {
        this.password = address;
    }


}