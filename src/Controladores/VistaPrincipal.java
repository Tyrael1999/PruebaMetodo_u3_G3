package Controladores;

<<<<<<< HEAD
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class VistaPrincipal {
    @FXML
    VBox cajaMatriz;

    public void initialize() {

    }

    private void EventoC(Rectangle r, int i, int j) {

        r.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if (r.getFill() == Paint.valueOf("RED")) {/*
                    ((Rectangle)((HBox)(cajasd.getChildren().get(i+1))).getChildren().get(j)).setFill(Paint.valueOf("BLUE"));
                    ((HBox)(cajasd.getChildren().get(i-1))).getChildren().get(j)
                    ((HBox)(cajasd.getChildren().get(i))).getChildren().get(j+1);
                    ((HBox)(cajasd.getChildren().get(i))).getChildren().get(j-1);*/
                } else {
                    r.setFill(Paint.valueOf("RED"));
                }


                System.out.println("pos :(click");// se vera en consola las cordenadas de la tabla

                //r.setImage(new Image(getClass().getResource("imagen.png").toExternalForm()));

                //r.setImage(new Image(getClass().getResource("cargar.png").toExternalForm()));


            }

        });


    }

    public void CrearMatriz() {

        cajaMatriz.setSpacing(2);
        for (int i = 0; i < 36; i++) {
            HBox cajan = new HBox();
            for (int j = 0; j < 36; j++) {
                Rectangle rec = new Rectangle(15, 15);
                EventoC(rec, i, j);
                cajan.getChildren().add(rec);
                cajan.setSpacing(2);
            }
            cajaMatriz.getChildren().add(cajan);


        }
=======
public class VistaPrincipal {
    public void initialize(){
        
>>>>>>> parent of 7a2b9a9... Agregar logos a Vista Principal
    }
}