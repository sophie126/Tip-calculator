import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("***Do not use symbols***");
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input dollar amount: ");
        double bill=(double)scanner.nextDouble();
        System.out.print("Input tip percentage as a whole number: ");
        double tipPercent=scanner.nextDouble();
        System.out.print("Input number of people: ");
        int people=scanner.nextInt();

        tipPercent=tipPercent/100;
        double tip=bill*tipPercent;
        bill=bill+tip;
        double tipPerson=tip/people; //tipPerson means tip per person
        double totalPerson=bill/people; //totalPerson means how much each person has to pay for total bill

        tip=((int)(tip*100))/(double)100;
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