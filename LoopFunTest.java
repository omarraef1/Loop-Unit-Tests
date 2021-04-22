// Omar R.Gebril
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class LoopFunTest {

  // The one instance variable that is accessible to all methods
  private LoopFun loopFun = new LoopFun();

  @Test
  public void testGCDWhen() {
    assertEquals(3, loopFun.GCD(3, 0));
    assertEquals(4, loopFun.GCD(-4, -16));
    assertEquals(5, loopFun.GCD(-25, -10));
    assertEquals(378, loopFun.GCD(378, 378));
    assertEquals(378, loopFun.GCD(378, 0));
    assertEquals(378, loopFun.GCD(0, 378));
    assertEquals(1, loopFun.GCD(3, 2));
    assertEquals(5, loopFun.GCD(10, 5));
    assertEquals(5, loopFun.GCD(15, 25));
  }

  @Test
  public void testSqrt() {
    assertEquals(4, loopFun.sqrt(16, 0.00001), 0.00001);
    assertEquals(10.0, loopFun.sqrt(100, 0.00001), 0.00001);
  }

  @Test
  public void sumInScanner() {
    Scanner stream = new Scanner("1 2 3");
    assertEquals(6, loopFun.sumInScanner(stream));
    Scanner stream1 = new Scanner("2 5 7 8");
    assertEquals(22, loopFun.sumInScanner(stream1));
    Scanner stream2 = new Scanner("");
    assertEquals(0, loopFun.sumInScanner(stream2));
  }

  @Test
  public void testRangeInScanner() {
    assertEquals(2, loopFun.rangeInScanner(new Scanner("2 3 4")));
    assertEquals(2, loopFun.rangeInScanner(new Scanner("4 3 2")));
    assertEquals(6, loopFun.rangeInScanner(new Scanner("2 5 7 8")));
  }

  @Test
  public void testhowMany() {
    assertEquals(2, loopFun.howMany(new Scanner("test the first test"), "test"));
    assertEquals(2, loopFun.howMany(new Scanner("here are five words here"), "here"));
    assertEquals(0, loopFun.howMany(new Scanner("test the first test"), "not"));
    assertEquals(4, loopFun.howMany(new Scanner("a b b a b b a"), "b"));
    assertEquals(3, loopFun.howMany(new Scanner("a b b a b b a"), "a"));
  }

  @Test
  public void testWordperfectPercentage() {
    assertEquals(0.3333333333, loopFun.perfectPercentage(new Scanner("1 2 100")), 0.1);
    assertEquals(0.25, loopFun.perfectPercentage(new Scanner("80 90 100 72 65 49 90 88 90 100 90 100 100 74 93 99")), 0.1);
  }

  @Test
  public void testFactorial() {
    assertEquals(1, loopFun.factorial(0));
    assertEquals(120, loopFun.factorial(5));
    assertEquals(1, loopFun.factorial(0));
    assertEquals(1, loopFun.factorial(0));
  }

  @Test
  public void testFibonacci6() {
    assertEquals(8, loopFun.fibonacci(6));
    assertEquals(5, loopFun.fibonacci(5));
    assertEquals(3, loopFun.fibonacci(4));
    assertEquals(2, loopFun.fibonacci(3));
    assertEquals(1, loopFun.fibonacci(2));
    assertEquals(1, loopFun.fibonacci(1));
    assertEquals(0, loopFun.fibonacci(0));
 }

  @Test
  public void testIsPrimeWhenItIs() {
    assertTrue(loopFun.isPrime(5));
    assertTrue(loopFun.isPrime(2));
    assertTrue(loopFun.isPrime(3));
    assertTrue(loopFun.isPrime(29));
    assertTrue(loopFun.isPrime(89));
    assertFalse(loopFun.isPrime(6));
    assertFalse(loopFun.isPrime(4));
    assertFalse(loopFun.isPrime(48));
  }

  @Test
  public void testhowSwedishWhenCaseMixed() {
    assertEquals(2, loopFun.howSwedish("aBbAAbBa"));
    assertEquals(1, loopFun.howSwedish("ABBA a b b a"));
    assertEquals(2, loopFun.howSwedish("!abbabba!"));
  }
 
  @Test
  public void testDoubleUp() {
    assertEquals("bbbb", loopFun.doubleUp("bb"));
    assertEquals("", loopFun.doubleUp(""));
    assertEquals("MM", loopFun.doubleUp("M"));
    assertEquals("aabbcc", loopFun.doubleUp("abc"));
  }

  @Test
  public void testReverseString() {
    assertEquals("racecar", loopFun.reverseString("racecar"));
    assertEquals("", loopFun.reverseString(""));
    assertEquals("1", loopFun.reverseString("1"));
    assertEquals("4321", loopFun.reverseString("1234"));
    assertEquals("racecar", loopFun.reverseString("racecar"));
  }

  @Test
  public void testAllasleft() {
    assertEquals("AAAAAbcdefghi", loopFun.allAsLeft("AbcAdefAghiAA"));
    assertEquals("AAAAAbcdaaaefghi", loopFun.allAsLeft("AbcAdaaaefAghiAA"));
    assertEquals("", loopFun.allAsLeft(""));
    assertEquals("A", loopFun.allAsLeft("A"));
    
  }

  @Test
  public void testVowelCount() {
    assertEquals(2, loopFun.vowelCount("exyze"));
    assertEquals(10, loopFun.vowelCount("a e i o u A E I O U"));
    assertEquals(0, loopFun.vowelCount("y+_x1Y2x!y"));
  }

  @Test
  public void testNumberOfPairs() {
    assertEquals(1, loopFun.numberOfPairs("abbc"));
    assertEquals(0, loopFun.numberOfPairs(""));
    assertEquals(0, loopFun.numberOfPairs("abc"));
    assertEquals(3, loopFun.numberOfPairs("aabbcc"));
    assertEquals(3, loopFun.numberOfPairs("mmmm"));
    assertEquals(2, loopFun.numberOfPairs("!!!"));
    assertEquals(2, loopFun.numberOfPairs("mmOmm"));
  }
 }
