import java.util.Scanner;

public class PayScanner {

    static double getTaxRate(double grossPay) {
        if (grossPay <= 2000) {
            return 0.10;
        } else if (grossPay <= 4000) {
            return 0.12;
        } else if (grossPay <= 10000) {
            return 0.15;
        } else {
            return 0.20;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate (Php): ");
        double rate = sc.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

        double grossPay = hours * rate;
        double taxRate = getTaxRate(grossPay);
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("\n----- PAY SUMMARY -----");
        System.out.printf("Gross Pay       : Php %,.2f%n", grossPay);
        System.out.printf("Withholding Tax : Php %,.2f (%.0f%%)%n", withholdingTax, taxRate * 100);
        System.out.printf("Net Pay         : Php %,.2f%n", netPay);

        sc.close();
    }
}