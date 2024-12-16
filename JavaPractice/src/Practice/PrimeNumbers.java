package Practice;

import java.util.Scanner;

public class PrimeNumbers
{

public  static boolean isPrime(int num) {
    if (num == 0 || num == 1) {
        return false;
    }
    for (int i = 2; i <=num / 2; i++) {
        if (num % i == 0) {
            return false;
        }


    }
    return true;
}

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
          for(int i=1;i<=num;i++)
          {
              for(int j=num;j>0;j--)
              {
                  if(i%j!=0)
                  {
                      System.out.println(i);
                  }
              }
          }
    }
}




