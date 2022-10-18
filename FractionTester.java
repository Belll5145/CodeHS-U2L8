import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction frac1 = new Fraction(1, 2);
        // Ask for input
        System.out.println("Enter the numerator: ");
        int num = input.nextInt();
        System.out.println("Enter the denominator: ");
        int deno = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction frac2 = new Fraction(num, deno);
        // Add the fractions
        int numSum = 1*deno + 2*num;
        int denoSum = 2*deno;
        Fraction sumFrac = new Fraction(numSum, denoSum);
        // Make use of the getDenominator and getNumerator methods
        sumFrac.getNumerator();
        sumFrac.getDenominator();
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(frac1 +" + "+ frac2 +" = "+ sumFrac);
        
    }
}