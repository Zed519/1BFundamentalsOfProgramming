import javax.swing.JOptionPane;

public class PayJOptionPane {

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
        double rate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hourly pay rate (Php):"));
        double hours = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hours worked:"));

        double grossPay = hours * rate;
        double taxRate = getTaxRate(grossPay);
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String message = String.format(
                "Gross Pay       : Php %,.2f%nWithholding Tax : Php %,.2f (%.0f%%)%nNet Pay         : Php %,.2f",
                grossPay, withholdingTax, taxRate * 100, netPay);

        JOptionPane.showMessageDialog(null, message, "Pay Summary",
                JOptionPane.INFORMATION_MESSAGE);
    }
}