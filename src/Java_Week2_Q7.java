import java.util.Scanner;

public class Java_Week2_Q7
{
    public static void degreeFah(int Fah)
    {
        int Cel = (Fah-32) * 5/9;
        System.out.println(Cel);

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit");
        int Fah = scan.nextInt();

        degreeFah(Fah);

    }
}
