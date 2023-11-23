package de.dexterbrings.temperaturumrechner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainController {

    @FXML
    private Label lblFehler;
    @FXML
    private Label lblFahrenheit;

    @FXML
    private Label lblCelsius;

    @FXML
    private TextField tfFahrenheit;

    @FXML
    private TextField tfCelsius;

    @FXML
    protected void onClick() throws IOException {
        int eingabe = Integer.parseInt(tfFahrenheit.getText());
        int ausgabe = (eingabe - 32) * 5 / 9;
        tfCelsius.setText(""+ausgabe);


    }
}