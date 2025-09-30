module org.example.extendedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.extendedcalculator to javafx.fxml;
    exports org.example.extendedcalculator;
}