package Controladores;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class VistaPrincipal {
    @FXML ImageView virus1;
    @FXML ImageView virus2;
    @FXML Image URLvirus;
    @FXML JFXCheckBox principianteCB;
    @FXML JFXCheckBox intermedioCB;
    @FXML JFXCheckBox avanzadoCB;
    @FXML JFXButton iniciarJuegoBT;
    @FXML AnchorPane principalAP;
    int casillas;

    public void initialize(){
        URLvirus = new Image("Imágenes/virus.png");
        virus1.setImage(URLvirus);
        virus2.setImage(URLvirus);
    }

    public void principiante(){
        if (principianteCB.isSelected()){
            intermedioCB.setDisable(true);
            avanzadoCB.setDisable(true);
            iniciarJuegoBT.setDisable(false);
        }else{
            intermedioCB.setDisable(false);
            avanzadoCB.setDisable(false);
            iniciarJuegoBT.setDisable(true);
        }
        casillas = 9;
    }

    public void intermedio(){
        if (intermedioCB.isSelected()){
            principianteCB.setDisable(true);
            avanzadoCB.setDisable(true);
            iniciarJuegoBT.setDisable(false);
        }else{
            principianteCB.setDisable(false);
            avanzadoCB.setDisable(false);
            iniciarJuegoBT.setDisable(true);
        }
        casillas = 16;
    }

    public void avanzado(){
        if (avanzadoCB.isSelected()){
            principianteCB.setDisable(true);
            intermedioCB.setDisable(true);
            iniciarJuegoBT.setDisable(false);
        }else{
            principianteCB.setDisable(false);
            intermedioCB.setDisable(false);
            iniciarJuegoBT.setDisable(true);
        }
        casillas = 32;
    }

    public void iniciar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Interfaz/vista.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("BuscaCovid");
        primaryStage.getIcons().add(new Image("Imágenes/virus.png"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
