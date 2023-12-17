package lect01;

import java.util.Scanner;

public class Triangle {

    public void execu(Scanner sc, int num) {
            for (int i = 1; i <= num; i++) {
                for(int n = num-i; n <= num ;n++){
                    System.out.printf(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
        }
    }

}
