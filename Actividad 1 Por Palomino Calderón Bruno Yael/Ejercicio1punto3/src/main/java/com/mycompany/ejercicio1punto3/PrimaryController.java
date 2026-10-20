package com.mycompany.ejercicio1punto3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtImpares;
    @FXML private TextField txtPares;
    @FXML private TextField txtTotal;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void btnAnalizar_click() {
        int num = Integer.parseInt(txtNumero.getText());
        int temp = num;
        
        int cant = 0;
        int pares = 0;
        int impares = 0;
        int total = 0;
        int mayor = 0;
        int menor = 9;
        
        while (temp > 0) {
            int digito = temp % 10;
            
            cant = cant + 1;
            total = total + digito;
            
            if (digito % 2 == 0) {
                pares = pares + digito;
            } else {
                impares = impares + digito;
            }
            
            if (digito > mayor) {
                mayor = digito;
            }
            if (digito < menor) {
                menor = digito;
            }
            
            temp = temp / 10;
        }
        
        txtCantidad.setText(cant + "");
        txtImpares.setText(impares + "");
        txtPares.setText(pares + "");
        txtTotal.setText(total + "");
        txtMayor.setText(mayor + "");
        txtMenor.setText(menor + "");
        
        String divisores = "";
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores = divisores + i + "\n";
            }
        }
        txtDivisores.setText(divisores);
    }

    @FXML
    private void btnLimpiar_click() {
        txtNumero.setText("");
        txtCantidad.setText("");
        txtImpares.setText("");
        txtPares.setText("");
        txtTotal.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtDivisores.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
