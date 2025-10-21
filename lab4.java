import java.util.Scanner;

public class lab4 {
    public lab4() {
    }
public static double Perimitir(int n, double R) {
    double a = 2 * R * Math.sin(Math.PI / n);
    double P = n * a;
    return P;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        
        int n1 = 10;
        int n2 = 50;
        int n3 = 100;
        
        System.out.println("------------------------------");

        System.out.print("Let Radius:  ");
        double R = scanner.nextDouble();
        System.out.println("Your Radius: " + R);
        
        double P1 = Perimitir(n1, R);
        System.out.println("Perimitir ten-ygolnica:          " + P1);

        double P2 = Perimitir(n2, R);
        System.out.println("Perimitir pidisyat-ygolnica:     " + P2);

        double P3 = Perimitir(n3, R);
        System.out.println("Perimitir stoo-ygolnica:         " + P3);

        System.out.println("KONETC!!!");
        System.out.println("------------------------------");
        scanner.close();
        }
    }