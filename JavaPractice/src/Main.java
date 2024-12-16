import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.next();
        String s2=s1.toLowerCase();
        char[] s_array=s2.toCharArray() ;
      for(int i=0;i<s_array.length;i++)
      {
        s_array[i]+=1;
      }
      System.out.println("The resulted string is ");
      for(char s:s_array)
      {
          System.out.print(s);
      }
    }
}
