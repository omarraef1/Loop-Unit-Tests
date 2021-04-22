
/**
 * This class has 15 methods related by the fact that CSC 210 students are
 * learning the algorithmic patterns Determinate Loop and Indeterminate Loop.
 * 
 * The methods will specifically use Java's for and while loop statements written 
 * in virtually all languages because these algorithmic patterns occur so
 * frequently while developing software.
 * 
 * There are several silly contrived methods and several possibly useful methods.
 * 
 * The first group of methods needs while loops as the are indeterminate. 
 * 
 * The last group can use while or for loops, but since they are determinate loops, 
 * so Java's for loop is recommended.
 * 
 * @author Rick Mercer and Omar R. Gebril
 */
import java.util.Scanner;

public class LoopFun {

  // In mathematics, the greatest common divisor (GCD) of two or more integers,
  // which are not all zero, is the largest positive integer that divides each of
  // the integers. For example, GCD(2, 12) is 4.
  //
  // Euclid's solution to finding the GCD is refuted to be the first algorithm
  // known to mankind. It is definitely old. It goes like this:
  //
  // GCD(a, b) can be computed as follows:
  //
  // while(b != 0):
  // .. other = a
  // .. a = b
  // .. b = other % b
  // a is the GCD
  //
  // GCD(378, 378) returns 378
  // GCD(378, 0) returns 378
  // GCD(0, 378) returns 378
  // GCD(3, 2) returns 1
  // GCD(10, 5) returns 5
  // GCD(15, 25) returns 5
  // GCD(25, 10) returns 5
  // GCD(-25, 10) returns 5
  // GCD(-25, -10) returns 5
  // GCD(25, -10) returns 5
  //
  // Either argument may be < 0
  //
  // Precondition: a and or b can be 0, but not both
  // GCD(0, 0) is undefined. We do not have an assert for GCD(0,0).
  //
  public int GCD(int a, int b) {
	  if (a==0) {
		  return b;
	  }
	  int other = 0;
	  while (b!=0) {
		  other = a;
		  a=Math.abs(b);
		  b=other%b;
	  }
	  return a;
  }

  // The square root of a number >= 0 can be found by making successful
  // guesses until it is "close enough". Starting with a guess, make each
  // guess like this until the sqrt(x) is within the precision specified.
  //
  // n = 0
  // guess[n] = x / 2 // A good first guess is to divide x by 2.0 (works when
  // x==4.0)
  // guess[n+1] = (guess[n] + x / guess[n] ) / 2.0
  // guess[n+2] = (guess[n+1] + x / guess[n+1] ) / 2.0
  //
  // If x = 16.0
  // guess[0] = 16.0 / 2; // guess == 8.0
  // guess[1] = (8.0 + 16.0 / 8.0) / 2.0 // guess == 5.0
  // guess[2] = (5.0 + 16.0 / 5.0) / 2.0 // guess == 4.1
  //
  // Precondition x >= 0.0 and precision >= 1e-12
  //
  public double sqrt(double x, double precision) {
	  double guess = x/2.0;
	  while (guess<= Math.sqrt(x)-precision || guess >= Math.sqrt(x)+precision)  {
		  guess = (guess+x/guess)/2.0;
	  }
	  return guess;
}

  // Given a Scanner constructed with a String of valid white space separated
  // integers, return the sum of all integers. One assertion is shown as an
  // example.
  //
  // Scanner scanner = new Scanner("2 5 7 8");
  // sumInScanner(scanner) returns 22
  //
  // Scanner scanner = new Scanner("");
  // sumInScanner(scanner) returns 0
  //
  public int sumInScanner(Scanner scanner) {
	  int sum = 0;
	  while(scanner.hasNextInt()) {
		  int cur = scanner.nextInt();
		  sum = sum+cur;
	  }
	  return sum;
  }

  // Given a Scanner constructed with a String containing valid white space
  // separated integers, return the range. Range is the maximum integer – minimum
  // integer.
  //
  // Scanner scanner = new Scanner("2 5 7 8");
  // rangeInScanner(scanner) returns 6, which is 8 – 2
  //
  // Precondition: scanner has at least one valid integer
  public int rangeInScanner(Scanner scanner) {
	  int min = Integer.MAX_VALUE;
	  int max = Integer.MIN_VALUE;
	  while(scanner.hasNextInt()) {
		  int cur = scanner.nextInt();
		  max = Math.max(max,cur);
		  min = Math.min(min, cur);
	  }
	  return max-min;
  }

