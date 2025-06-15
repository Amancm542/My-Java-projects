import java.util.Scanner;

public class sum_there_numbers {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number => ");
        float first = input.nextFloat();
        System.out.print("Enter second number => ");
        float second = input.nextFloat();
        System.out.print("Enter therd number => ");
        float therd = input.nextFloat();
        
        System.out.println("Sum is => "+(first+second+therd));
    }
    
}