public class Java_Week2_Q3
{
    static int a3s = 10;
    int rr = 50;
    //String nonStatic = "tomCat3";

    public static void main(String[] args)
    {
           staticMet();
           Java_Week2_Q3 obj3 = new Java_Week2_Q3();
           obj3.instanceMet();
    }

    public static void staticMet()
    {
        Java_Week2_Q3 obj3 = new Java_Week2_Q3();

        System.out.println("Calling static variavle in static "+a3s);
        System.out.println("system print in instance"+obj3.rr);
        //System.out.println("calling instance Variable in static "+obj3.nonStatic);
    }

    public void instanceMet()
    {

        System.out.println("system print in instance"+a3s);
        System.out.println("system print in instance"+rr);
        //System.out.println("system print in instance"+nonStatic);



    }
}
