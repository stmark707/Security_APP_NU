module com.mycompany.csc300_securityapplication {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc300_securityapplication to javafx.fxml;
    exports com.mycompany.csc300_securityapplication;
}
