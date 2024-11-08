package lk.ijse.gdse71.dreamlandkids.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainLayoutController implements Initializable {

    @FXML
    private AnchorPane content;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        navigateTo("/view/CustomerView.fxml");
    }

    @FXML
    void navigateToCustomerPage(ActionEvent event) {
        navigateTo("/view/CustomerView.fxml");
    }

    @FXML
    void navigateToItemPage(ActionEvent event) {
        navigateTo("/view/ItemView.fxml");
    }

    @FXML
    void navigateToOrdersPage(ActionEvent event) {
        navigateTo("/view/OrdersView.fxml");
    }

    public void navigateTo(String fxmlPath) {
        try {
            content.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlPath));

            load.prefWidthProperty().bind(content.widthProperty());
            load.prefHeightProperty().bind(content.heightProperty());

            content.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Fail to load page!").show();
        }
    }

    public void navigateToSendMailPage(ActionEvent actionEvent) {
        navigateTo("/view/SendMailView.fxml");
    }

    public void actproduct(ActionEvent actionEvent) {
    }

    public void actorders(ActionEvent actionEvent) {
    }

    public void actemployee(ActionEvent actionEvent) {
    }

    public void actcustomer(ActionEvent actionEvent) {
    }

    public void actsupplier(ActionEvent actionEvent) {
    }

    public void actmail(ActionEvent actionEvent) {

    }
}
