module pl.ptemich.fxslayer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pl.ptemich.fxslayer to javafx.fxml;
    exports pl.ptemich.fxslayer;
}