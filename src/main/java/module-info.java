module com.example.blackjackapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens com.example.blackjackapp to javafx.fxml;
    exports com.example.blackjackapp;
}