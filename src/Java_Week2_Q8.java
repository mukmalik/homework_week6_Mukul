import java.util.Scanner;

public class Java_Week2_Q8
{
    public static void triangleMeth(int h, int w)
    {
        int area = (h*w)/2;
        System.out.println(area);

    }

    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter height");
        int h = Scan.nextInt();
        System.out.println("Enter Weight");
        int w = Scan.nextInt();

        triangleMeth(h,w);
    }
}
