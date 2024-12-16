package List;

import java.util.Stack;

public class Stackprogram
{
    public static void main(String[] args)
    {
        Stack s1=new Stack();
        s1.push(123);
        s1.push("Stack");
        s1.push(false);
        s1.push('a');


        System.out.println(s1);

        System.out.println(s1.peek());

        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);

    }
}
