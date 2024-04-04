module com.example.fxsnakewa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxsnakewa to javafx.fxml;
    exports com.example.fxsnakewa;
}