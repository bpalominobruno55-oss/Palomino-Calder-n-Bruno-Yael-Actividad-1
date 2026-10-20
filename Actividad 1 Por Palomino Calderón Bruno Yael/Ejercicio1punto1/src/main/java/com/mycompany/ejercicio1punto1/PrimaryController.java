package com.mycompany.ejercicio1punto1;

import java.net.URL;
import java.util.ResourceBundle;
import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;

    @FXML
    private void btnCalcular_click() {
        String texto = txtFecha.getText();
        
        int mes = Integer.parseInt(texto.substring(3, 5));
        int ano = Integer.parseInt(texto.substring(6, 10));
        
        LocalDate hoy = LocalDate.now();
        int mesHoy = hoy.getMonthValue();
        int anoHoy = hoy.getYear();
        
        int rAnos = anoHoy - ano;
        int rMeses = mesHoy - mes;
        
        if (rMeses < 0) {
            rAnos = rAnos - 1;
            rMeses = rMeses + 12;
        }
        
        lblResultado.setText("Tiene " + rAnos + " años con " + rMeses + " meses");
    }

    @FXML
    private void btnLimpiar_click() {
        txtFecha.setText("");
        lblResultado.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}