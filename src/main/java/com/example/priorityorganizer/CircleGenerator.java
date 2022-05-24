package com.example.priorityorganizer;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CircleGenerator extends ShapeGenerator{

    Group group;

    //use stackpane or borderpane for shape layout

    public CircleGenerator(Group gro){
        group = gro;
    }


    public void createShape(int size){
        Circle cir;

        group.getChildren();
    }

    public void placeShape(){

    }

    //see if shapes occupy the same space
    public void hasOverlap(){
        boolean collision = true;
        while(collision){

        }
    }

    @Override
    public void getLocation(){

    }
}
