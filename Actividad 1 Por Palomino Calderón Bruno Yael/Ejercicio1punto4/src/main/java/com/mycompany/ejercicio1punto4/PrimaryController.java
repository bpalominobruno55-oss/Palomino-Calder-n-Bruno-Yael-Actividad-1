package com.mycompany.ejercicio1punto4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtTabla;

    @FXML
    private void btnCalcular_click() {
        int num = Integer.parseInt(txtNumero.getText());
        String resultado = "";
        
        for (int i = 1; i <= 10; i++) {
            int multiplicacion = num * i;
            resultado = resultado + num + " x " + i + " = " + multiplicacion + "\n";
        }
        
        txtTabla.setText(resultado);
    }

    @FXML
    private void btnLimpiar_click() {
        txtNumero.setText("");
        txtTabla.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}