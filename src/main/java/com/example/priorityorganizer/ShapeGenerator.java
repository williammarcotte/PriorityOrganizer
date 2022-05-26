package com.example.priorityorganizer;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.Group;

import java.util.ArrayDeque;
import java.util.Random;

public abstract class ShapeGenerator implements Location{

    ArrayDeque<StackPane> shapes = new ArrayDeque<>();

    public abstract void undo();
    public abstract void clear();
    public abstract void createShape(int size,String text);
}

