import javax.swing.JOptionPane;

public class ScholarshipJOptionPane {

    static String evaluate(double nsat, double salary, double exam) {
        if (salary > 10000 || nsat < 90 || exam < 85) {
            return "REJECTED";
        } else if (salary <= 3500 && (nsat + exam) / 2 >= 91) {
            return "ACCEPTED";
        } else {
            return "FOR FURTHER STUDY";
        }
    }

    public static void main(String[] args) {
        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        double exam = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance exam score:"));

        JOptionPane.showMessageDialog(null,
                "Application status: " + evaluate(nsat, salary, exam),
                "Scholarship Result", JOptionPane.INFORMATION_MESSAGE);
    }
}