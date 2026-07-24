package org.diegoraguay.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.diegoraguay.model.Usuario;

public class AdminDashboardController implements Initializable {

    @FXML Label lblBienvenida; 
    private Usuario usuarioActual; 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void iniciarUsuario(Usuario usuario) {
        this.usuarioActual = usuario; 
        lblBienvenida.setText("Bienvenido administrado " + usuario.getUsrname());     
        
    }
}
