import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Reggie {
  public static void main(String[] args) {
    
    System.out.println("Enter Zip code :");
    Scanner scan = new Scanner(System.in);
    String zipCode = scan.nextLine();
    
    while (!zipCode.matches("^\\d{5}(-\\d{4})?$")){

    //Wrong String zipCode example = "90210-000";
      System.out.printf("%s is NOT  a valid zip code%n", zipCode);
      System.out.println("Re-Enter your zipcode: ");
      zipCode = scan.nextLine();

    } 

      System.out.printf("%s is a valid zip code%n", zipCode);

  }
}