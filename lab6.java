import java.util.Arrays;

public class lab6 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
    

    int[][] array = {
        //   0   1   2   3   4            __i__
            {1,  15, 24, 8,  17}, // 0          |  
            {23, 7,  16, 5,  14}, // 1          j
            {20, 4,  13, 22, 6 }, // 2          |
            {12, 21, 10, 19, 3 }, // 3
            {9,  18, 2,  11, 25}  // 4
        };

        for (int i = 0; i < array.length; i++) {
        System.out.println(Arrays.toString(array[i]));
}

//------------------------------------------------
        int str1 = 0, stl1 = 0, diag1 = 0;
        int str2 = 0, stl2 = 0, diag2 = 0;
        int str3 = 0, stl3 = 0;
        int str4 = 0, stl4 = 0;
        int str5 = 0, stl5 = 0;
//------------------------------------------------
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
//------------------------------------------------
                if (i == j) {
                    diag1 += array[i][j];
                }
                if (i + j == array.length - 1) {
                    diag2 += array[i][j];
                }
//------------------------------------------------
                if (j == 0) {
                    str1 += array[i][j];
                }
                if (j == 1) {
                    str2 += array[i][j];
                }
                if (j == 2) {
                    str3 += array[i][j];
                }
                if (j == 3) {
                    str4 += array[i][j];
                }
                if (j == 4) {
                    str5 += array[i][j];
                }
//------------------------------------------------
                if (i == 0) {
                    stl1 += array[i][j];
                }
                if (i == 1) {
                    stl2 += array[i][j];
                }
                if (i == 2) {
                    stl3 += array[i][j];
                }
                if (i == 3) {
                    stl4 += array[i][j];
                }
                if (i == 4) {
                    stl5 += array[i][j];
                }
            }
        }



        System.out.println("Symma pervoi stroki:        " + str1);
        System.out.println("Symma vtoroi stroki:        " + str2);
        System.out.println("Symma tretiei stroki:       " + str3);
        System.out.println("Symma chetvertoi stroki:    " + str4);
        System.out.println("Symma pyatoi stroki:        " + str5);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Symma pervogo stolbtsa:     " + stl1);
        System.out.println("Symma vtorogo stolbsa:      " + stl2);
        System.out.println("Symma tretiego stolbsa:     " + stl3);
        System.out.println("Symma chetvertogo stolbsa:  " + stl4);
        System.out.println("Symma pyatogo stolbsa:      " + stl5);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Symma pervoi diagonali:     " + diag1);
        System.out.println("Symma vtoroi diagonali:     " + diag2);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");

        if (str1 == str2 && 
            str2 == str3 && 
            str3 == str4 && 
            str4 == str5 && 
            str5 == stl1 && 
            stl1 == stl2 && 
            stl2 == stl3 && 
            stl3 == stl4 && 
            stl4 == stl5 && 
            stl5 == diag1 && 
            diag1 == diag2) {
            System.out.println("Vse sovpalo!!! Matritsa yavlyaetsa magicheskim kvadratom >3");
        } else {
            System.out.println("Symmi ni sovpali, mitritsa ni yavlyaetsa magicheskim kvadratom :(");
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("--------------------konetz!!-------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
    }
}