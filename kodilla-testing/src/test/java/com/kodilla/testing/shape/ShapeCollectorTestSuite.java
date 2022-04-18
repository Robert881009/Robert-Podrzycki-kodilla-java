package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape test")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);}
    @Test
    void testAddFigure(){
        //Given
        ShapeCollector figure = new ShapeCollector();
        //When
        figure.addFigure(new Circle("Circle",10.0));
        //Then
        Assertions.assertEquals(1,figure.shapeList.size());
    }
    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape square = new Square("Square",5.0);
        figure.addFigure(square);
        //When
        boolean result = figure.removeFigure(square);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,figure.shapeList.size());
    }
    @Test
    void testGetFigure(){
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape triangle = new Triangle("Triangle",10.0,7.0);
        figure.addFigure(triangle);
        //When
        Shape result = figure.getFigure(0);
        //Then
        Assertions.assertEquals(result,triangle);
    }
    @Test
        void testShowFigures(){
        //Given
        ShapeCollector figure = new ShapeCollector();
        figure.addFigure(new Triangle("Triangle",10.3,5.2));
        figure.addFigure(new Circle("Circle",5.0));
        figure.addFigure(new Square("Square",20.0));
        //When
        List result = figure.showFigures();
        List<String> expectResult = new ArrayList<>();
        expectResult.add("Triangle");
        expectResult.add("Circle");
        expectResult.add("Square");
        //Then
        Assertions.assertEquals(expectResult,result);
        }
}
