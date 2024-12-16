package Practice;



public class armstrongNumber {
    public static void main(String[] args)
    {
        for(int i=1000;i>0;i--)
        {
            int n=i;
            int n1=n,sum=0;
            while(n1>0)
            {
                int rem=n1%10;
                sum=sum+(rem*rem*rem);
                n1=n1/10;
            }
            if(sum==n)
            {
                System.out.println(n);
            }

        }




    }
}
