import java.util.Scanner;
public class Lab10B {
    public static boolean methodIsValid(double width, double height){
        double sum = width + height;
        if(sum > 30){
            return true;
        } else{
            return false;
        }
    }
    public static double methodArea(double width, double height){
        double area = width * height;
        return area;
    }
    public static double methodPerimeter(double width, double height){
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width, height;
        String input = "";
        boolean exit = false;

        System.out.print("Enter width: ");
        width = scan.nextDouble();
        System.out.print("Enter height: ");
        height = scan.nextDouble();

        if(methodIsValid(width, height)) {
            System.out.println("This a valid rectangle");
            System.out.println("The area is: " + methodArea(width, height));
            System.out.println("The perimeter is: " + methodPerimeter(width, height));
        }else if(!methodIsValid(width, height)){
            System.out.println("This is an invalid rectangle\n");
        }

        do {
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            input = scan.next();
            if(input.equalsIgnoreCase("Y")){
                System.out.print("\nEnter width: ");
                width = scan.nextDouble();
                System.out.print("Enter height: ");
                height = scan.nextDouble();

                if(methodIsValid(width, height)) {
                    System.out.println("This a valid rectangle");
                    System.out.println("The area is: " + methodArea(width, height));
                    System.out.println("The perimeter is: " + methodPerimeter(width, height));
                }else if(!methodIsValid(width, height)){
                    System.out.println("This is an invalid rectangle\n");
                }
            }else{
                exit = true;
            }
        }while(!exit);
        System.out.println("Program Ends");
    }
}

