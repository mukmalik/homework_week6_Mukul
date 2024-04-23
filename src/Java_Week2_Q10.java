import java.util.Scanner;

public class Java_Week2_Q10
{
    public static void eightTable(int t)
    {
        int i = 1;
        int y;

        while (i <= 10)
        {
            y = i*t;
            System.out.println("Vaue  "+t+" x "+i+" = "+y);
            i++;

        }
    }

    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Test Data: Input number");
        int h = Scan.nextInt();

        eightTable(h);

    }
}
