import java.lang.Math;
import java.util.Scanner;

public class Java_Week2_Q6
{
    public static void radiudCircle(int r)
    {
        double c = Math.PI*r*r;
        System.out.println(c);

    }

    public static void main(String[] args)
    {
        Scanner Call = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = Call.nextInt();

        radiudCircle(r);

    }
}
