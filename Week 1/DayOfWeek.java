import java.util.*;
public class DayOfWeek {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any number between 1 to 7 to tell the week corresponding to it:");
    // Open Weaver Week 1 coding project by Shruti Choudhary
    int number = scan.nextInt();
    switch(number) {
      case 1: System.out.println("Sunday");
      break;
      case 2: System.out.println("Monday");
      break;
      case 3: System.out.println("Tuesday");
      break;
      case 4: System.out.println("Wednesday");
      break;
      case 5: System.out.println("Thursday");
      break;
      case 6: System.out.println("Friday");
      break;
      case 7: System.out.println("Saturday");
      break;
      default: System.out.println("Wrong number entered");
    }
    scan.close();
  }
}
