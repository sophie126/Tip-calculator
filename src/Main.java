import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Give dollar amount:");
       double bill=(double)scanner.nextDouble();
       System.out.println("Give tip percentage as a whole number without the symbol:");
       double tipPercent=scanner.nextDouble();
       System.out.println("Give number of people:");
       int people=scanner.nextInt();

       tipPercent=tipPercent/100;
       double tip=bill*tipPercent;
       bill=bill+tip;
       double tipPerson=tip/people; //tipPerson means tip per person
       double totalPerson=bill/people; //totalPerson means how much each person has to pay for total bill

       tip=((int)(tip*100))/(double)100; //three more


       System.out.println(tip);
       System.out.println(bill);
       System.out.println(tipPerson);
       System.out.println(totalPerson);

   }
}
