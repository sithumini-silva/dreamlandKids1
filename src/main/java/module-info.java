module lk.ijse.gdse71.dreamlandkids {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires lombok;
    requires net.sf.jasperreports.core;
    requires java.mail;
    requires java.sql;
    requires java.desktop;

    opens lk.ijse.gdse71.dreamlandkids.controller to javafx.fxml;
    exports lk.ijse.gdse71.dreamlandkids;
}