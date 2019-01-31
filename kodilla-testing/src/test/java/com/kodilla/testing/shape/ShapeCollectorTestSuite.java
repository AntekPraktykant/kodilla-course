package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    public enum sampleShapes {
        C, T, S
    }

    @Test
    public void testAddFigure() {
        //given
        ShapeCollector sc = new ShapeCollector();
        Shape shape = new Circle();
        //when
        sc.addFigure(shape);
        //then
        Assert.assertEquals(shape, sc.getFigure(0));
    }
    @Test
    public void testRemoveFigure() {
        //given
        ShapeCollector sc = new ShapeCollector();
        Shape shape = new Triangle();
        sc.addFigure(shape);
        //when
        boolean result = sc.removeFigure(shape);
        //then
        Assert.assertEquals(true, result);
    }
    @Test
    public void testGetFigure() {
        //given
        ShapeCollector sc = new ShapeCollector();
        Shape shape = new Square();
        sc.addFigure(shape);
        //when
        Shape result = sc.getFigure(0);
        //then
        Assert.assertEquals(shape, result);
    }
    @Test
    public void testShowFigures() {
        //given
        ShapeCollector sc = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Shape c = new Circle();
        Shape s = new Square();
        Shape t = new Triangle();
        shapes.add(c);
        shapes.add(s);
        shapes.add(t);
        sc.addFigure(c);
        sc.addFigure(s);
        sc.addFigure(t);
        //when
        ArrayList<Shape> result = sc.showFigures();
        //then
        Assert.assertEquals(shapes, result);
    }
}
