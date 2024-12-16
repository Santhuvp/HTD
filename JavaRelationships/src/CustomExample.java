public class CustomExample
{
    public  static void validateAge(int age) throws CustomException {

        if(age<18)
        {
            throw new CustomException("Please provide the valid age");
        }
    }

    public static void main(String[] args)   {
        int age=14;
        try {
            validateAge(age);
        } catch (CustomException e) {
            System.out.println("Errrorr "+e);
        }
        finally {
            int a=145;
            double af=a;
            int b= (int) af;
            System.out.println(b);
        }

    }
}
