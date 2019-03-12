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
    public void testGetFigure() {
//Given
    Shape shape = new Circle();

    ShapeCollector shapeCollector = new ShapeCollector();
    shapeCollector.addFigure(shape);
// then
    int shapeSize = shapeCollector.getShapeSize();
    Assert.assertEquals(1,shapeSize);
    }

    @Test

    public void testRemoveFigure() {
                                                                                                                                        //Given
        Shape shape = new Circle();

//When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.removeFigure(shape);
// then
        int shapeSize = shapeCollector.getShapeSize();
        Assert.assertEquals(0,shapeSize);

    }
@Test
    public void testAddFigure() {
//Given
    Shape shape = new Circle();

//When
    ShapeCollector shapeCollector = new ShapeCollector();
    shapeCollector.addFigure(shape);
// then
    int shapeSize = shapeCollector.getShapeSize();
    Assert.assertEquals(1,shapeSize);

    }
}


