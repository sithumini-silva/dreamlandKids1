package lk.ijse.gdse71.dreamlandkids.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lombok.Setter;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.awt.*;
import java.util.Properties;

public class SendMailController {

    @FXML
    private TextArea txtBody;

    @FXML
    private TextField txtSubject;

    @Setter
    private String customerEmail;

    @FXML
    public void sendUsingSendgridOnAction(ActionEvent actionEvent) {
    }

    private void sendEmailWithSendgrid(String from, String to, String subject, String body) {
    }


    @FXML
    public void sendUsingGmailOnAction(ActionEvent actionEvent) {

    }
    private void sendEmailWithGmail(String from, String to, String subject, String messageBody) {

    }
}
