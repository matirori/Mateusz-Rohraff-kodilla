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
        Shape shape = new Shape("Triangle", 12);
        //When
        shape.addFigure();
        //Then
        Assert.assertNull(shapes.size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape shape = new Shape("Triangle", 12);
        shapes.add(shape);
        //When
        shape.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapes.size());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape shape = new Shape("Circle", 14);
        shapes.add(shape);
        //When
        Shape shape1 = shape.getFigure(0);
        //Then
        Assert.assertEquals(shape, shape1);
    }

    @Test
    public void testShowFigures(){
        //Given
        Shape shape = new Shape("Square", 15);
        Shape shape1 = new Shape("Triangle", 15);
        Shape shape2 = new Shape("Square", 15);
        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(shape2);
        //When
        shapes.showFigures();
        //Then
    }
}
