
import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("-----------Welcome to the Tip Calculator-----------");

        //Welcomes and asks for total bill and user inputs the total amount
        System.out.print("Enter the total bill amount: $ ");
        double totalBill= input.nextDouble();

        //Asks for tip percentage and user enters it
        System.out.print("Enter the tip percentage: %");
        int tipPercentage= input.nextInt();

        //Asks for total number of people and user enters it
        System.out.print("Enter the total amount of people in your party: ");
        int totalPeople= input.nextInt();

        TipCalculator tipCalc= new TipCalculator(totalPeople, tipPercentage);
        tipCalc.addMeal(totalBill);


        System.out.println();
        System.out.println("The total tip amount is: $"+ String.format("%.2f", tipCalc.tipAmount()));
        System.out.println("The total amount of money including the bill and tip is: $"+ String.format("%.2f", tipCalc.totalBill()));
        System.out.println("The tip amount per person is: $"+ String.format("%.2f", tipCalc.perPersonTipAmount()));
        System.out.println("The total amount of money per person is: $"+ String.format("%.2f", tipCalc.perPersonTotalCost()));
    }
}
