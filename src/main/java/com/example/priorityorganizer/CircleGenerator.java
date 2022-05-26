package com.example.priorityorganizer;

import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;

public class CircleGenerator extends ShapeGenerator{

    VBox group;

    public CircleGenerator(VBox gro){
        group = gro;
    }

    public void placeShape(){

    }

    @Override
    public void createShape(int size,String text) {
        StackPane stack = new StackPane();
        Circle cir = new Circle(size);
        Text tex = new Text(text);
        tex.setBoundsType(TextBoundsType.VISUAL);

        cir.setRadius(size);
        cir.setFill(Color.WHITE);
        cir.setStroke(Color.BLACK);

        stack.getChildren().addAll(cir,tex);

        cir.setCenterY(-50);

        shapes.add(cir);

        group.getChildren().add(stack);
    }

    //see if shapes occupy the same space
    public boolean hasOverlap(Shape s1, Shape s2){
        return s1.getBoundsInLocal().intersects(s2.getBoundsInLocal());
    }

    //undo shape creation
    @Override
    public void undo(){
        group.getChildren().remove(shapes.pop());
    }

    //location of shape
    @Override
    public Bounds getLocation(Shape shape){
        return shape.getBoundsInLocal();
    }
}

//to sort, put in array, sort by size and reput