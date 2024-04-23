import java.util.Scanner;

public class Java_Week2_Q18
{

    public static void SumAdd(int x, int y)
    {
        int sumA = x+y;
        System.out.println(sumA);
    }

    public static void SubMin(int x, int y)
    {
        int sumS = x-y;
        System.out.println(sumS);
    }
    public static void multiPly(int x, int y)
    {
        int sumM = x*y;
        System.out.println(sumM);
    }
    public static void divId(int x, int y)
    {
        int sumD = x/y;
        System.out.println(sumD);
    }
    public static void moDRem(int x, int y)
    {
        int sumMo = x%y;
        System.out.println(sumMo);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter value First number ");
        Scanner scaNumber = new Scanner(System.in);
        int x = scaNumber.nextInt();

        System.out.println("Enter value Second number ");
        Scanner sca = new Scanner(System.in);
        int y = sca.nextInt();

        SumAdd(x,y);
        SubMin(x,y);
        multiPly(x,y);
        divId(x,y);
        moDRem(x,y);

    }
}
