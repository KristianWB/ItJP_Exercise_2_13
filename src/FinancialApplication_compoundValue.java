import java.util.Scanner;

public class FinancialApplication_compoundValue {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        /* The task will be solved in three steps
        1) Prompting the user for monthly savings amount and declaring/assigning static variables
        2) Calculate the savings after 6 months
        3) Display the results
         */

        // 1) Prompting for savings amount
        System.out.print(
                "Please enter savings amount: "
        );
        double savings = input.nextDouble();  // We need the savings amount fom user
        final double INTERESTS = .00417;

        // 2) Calculating the savings after 6 months
        double month1 = savings * (1 + INTERESTS); // Savings after one month
        double month2 = (month1 + savings) * (1 + INTERESTS); // Savings after 2 months
        double month3 = (month2 + savings) * (1 + INTERESTS); // Savings after 3 months
        double month4 = (savings + month3) * (1 + INTERESTS); // Savings after 4 months
        double month5 = (month4 + savings) * (1 + INTERESTS); // Savings after 5 months
        double month6 = (month5 + savings) * (1 + INTERESTS); // Savings after 6 months

        // Displaying the results
        System.out.println(
                "The savings on the account after 6 months of deposits and savings are: " + month6
        );

    }
}
