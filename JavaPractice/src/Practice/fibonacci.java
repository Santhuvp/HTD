package Practice;

import java.util.Scanner;

public class fibonacci {
    public void fib1(int range) {
        int n1 = 0, n2 = 1;
        System.out.print("The fibonacci series is " + n1 + " " + n2);
        for (int i = range; i > 0; i--) {

            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range=sc.nextInt();
        fibonacci f1=new fibonacci();
        f1.fib1(range);
    }
}
