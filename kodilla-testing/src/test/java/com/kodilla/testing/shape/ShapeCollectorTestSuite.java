package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;

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
    public void testAddFigure() {
//Given
    Shape shape = new Shape("circle");

//When

        ShapeCollector.add(shape.getShapeName());
        String addedFigure = ShapeCollector.getShapeName();
// then
        addedFigure =ShapeCollector.getShapeName();
        Assert.assertEquals(shape,addedFigure);
    }

    @Test

    public void testRemoveFigure() {
//Given
        Shape shape = new Shape();

//When
        ShapeCollector.remove(shape.getShapeName("circle"));
        String removedFigure = ShapeCollector.getShapeName;

//then
        removedFigure = ShapeCollector.getShapeName();
        Assert.assertEquals(shape, removedFigure);
    }
@Test
    public void testGetFigure() {
//Given
        Shape shape = new Shape();

//When
        ShapeCollector.add(shape.getShapeName());

//Then
        int result = ShapeCollector.getFigure(1);
        Assert.assertEquals(shape, result);

    }
    @Test
    public void testShowFigures() {
//given
        ShapeCollector.add(shape.getShapeName("circle"));
        ShapeCollector.add(shape.getShapeName("square"));
        ShapeCollector.add(shape.getShapeName("triangle"));
//when
        for (String shape : figuresList{
           System.out.println(shape);

        }
//then
        Assert.assertEquals(ShapeCollector < >, figuresList <>);
    }
}


