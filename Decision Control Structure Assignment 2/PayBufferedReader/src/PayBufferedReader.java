import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayBufferedReader {

    // Decision structure: returns the withholding rate based on gross pay
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate (Php): ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine());

        double grossPay = hours * rate;
        double taxRate = getTaxRate(grossPay);
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("\n----- PAY SUMMARY -----");
        System.out.printf("Gross Pay       : Php %,.2f%n", grossPay);
        System.out.printf("Withholding Tax : Php %,.2f (%.0f%%)%n", withholdingTax, taxRate * 100);
        System.out.printf("Net Pay         : Php %,.2f%n", netPay);
    }
}