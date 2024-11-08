package lk.ijse.gdse71.dreamlandkids;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Appinitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader
                .load(this.getClass().getResource("/view/CustomerView.fxml"))));
        stage.setTitle("Login Form");
        stage.centerOnScreen();
        stage.show();
    }
}
