import java.util.Scanner;

public class Java_Week2_Q14
{
    public static void perRectangle(int h, int w)
    {
        int per = 2*(w+h);
        int ar = w*h;
        System.out.println("Area for Rectangle is       ="+ar);
        System.out.println("Perimeter for Rectangle is  ="+per);

    }

    public static void main(String[] args)
    {
        Scanner wi = new Scanner(System.in);
        System.out.print("Enter Width  = ");
        int x = wi.nextInt();

        Scanner he = new Scanner(System.in);
        System.out.print("Enter Height  = ");
        int y = he.nextInt();

        perRectangle(x,y);

    }
}
