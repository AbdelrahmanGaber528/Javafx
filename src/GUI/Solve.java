package GUI;

import java.util.Arrays;
import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            Arrays.sort(a);

            long sum =0;

            for (int i = 0; i < k; i++) {
                sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}
