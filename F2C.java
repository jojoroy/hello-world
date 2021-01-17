import java.util.Scanner;

class F2C {
  public static void main(String args[]) {
    int iFdeg, iCdeg;
    System.out.print("Enter Fahrenheit temperature: ");
    Scanner scanner = new Scanner(System.in);
    iFdeg = scanner.nextInt();
    iCdeg = (iFdeg-32)*100/200;
    System.out.println("The Centigrade value is: "+iCdeg);
  }
}