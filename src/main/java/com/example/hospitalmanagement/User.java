package com.example.hospitalmanagement;

import java.time.LocalDate;

public abstract class User {
    private String id, name, phoneNo,email,address, gender,password;
    private LocalDate dateofbirt, doj;

    public User(String name, String phoneNo, String email, String address, String gender, String password, LocalDate dateofbirt) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.dateofbirt = dateofbirt;
        this.doj = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateofbirt() {
        return dateofbirt;
    }

    public void setDateofbirt(LocalDate dateofbirt) {
        this.dateofbirt = dateofbirt;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", dateofbirt=" + dateofbirt +
                ", doj=" + doj +
                '}';
    }
    public abstract String geerateID();
}
