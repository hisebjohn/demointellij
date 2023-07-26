module com.example.demointellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demointellij to javafx.fxml;
    exports com.example.demointellij;
}