import java.util.Scanner;
public class Lab10A {
    public static float averageCalculator(int a, int b) {

       float averageCalculation = (a + b) / 2;

        return averageCalculation;
    }

    public static void main (String[] args)
        {
            float num1 = 0;
            float num2 = 0;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter number 1: ");
            num1 = input.nextFloat();
            System.out.print("Enter number 2: ");
            num2 = input.nextFloat();

            if(num1 < num2)
            {
                System.out.println("Min is " + (int)num1);
                System.out.println("Max is " + (int)num2);
            }
            if(num1 > num2){
                System.out.println("Min is " + (int)num2);
                System.out.println("Max is " + (int)num1);
            }

            float result = averageCalculator((int) num1, (int) num2);
            System.out.println("Average is " + (int)result);
        }
    }

