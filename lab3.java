public class lab3 {
    public static void main(String[] args) {
        double y;

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
        }
        System.out.println("------------------------------");
        double x = -4;

        while (x <= 4) {
            y = Math.pow(x, 2) - 1;
            System.out.println(" y = " + y + " x = " + x);
            if (x > 0 && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(" y = " + y + " x = " + x);
            } else if (x > 1.5) {
                y = Math.sin(x - 1);
                System.out.println(" y = " + y + " x = " + x);
            }
            x += 0.5;
        }
        System.out.println("--------------------------");
        x = -4;

        do {
            y = Math.pow(x, 2) - 1;
            x += 0.5;
            System.out.println(" y = " + y + " x = " + x);
        } while (x <= 4);
        {
            y = Math.pow(x, 2) - 1;
            System.out.println(" y = " + y + " x = " + x);
            if (x > 0 && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(" y = " + y + " x = " + x);
            } else if (x > 1.5) {
                y = Math.sin(x - 1);
                System.out.println(" y = " + y + " x = " + x);
            }
            x += 0.5;
        }
    }
}