import java.util.Scanner;

public class Java_Week2_Q19
{
    public static void UpperCase(String txt)
    {
        System.out.println("Upper Case    "+txt.toUpperCase());

        System.out.println("Lower Case    "+txt.toLowerCase());

    }

    public static void main(String[] args)
    {
        Scanner txtScan = new Scanner(System.in);
        System.out.println("Enter Text");
        String x = txtScan.nextLine();

        UpperCase(x);

    }



}
