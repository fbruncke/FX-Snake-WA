package com.example.fxsnakewa;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {
    @FXML
    private Canvas canvas;

    @FXML
    private StackPane backgPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        backgPane.setStyle("-fx-background-color: white");

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
        gc.setFont(theFont);
        gc.fillText("Hello, Snake!", 60, 50);
        gc.setFill(Color.BLUE);
        gc.fill();

        //initialize instance variables (State)

        //Setup eventhandlers

        //Setup and start the game loop
            //handle input
            //update state
            //update the UI + sound
            //Game over -> reset instance variable


    }
}