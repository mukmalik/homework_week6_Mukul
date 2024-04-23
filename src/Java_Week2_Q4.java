public class Java_Week2_Q4
{
    int a4 = 4;
    int b4 = 44;
    static int ab = 5;
    static int cd = 55;

    public void bothSame()
    {
        System.out.println(a4+b4+ab+cd);
    }

    public static void bothStaticM()
    {
        Java_Week2_Q4 objQ4 = new Java_Week2_Q4();
        System.out.println(ab+cd+objQ4.a4+objQ4.b4);
    }

    public static void main(String[] args)
    {
        bothStaticM();
        Java_Week2_Q4 Call = new Java_Week2_Q4();

        Call.bothSame();

    }
}
