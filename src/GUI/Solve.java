package GUI;

import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int n  = input.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

        }
    }
}