  // Given a Scanner constructed with a String containing white space
  // separated words, return the number of "words" found in the input stream
  // that .equals the 2nd parameter search.
  //
  // Scanner scanner = new Scanner("here are five words here");
  // howMany(scanner, "here") returns 2
  // howMany(scanner, "not") returns 0
  //
  // scanner = new Scanner("a b b a b b a");
  // howMany(scanner, "a") returns 3
  // howMany(scanner, "b") returns 4
  //
  public int howMany(Scanner scanner, String search) {
	  int count = 0;
	  while (scanner.hasNext()) {
		  if ((scanner.next()).compareTo(search)==0) {
			  count++;
			  }
	  }
	  return count;
  }

  // Given an Scanner containing an unknown number of quiz scores, return
  // the percentage of perfect scores, those == 100. If the Scanner following
  // quiz scores, perfectPercentage must must return 4.0 / 16.0 = 0.25 (25%).
  //
  // Remember: 4 / 16 == 0 so you may need to multiply a variable by 1.0 to
  // get a double
  //
  // new Scanner ("80 90 100 72 65 49 90 88 90 100 90 100 100 74 93 99")
  //
  // Precondition: scanner is constructed with a string of
  // whitespace separated 0 to many valid integers
  //
  public double perfectPercentage(Scanner scanner) {
	  double students = 0;
	  double count = 0;
	  while (scanner.hasNextInt()) {
		  students++;
		  if (scanner.nextInt()==100) {
			 count++; 
		  }
	  }
	  return (count/students);
  }

  /////////////////////////////////////
  // while loops above, for loops below
  /////////////////////////////////////

  // Given an integer argument return n factorial, which is written as n!.
  // 5! = 5*4*3*2*1 or in general, n! = n*(n-1)*(n-2) …*2*1. Use a for loop.
  //
  // factorial(4) returns 24, which is 4 * 3 * 2 * 1
  //
  // Precondition: n >= 0
  public int factorial(int n) {
	  int factorial = 1;
	  for (int i = 1; i<=n;i++) {
		  factorial = factorial*i;
	  }
	  return factorial;
  }

  // In the movie "The Da Vinci Code" with Tom Hanks, this password
  // was used to unlock a much sought after artifact: 1 2 3 5 8 13 21.
  // These are the 2nd through 8th Fibonacci numbers. Fibonacci numbers
  // have so much interest, there exists a Fibonacci Quarterly
  //
  // http://www.fq.math.ca/
  //
  // Implement method fibonacci that returns the nth Fibonacci number.
  // Fibonnaci numbers can be computed as the sum of the preceeding two.
  // You will find it useful to keep track the two previous Fibonacci
  // numbers. This is harder than it looks.
  //
  // fibonacci(1) returns 1
  // fibonacci(2) returns 1
  // fibonacci(3) returns 2
  // fibonacci(4) returns 3
  // fibonacci(5) returns 5
  // fibonacci(6) returns 8
  //
  // Precondition: n >= 1
  //
  public int fibonacci(int n) {
	  int i = 1;
	  int t1 = 0;
	  int t2 = 1;
	  while (i <= n) {
		  int sum = t1 + t2;
		  t1 = t2;
		  t2 = sum;
		  i++;
	  }
	  return t1;
  }

  // One evening, while listening intently at the Very Large Array (VLA)
  // radio astronomy observatory 50 miles west of Socorro New Mexico, Ellie
  // hears a powerful signal: a prime number pattern emanating from the
  // star Vega, confirmed by others the world over, undeniable and strong
  // in its pulsing power. What Ellie recognized was the repeating series
  // of the first 26 prime numbers. This is someone near Vega trying to
  // contact anyone on earth who is listening:
  //
  // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
  //
  // A prime number is a natural number greater than 1 that has no positive
  // divisors other than 1 and itself. Complete method isPrime that returns
  // true if the argument is a prime number. Hint: Consider writing a loop
  // that divides the argument num by every integer from 2 to num-1, returning
  // false if num was found to be evenly divisible by any one of those.
  //
  // Precondition: num >= 2
  //
  public boolean isPrime(int num) {
	  int i = 2;
	  boolean flag = true;
	  while (i<= num-1) {
		  if (num%i == 0) {
			  flag = false;
		  }
		  i++;
	  }
    return flag;
  }

