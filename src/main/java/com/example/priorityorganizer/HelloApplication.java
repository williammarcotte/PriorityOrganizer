package com.example.priorityorganizer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Shape;
import java.util.ArrayDeque;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.IOException;

public class HelloApplication extends Application {
    VBox root = new VBox();
    ShapeGenerator gen = new CircleGenerator(root);
    TextField f1;
    TextField f2;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Priority Organizer");


        VBox vbox = new VBox();
        HBox hbox = new HBox();
        VBox vbox1 = new VBox();
        VBox vbox2 = new VBox();
        VBox vbox3 = new VBox();


        Label l1 = new Label("Enter word:");
        f1 = new TextField();

        vbox1.getChildren().add(l1);
        vbox1.getChildren().add(f1);

        Label l2 = new Label("How important is this?");
        f2 = new TextField();
        f2.setPromptText("0% - 100%");

        vbox2.getChildren().add(l2);
        vbox2.getChildren().add(f2);

        Button addShape = new Button("Add");
        addShape.setOnAction(new Add());

        Button undo = new Button("Undo");
        undo.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                gen.undo();
            }
        });

        vbox3.getChildren().add(addShape);
        vbox3.getChildren().add(undo);
        vbox3.setSpacing(10);

        hbox.setSpacing(100);

        vbox.getChildren().add(hbox);
        vbox.getChildren().add(root);

        hbox.getChildren().add(vbox1);
        hbox.getChildren().add(vbox2);
        hbox.getChildren().add(vbox3);







        Scene scene = new Scene(vbox,1000,1000);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    class Add implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            try {
                gen.createShape(Integer.parseInt(f2.getText()),f1.getText());
            }
            catch(Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Invalid input number");
                alert.setHeaderText("Unexpected input");
                alert.setContentText("Enter values again");
                alert.showAndWait();
            }
        }
    }
}