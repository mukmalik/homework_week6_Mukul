import java.util.Scanner;

public class Java_Week2_Q5
{
    public void addMeth(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
    }

    public void subMeth(int a, int b)
    {
        int c = a-b;
        System.out.println(c);

    }

    public static void multMeth(int a, int b)
    {
        int c = a*b;
        System.out.println(c);

    }

    public static void divMeth(int a, int b)
    {
        int c = a/b;
        System.out.println(c);

    }


    public static void main(String[] args)
    {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int a = inputNumber.nextInt();
        int b = inputNumber.nextInt();

        divMeth(a,b);
        multMeth(a,b);
        Java_Week2_Q5 N = new Java_Week2_Q5();
        N.addMeth(a,b);
        N.subMeth(a,b);


    }
}
