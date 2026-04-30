import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your CTC (yearly): ");
        double ctc = sc.nextDouble();

        double monthly = ctc / 12;
        double hike = ctc * 0.20;
        double newCTC = ctc + hike;

        System.out.println("Monthly Salary: " + monthly);
        System.out.println("Hike (20%): " + hike);
        System.out.println("New CTC after hike: " + newCTC);
    }
}