  // ABBA is a band, they have many songs including Dancing Queen, and
  // Fernando. ABBA is actually a Swedish band, so if we wanted to find
  // out howSwedish a String is, we could simply find out how many times
  // the String contains the substring "abba". We want to look for this
  // substring in a case insensitive manner. So "abba" counts, and so
  // does "aBbA". We also want to check for overlapping abba's such as
  // in the String "abbAbba" that contains "abba" twice.
  //
  // howSwedish("ABBA a b b a") returns 1
  // howSwedish("!abbabba!") returns 2
  //
  public int howSwedish(String str) {	
	  int i = 0;
	  int count = 0;
	  while (i<=str.length()-4) {
		  if ((str.substring(i, i+4).toLowerCase()).compareTo("abba")==0) {
			  count++;
			  }
		  i++;
	  }
	  return count;
}

  // Given a string, return a new string that has every character duplicated
  // next to its original position.
  //
  // doubleUp("") return ""
  // doubleUp("M") return "MM"
  // doubleUp("abc") return "aabbcc"
  //
  public String doubleUp(String str) {
	  if(str.length() == 0) {
		  return str;
	  }
	  StringBuilder newStr = new StringBuilder(str);
	  int i = 1;
	  String firstChar = Character.toString(str.charAt(0));
	  while (i<str.length()) {
		  String newChar = Character.toString(str.charAt(i));
		  newStr.insert(i+1, newChar) ;
		  i++;
	  }
	  newStr.insert(0, firstChar) ;
	  return newStr.toString();
  }

  // Given a String, return a reference to a new String that has arg's
  // characters in reverse order.
  //
  // reverseString("") returns ""
  // reverseString("1") returns "1"
  // reverseString("1234") returns "4321"
  // reverseString("racecar") returns "racecar"
  //
  public String reverseString(String str) {
	  String reverse = "";
	  int i = str.length()-1;
	  while (i>=0) {
		  reverse = reverse +str.charAt(i);
		  i--;
	  }
	  return reverse;

  }

  // Given a String, return the same characters in the string in the same
  // order except all upper case 'A's are to the left.
  //
  // allAsLeft("") returns ""
  // allAsLeft("A") returns "A"
  // allAsLeft("AbcAdaaaefAghiAA") returns "AAAAAbcdaaaefghi"
  //
  public String allAsLeft(String str) {
	  StringBuilder newStr = new StringBuilder(str);
	  int i = 0;
	  while (i<newStr.length()) {
		  if ((Character.toString(str.charAt(i)).compareTo("A") == 0)) {
			  String newChar = Character.toString(str.charAt(i));
			  newStr.deleteCharAt(i);
			  newStr.insert(0, newChar) ;
			}
			i++;
	  }
	  return newStr.toString();
  }



  // "How much wood could a woodchuck chuck" contains 11 vowels. How do we
  // know? Five of the 26 English alphabet letters are vowels: a, e, i, o,
  // and u. By looking at each letter in the woodchuck string, we find
  // 11 vowels. Complete method vowelCount that returns the number of vowels
  // in the given string argument. This is case insensitive. Upper and lower
  // case vowels count. We will not consider y to be a vowel.
  //
  // vowelCount("a e i o u A E I O U") returns 10
  // vowelCount("y+_x1Y2x!y") returns 0
  //
  public int vowelCount(String str) {
	  int i = 0;
	  int count = 0;
	  String newStr = str.toLowerCase();
	  String vowelStr = "aeiou";
	  while (i<newStr.length()) {
		  for (int j = 0 ; j<vowelStr.length();j++) {
			  if ((Character.toString(newStr.charAt(i)).compareTo(Character.toString(vowelStr.charAt(j))))==0) {
				  count ++ ;
				  }
		  }
		  i++;
	  }
	  return count;
  }

  // Return the number of times two consecutive characters occur in str.
  // numberOfPairs ("") returns 0
  // numberOfPairs ("abc") returns 0
  // numberOfPairs ("aabbcc") returns 3
  // numberOfPairs ("!!!") returns 2
  // numberOfPairs ("mmmm") returns 3
  // numberOfPairs ("mmOmm") returns 2
  //
  public int numberOfPairs(String str) {
	  int i = 0;
	  int count = 0;
	  while (i<str.length()-1) {
		  if (Character.toString(str.charAt(i)).compareTo(Character.toString(str.charAt(i+1))) == 0) {
			  count ++ ;
			}
			i++;
		}
    return count;
  }

}