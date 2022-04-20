package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeList = new ArrayList<>();


    public void addFigure(Shape shape){

        shapeList.add(shape);
    }


    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapeList.contains(shape)){
            shapeList.remove(shape);
            result = true;
        }
    return result;
    }
    public Shape getFigure(int n){
        Shape result =  shapeList.get(n);
        return result;
    }
    public String showFigures(){
        String figures = "";
        for (Shape shape: shapeList) {
            String result = shape.getShapeName();
            figures += result + " ";
        }
        return figures;
    }
}

