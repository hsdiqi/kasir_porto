module porto.kasir {
    requires javafx.controls;
    requires javafx.fxml;


    opens porto.kasir to javafx.fxml;
    exports porto.kasir;
}