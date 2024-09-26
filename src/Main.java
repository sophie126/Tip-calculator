import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
       System.out.println("***Do not use symbols***");
       Scanner scanner=new Scanner(System.in);
       System.out.print("Bill amount: ");
       double bill=(double)scanner.nextDouble();
       System.out.print("Tip percentage as a whole number: ");
       double tipPercent=scanner.nextDouble();
       System.out.print("Number of people: ");
       int people=scanner.nextInt(); //scanner

       tipPercent=tipPercent/100; //turning to percent
       double tip=bill*tipPercent; //tip based on bill
       bill=bill+tip; //total bill
       double tipPerson=tip/people; //tipPerson means tip per person
       double totalPerson=bill/people; //totalPerson means how much each person has to pay for total bill

       tip=((int)(tip*100))/(double)100; //rounding
       bill=((int)(bill*100))/(double)100;
       tipPerson=((int)(tipPerson*100))/(double)100;
       totalPerson=((int)(totalPerson*100))/(double)100;


       System.out.println();
       System.out.println("---------");
       System.out.println("Your tip is: $"+tip);
       System.out.println("---------");
       System.out.println("Your total bill is: $"+bill);
       System.out.println("---------");
       System.out.println("The cost of the tip per person is: $"+tipPerson);
       System.out.println("---------");
       System.out.println("The total cost per person is: $"+totalPerson);
       System.out.println("---------");


       }
}
