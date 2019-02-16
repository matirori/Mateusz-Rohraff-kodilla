package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape shape = new Triangle(5,6,4);
        Shape shape1 = new Circle(6);
        Shape shape2= new Triangle(5,6,6);
        Shape shape3 = new Squere(5,7);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //Then
        Assert.assertEquals(4, shapeCollector.getFigure().size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape shape = new Triangle(5,6,4);
        Shape shape1 = new Circle(6);
        Shape shape2= new Triangle(5,6,6);
        Shape shape3 = new Squere(5,7);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(3, shapeCollector.getFigure().size());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape shape = new Triangle(5,6,4);
        Shape shape1 = new Circle(6);
        Shape shape2= new Triangle(5,6,6);
        Shape shape3 = new Squere(5,7);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //When
        Shape shape4 = shapeCollector.getFigure(3);
        //Then
        Assert.assertEquals(shape3, shape4);
    }

    @Test
    public void testShowFigures(){
        //Given
        Shape shape = new Triangle(5,6,4);
        Shape shape1 = new Circle(6);
        Shape shape2= new Triangle(5,6,6);
        Shape shape3 = new Squere(5,7);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //When
        shapeCollector.showFigures();
        //Then
    }
}
