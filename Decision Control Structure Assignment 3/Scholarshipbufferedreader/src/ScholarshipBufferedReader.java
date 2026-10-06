import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScholarshipBufferedReader {

    // Decision structure: rejected is checked first, then accepted, else further study
    static String evaluate(double nsat, double salary, double exam) {
        if (salary > 10000 || nsat < 90 || exam < 85) {
            return "REJECTED";
        } else if (salary <= 3500 && (nsat + exam) / 2 >= 91) {
            return "ACCEPTED";
        } else {
            return "FOR FURTHER STUDY";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance exam score: ");
        double exam = Double.parseDouble(br.readLine());

        System.out.println("\nApplication status: " + evaluate(nsat, salary, exam));
    }
}