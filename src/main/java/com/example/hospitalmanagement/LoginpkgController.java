package com.example.hospitalmanagement;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginpkgController
{
    @javafx.fxml.FXML
    private TextField usernameTF;
    @javafx.fxml.FXML
    private TextField passwordTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logiButtonOA(ActionEvent actionEvent) {
        String id,password;
        boolean flag = true;
        Alert alert = new Alert(Alert.AlertType.ERROR);
        id = usernameTF.getText();
        password = passwordTF.getText();
        if (id.isBlank()){
            flag = false;
            alert.setTitle("UserId Error");
            alert.setContentText("User ID can not be blank");
        }
        if (password.isBlank()){
            flag = false;
            alert.setTitle("Password Error");
            alert.setContentText("User passwordd can not be blanked");
        }
        if (flag){
            if (id.length() == 7){
                //login as a patient

            } else if (id.length() == 4) {
                //login as a Doctor
            } else if (id.length() == 5) {
                //login as a Admin
            }
            else
            {
                alert.setTitle("User Id Error");
                alert.setContentText("User ID does not exist.");
            }
    }   }

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {
    }
}