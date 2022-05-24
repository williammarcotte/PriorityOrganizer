package com.example.priorityorganizer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Shape;
import java.util.ArrayDeque;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        HBox hbox = new HBox();

        Label hello = new Label("hello");
        hbox.getChildren().add(hello);

        Scene scene = new Scene(hbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}