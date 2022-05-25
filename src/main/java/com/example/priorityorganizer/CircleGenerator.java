package com.example.priorityorganizer;

import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class CircleGenerator extends ShapeGenerator{

    Group group;

    //use stackpane or borderpane for shape layout

    //for loop oging through array to check locations where shape can't be put

    //sort shapes by order of size

    public CircleGenerator(Group gro){
        group = gro;
    }

    public void placeShape(){

    }

    @Override
    public void createShape(int size) {
        Circle cir;

        group.getChildren();
    }

    //see if shapes occupy the same space
    public void hasOverlap(){
        boolean collision = true;
        while(collision){

        }
    }

    @Override
    public Bounds getLocation(Shape shape){
        return shape.getBoundsInLocal();
    }
}
