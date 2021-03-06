package Controladores;

import com.jfoenix.controls.JFXButton;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class controlador {
    @FXML
    private VBox cajaMatriz;
    @FXML
    private JFXButton reiniciarJuegoBT;
    @FXML
    private Text tiempo;

    private void cronometro(){
        AnimationTimer timer = new AnimationTimer() {
            private long inicioT;
            private long tiempoCalculado = 0;
            private long fraccion = 0;

            @Override
            public void start() {
                inicioT = System.currentTimeMillis() - fraccion;
                super.start();
            }

            @Override
            public void stop() {
                super.stop();
                fraccion = System.currentTimeMillis() - inicioT;
            }

            @Override
            public void handle(long now) {
                long newTime = System.currentTimeMillis();
                if (inicioT + 1000 <= newTime) {
                    long deltaT = (newTime - inicioT) / 1000;
                    tiempoCalculado += deltaT;
                    inicioT += 1000 * deltaT;
                    tiempo.setText(Long.toString(tiempoCalculado));
                }
            }
        };
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

    public void reiniciarJuego(){
        Stage stage = (Stage) reiniciarJuegoBT.getScene().getWindow();
        stage.close();
    }

    public void CrearMatriz(){

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
    }

}
