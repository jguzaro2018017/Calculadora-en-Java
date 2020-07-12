    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joelguzaro.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Math;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    float dato1, dato2,resultado;
    int op;
    int num1 = 1;
    @FXML Button btnMasMenos;
    @FXML Button btnCero;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnSuma;
    @FXML Button btnResta;
    @FXML Button btnMultiplicacion;
    @FXML Button btnDivision;
    @FXML Button btnCuadrado;
    @FXML Button btnC;
    @FXML Button btnCE;
    @FXML Button btnRaizCuadrada;
    @FXML Button btnPorcentaje;
    @FXML Button btnUnoX;
    @FXML TextField txtValores;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        if(event.getSource()== btnCero)
            txtValores.setText(txtValores.getText()+"0");
        else if(event.getSource() == btnUno)
            txtValores.setText(txtValores.getText()+"1");
        else if(event.getSource()== btnDos)
            txtValores.setText(txtValores.getText()+"2");
        else if(event.getSource()== btnTres)
            txtValores.setText(txtValores.getText()+"3");
        else if(event.getSource() == btnCuatro)
            txtValores.setText(txtValores.getText()+"4");
        else if(event.getSource() == btnCinco)
            txtValores.setText(txtValores.getText()+"5");
        else if(event.getSource()== btnSeis)
            txtValores.setText(txtValores.getText()+"6");
        else if(event.getSource() == btnSiete)
            txtValores.setText(txtValores.getText()+"7");
        else if(event.getSource() == btnOcho)
            txtValores.setText(txtValores.getText()+"8");
        else if(event.getSource() == btnNueve)
            txtValores.setText(txtValores.getText()+"9");
        else if(event.getSource() == btnSuma){
            op = 1;
            dato1= Float.parseFloat(txtValores.getText());
            txtValores.setText("");
        }else if(event.getSource() == btnResta){
            op = 2;
            dato1= Float.parseFloat(txtValores.getText());
            txtValores.setText("");
        }else if(event.getSource() == btnMultiplicacion){
            op = 3;
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
        }else if(event.getSource() == btnDivision ){
            op = 4;
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");         
        }else if(event.getSource() == btnCuadrado){
            op = 5;
            dato1 = Float.parseFloat(txtValores.getText());
        }else if(event.getSource() == btnRaizCuadrada){
            op = 6;
            dato1 = Float.parseFloat(txtValores.getText());
        }else if(event.getSource() == btnUnoX){
            op = 7;
            dato1 = Float.parseFloat(txtValores.getText());
        }else if(event.getSource() == btnPorcentaje){
            op = 8;
            dato1 = Float.parseFloat(txtValores.getText());
        }else if(event.getSource() == btnPunto) {
            txtValores.setText(txtValores.getText()+".");
        }else if(event.getSource() == btnC){
            if(txtValores.getText().length()!=0){
                txtValores.setText(txtValores.getText().substring(0, 
                    txtValores.getText().length()-1));}
        }else if(event.getSource() == btnCE){
            txtValores.setText("");
        }else if(event.getSource()== btnIgual){
            dato2= Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            
        switch(op){
            case 1:
                resultado = dato1 + dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
            case 2:
                resultado = dato1 - dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
            case 3:
                resultado = dato1 * dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
            case 4:
                if(dato1 == 0)
                    txtValores.setText("");
                else if(dato2 == 0)
                    txtValores.setText("");
                else if(dato1 != 0){
                    resultado = dato1 / dato2;
                    txtValores.setText(String.valueOf(resultado));}
                break;
            case 5:
                if(dato1 == 0)
                txtValores.setText("");
                else if(dato1 != 0){
                resultado = (dato1 * dato1);
                txtValores.setText(String.valueOf(resultado));}
                break;
            case 6:
                if(dato1 == 0)
                    txtValores.setText("");
                else if (dato1 != 0){
                resultado = (float) Math.sqrt(dato1);
                txtValores.setText(String.valueOf(resultado));}
                break;
            case 7:
                if(dato1 == 0)
                    txtValores.setText("");
                else if (dato1 != 0){                
                resultado = (float)(1 / dato1);
                txtValores.setText(String.valueOf(resultado));}
                break;
            case 8:
                if(dato1 == 0)
                    txtValores.setText("");
                else if (dato1 != 0){
                resultado = (float)((dato1 * dato1)/100);
                txtValores.setText(String.valueOf(resultado));}
                break;
                
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}