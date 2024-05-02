public class LeapYearP2 {

  public static void main(String[] args) {
    // The desired year to check.
    int year = 2024;

    // Implementing our algorithm.
    if (year % 400 == 0) {
      System.out.println(year + " is a leap year.");
    } 
    else if (year % 100 == 0) {
      System.out.println(year + " is not a leap year.");
    } 
    else if (year % 4 == 0) {
      System.out.println(year + " is a leap year.");
    } 
    else {
      System.out.println(year + " is not a leap year.");
    }
  }
}
