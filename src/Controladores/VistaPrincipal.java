package Controladores;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VistaPrincipal {
    @FXML ImageView virus1;
    @FXML ImageView virus2;
    @FXML Image URLvirus;
    public void initialize(){
        URLvirus = new Image("Imágenes/virus.png");
        virus1.setImage(URLvirus);
        virus2.setImage(URLvirus);
    }
}
