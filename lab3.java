import java.util.ArrayList;
import java.util.List;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class lab3 {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        double y;
        List<Point> positiveY = new ArrayList<>();

        for (double x = -4; x <= 4; x += 0.5) {
            if (x <= 0) {
                y = Math.pow(x, 2) - 1;
                System.out.println("y = " + y + " x = " + x);
            } else if (x > 0 && x <= 1.5) {
                y = Math.cos(x);
                System.out.println("y = " + y + " x = " + x);
            } else {
                y = Math.sin(x - 1);
                System.out.println("y = " + y + " x = " + x);
            }
            if (y > 0) {
                positiveY.add(new Point(x, y));
            }
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Poloshitelnix znachenii funkcii:  " + positiveY.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        double x = -4;
        positiveY = new ArrayList<>();

        while (x <= 4) {
            if (x <= 0) {
                y = Math.pow(x, 2) - 1;
            } else if (x > 0 && x <= 1.5) {
                y = Math.cos(x);
            } else {
                y = Math.sin(x - 1);
            }
            System.out.println(" y = " + y + " x = " + x);
            x += 0.5;
            System.out.println(" y = " + y + " x = " + x);
            if (y > 0) {
                positiveY.add(new Point(x, y));
            }
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Poloshitelnix znachenii funkcii:  " + positiveY.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        x = -4;
        positiveY = new ArrayList<>();

        do {
            if (x <= 0) {
                y = Math.pow(x, 2) - 1;
            } else if (x > 0 && x <= 1.5) {
                y = Math.cos(x);
            } else {
                y = Math.sin(x - 1);
            }
            System.out.println(" y = " + y + " x = " + x);
            x += 0.5;
            System.out.println(" y = " + y + " x = " + x);
            if (y > 0) {
                positiveY.add(new Point(x, y));
            }
            
        } while (x <= 4);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Poloshitelnix znachenii funkcii:  " + positiveY.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
    }
}