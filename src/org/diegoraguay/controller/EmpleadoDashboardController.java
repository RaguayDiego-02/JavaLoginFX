package org.diegoraguay.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.diegoraguay.model.Usuario;

public class EmpleadoDashboardController implements Initializable, DashboardController {
    @FXML Label lblBienvenida;
    private Usuario usuarioActual;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void iniciarUsuario(Usuario usuario) {
        this.usuarioActual = usuario;
        lblBienvenida.setText("Bienvenido empleado " + usuario.getUsrname());
    }
}