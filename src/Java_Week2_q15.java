import java.util.Scanner;

public class Java_Week2_q15
{
    public static void swapNumber(int a, int b)
    {
        int temp;
        System.out.println("Value before swap  "+" a  =  "+a+" and  b =  "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value after swap "+" a = "+a+"  and b =   "+b);
    }

    public static void main(String[] args)
    {
        Scanner swapN = new Scanner(System.in);
        System.out.println("Enter Vaue for a = ");
        int l = swapN.nextInt();

        Scanner swapB = new Scanner(System.in);
        System.out.println("Enter value for b = ");
        int v =swapB.nextInt();

        swapNumber(l,v);

    }
}

