package com.mycompany.ejercicio1punto2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtDinero;
    @FXML private TextArea txtResultado;

    @FXML private void btnDesglosar_click() {
        int dinero = Integer.parseInt(txtDinero.getText());
        
        int b500 = dinero / 500;
        dinero = dinero % 500;
        
        int b200 = dinero / 200;
        dinero = dinero % 200;
        
        int b100 = dinero / 100;
        dinero = dinero % 100;
        
        int b50 = dinero / 50;
        dinero = dinero % 50;
        
        int b20 = dinero / 20;
        dinero = dinero % 20;
        
        int m10 = dinero / 10;
        dinero = dinero % 10;
        
        int m5 = dinero / 5;
        dinero = dinero % 5;
        
        int m2 = dinero / 2;
        dinero = dinero % 2;
        
        int m1 = dinero / 1;
        
        txtResultado.setText(
            "Billetes de $500: " + b500 + "\n" +
            "Billetes de $200: " + b200 + "\n" +
            "Billetes de $100: " + b100 + "\n" +
            "Billetes de $50: " + b50 + "\n" +
            "Billetes de $20: " + b20 + "\n" +
            "Monedas de $10: " + m10 + "\n" +
            "Monedas de $5: " + m5 + "\n" +
            "Monedas de $2: " + m2 + "\n" +
            "Monedas de $1: " + m1
        );
    }

    @FXML
    private void btnLimpiar_click() {
        txtDinero.setText("");
        txtResultado.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}