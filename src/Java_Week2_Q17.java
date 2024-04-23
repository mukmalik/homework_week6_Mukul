import java.util.Scanner;

public class Java_Week2_Q17
{

        public static void toBinary(int decimal) {
            int binary[] = new int[40];
            int index = 0;
            int x = 0;
            while (decimal > 0) {
                binary[index++] = decimal % 2;
                decimal = decimal / 2;
            }
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(binary[i]);


            }

        }

        public static void main(String args[]) {

            System.out.println("Decimal value is: ");
            Scanner scaBinary = new Scanner(System.in);
            int y = scaBinary.nextInt();
            System.out.println("Binary value is: ");
            toBinary(y);
        }

}
