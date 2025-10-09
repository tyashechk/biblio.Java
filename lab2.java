import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Let x: ");
        double x = scanner.nextDouble();
        System.out.println("Your x: " + x);
        System.out.print("Let y: ");
        double y = scanner.nextDouble();
        System.out.println("Your y: " + y);
        System.out.print("Let c: ");
        double c = scanner.nextDouble();
        System.out.println("Your c: " + c);
        System.out.print("Let d: ");
        double d = scanner.nextDouble();
        System.out.println("Your y: " + d);
        scanner.close();
        double e = 0;
        if (x * y > 3) {
            e = Math.max(x, 3 * Math.log(Math.abs(x * y * c * d)));
        } else if (x * y >= 0 && x * y <= 3) {
            e = Math.min(x, Math.min(y, (Math.max(c * x, d * y))));
        } else if (x * y < 0) {
            e = 2 * c * d - x;
        }
        System.out.println("Finish!!:" + e );
    }
}
