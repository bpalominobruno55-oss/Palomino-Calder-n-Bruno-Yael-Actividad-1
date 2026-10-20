package com.mycompany.ejercicio1punto5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoMayor;

    @FXML
    private void btnCalcular_click() {
        int alim = Integer.parseInt(txtAlimentacion.getText());
        int refri = Integer.parseInt(txtRefrigerios.getText());
        int trans = Integer.parseInt(txtTransporte.getText());
        int tel = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());
        
        int total = alim + refri + trans + tel + otros;
        txtTotal.setText(total + "");
        
        int mayor = alim;
        String nombreMayor = "Alimentacion";
        
        if (refri > mayor) {
            mayor = refri;
            nombreMayor = "Refrigerios";
        }
        if (trans > mayor) {
            mayor = trans;
            nombreMayor = "Transporte";
        }
        if (tel > mayor) {
            mayor = tel;
            nombreMayor = "Telefonia";
        }
        if (otros > mayor) {
            mayor = otros;
            nombreMayor = "Otros";
        }
        
        txtGastoMayor.setText(nombreMayor);
    }

    @FXML
    private void btnLimpiar_click() {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtGastoMayor.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}