package com.example.hospitalmanagement;

import com.example.hospitalmanagement.Patient.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CreateaccountController
{
    @FXML
    private TextArea addressTA;
    @FXML
    private RadioButton othersRB;
    @FXML
    private TextField nameTF;
    @FXML
    private TextField emailTF;
    @FXML
    private RadioButton maleRB;
    @FXML
    private TextField phoneNoTF;
    @FXML
    private TextArea showoutputTA;
    @FXML
    private TextField passwordTF;
    @FXML
    private RadioButton femaleRB;
    @FXML
    private DatePicker dateofbirthDP;
    @FXML
    private TextField emergencyContactTF;

    @FXML
    public void initialize() {
    }

    @FXML
    public void createaccountButtonOA(ActionEvent actionEvent) {
        String name, email, phoneNo, gender = "", emergency, address, password;
        LocalDate dateofbirth;
        boolean flag = true;
        name = nameTF.getText();
        email = emailTF.getText();
        phoneNo = phoneNoTF.getText();
        emergency = emergencyContactTF.getText();
        address = addressTA.getText();
        password = passwordTF.getText();
        dateofbirth = dateofbirthDP.getValue();
        if (maleRB.isSelected()){
            gender = "Male";
        }
        else if (femaleRB.isSelected()){
            gender = "Female";
        }
        else if (othersRB.isSelected()){
            gender = "Others";
        }
        Patient patient = new Patient(name, phoneNo,email,address,gender,password,dateofbirth,emergency);

        showoutputTA.clear();
        showoutputTA.setText(patient);

    }
}