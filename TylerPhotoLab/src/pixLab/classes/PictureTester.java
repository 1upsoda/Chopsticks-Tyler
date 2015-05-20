package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
    beach.keepOnlyGreen1();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  public static void testOneOff()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.oneOff();
    beach.explore();
  }
  public static void testOneOff2()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.oneOff2();
    beach.explore();
  }
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.explore();
    bike.mirrorVerticalRightToLeft();
    bike.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.explore();
    bike.mirrorHorizontal();
    bike.explore();
  }
  public static void testMirrorDiagnol()
  {
    Picture bike = new Picture("beach.jpg");
    bike.explore();
    bike.mirrorDiagnol();
    bike.explore();
  }
  public static void testMultiple()
  {
    Picture bike = new Picture("beach.jpg");
    bike.explore();
    bike.mirrorDiagnol();
    bike.explore();
    bike.mirrorHorizontal();
    bike.explore();
//    bike.grayscale();
    bike.explore();
    bike.mirrorVertical();
    bike.explore();
    bike.keepOnlyRed();
    bike.explore();
  }
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.explore();
    bike.mirrorHorizontalBottomToTop();
    bike.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testCopy()
  {
    Picture canvas = new Picture("swan.jpg");
    canvas.explore();
    canvas.copy(canvas, 60, 60);
    canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testOneOff();
    //testOneOff2();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBottomToTop();
    testMirrorDiagnol();
    //testMultiple();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}