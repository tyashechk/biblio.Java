import java.util.Arrays;

public class lab5 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");

double array[] = {-1.5, 0.1, 12, 0, -2.2, 0.5, -1, 0.3};

System.out.println(Arrays.toString(array));


double arrayMin = array[0];

for (int i = 1; i < array.length; i++) {
    if (array[i] < arrayMin) {
        arrayMin = array[i];
    }
}
System.out.println("minimalnae znachenie massiva: " + arrayMin);

double arrayMax = array[0];

for (int i = 1; i < array.length; i++) {
    if (array[i] > arrayMax) {
        arrayMax = array[i];
    }
}
System.out.println("maksimalnae znachenie massiva: " + arrayMax);

for (int i = 0; i < array.length; i++) {
    if (array[i] <= 0) {
        array[i] = arrayMin;
    } else {
        array[i] = arrayMax;
    }
}

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("izmenenni massiv: " + Arrays.toString(array));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
    }
}