import java.util.Scanner;

public class ScholarshipScanner {

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = sc.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double exam = sc.nextDouble();

        System.out.println("\nApplication status: " + evaluate(nsat, salary, exam));

        sc.close();
    }
}