import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.println("--------------------------------");
        System.out.print("Let x: ");
        double x = scanner.nextDouble();
        System.out.println("Your x: " + x);
        System.out.print("Let y: ");
        double y = scanner.nextDouble();
        System.out.println("Your y: " + y);
        scanner.close();
        double pi = Math.PI;
        double t = Math.cos(pi / 7) * Math.pow((Math.sinh(x)), 2) / ((2.7 * (x - pi)));
        System.out.println("Finish!: t = "        + t);
        t = Math.round(t);
        System.out.println("         t(celoe) = " + t);
        System.out.println("--------------------------------");
    }
}
