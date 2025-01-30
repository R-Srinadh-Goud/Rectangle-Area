import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner is used to take the i/p by the user
        
        // Using int for length
        System.out.print("Enter length (in integer): ");
        int length = sc.nextInt();
        
        // Using float for width
        System.out.print("Enter width (in float): ");
        float width = sc.nextFloat();
         
        float area = length * width;
        
      
        System.out.println("Area of the rectangle: " + area);
        
        sc.close();
    }
}

