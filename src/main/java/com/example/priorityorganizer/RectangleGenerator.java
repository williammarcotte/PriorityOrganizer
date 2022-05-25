package com.example.priorityorganizer;

import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class RectangleGenerator extends ShapeGenerator{
    public RectangleGenerator(Group group){

    }

    public void createShape(int size){

    }

    public void placeShape(){

    }

    public void hasOverlap(){

    }

    @Override
    public Bounds getLocation(Shape shape){
        return shape.getBoundsInLocal();
    }
}
