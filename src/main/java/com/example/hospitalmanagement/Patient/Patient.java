package com.example.hospitalmanagement.Patient;

import com.example.hospitalmanagement.User;

import java.time.LocalDate;
import java.util.Random;

public class Patient extends User {
    private int status;//2 == pending, 1 == accepted, 0 == rejected;
    private String emergencyContact;
    public Patient(String name, String phoneNo, String email, String address, String gender, String password, LocalDate dateofbirt, String emergencyContact) {
        super(name, phoneNo, email, address, gender, password, dateofbirt);
        this.setId(this.geerateID());
        this.status = 2;
        this.emergencyContact = emergencyContact;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "status=" + status +
                ", emergencyContact='" + emergencyContact + '\'' +
                '}';
    }

    @Override
    public String geerateID() {
        String id = "";
        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000,9999999));
        return id;
    }
}
