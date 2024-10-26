package GUI;
import java.util.Scanner;
public class Solve{
    static boolean isPrime(int num)
    {
        if(num<=1)
            return false;
        int i = 2;
        while(i<=num/2){
            if(num%i==0)
                return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if(isPrime(input.nextInt()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}