module com.example.tp8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp8 to javafx.fxml;
    exports com.example.tp8;
}