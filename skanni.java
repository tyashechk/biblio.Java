import java.util.Scanner;

public class skanni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Let num: ");
        double num1 = scanner.nextDouble();

        System.out.println("Your num: " + num1);

        scanner.close();
    }
}
