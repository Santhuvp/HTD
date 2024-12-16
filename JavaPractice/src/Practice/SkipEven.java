package Practice;

public class SkipEven {
    public static void main(String[] args) {
        for(int i=1;i<=30;i++)
        {
            if (i>20)
            {
                continue;
            } else if (i%2==0)
            {
                System.out.println(i);
            }


        }
    }
}
