package com.example.priorityorganizer;

import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class RectangleGenerator extends ShapeGenerator{
    Group group = new Group();

    public RectangleGenerator(Group group){
        this.group = group;
    }

    public void createShape(int size,String text){

    }

    public void placeShape(){

    }

    public void hasOverlap(){

    }

    @Override
    public void undo(){
        group.getChildren().remove(shapes.pop());
    }

    @Override
    public Bounds getLocation(Shape shape){
        return shape.getBoundsInLocal();
    }
}
