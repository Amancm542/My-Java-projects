import java.util.Scanner;

public class persetage_calculater {
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Enter Beng marks : ");
        int Beng = sc.nextInt();

        System.out.print("Enter Eng marks : ");
        int Eng = sc.nextInt();

        System.out.print("Enter Hist marks : ");
        int Hist = sc.nextInt();

        System.out.print("Enter Geo marks : ");
        int Geo = sc.nextInt();
        
        System.out.print("Enter Math marks : ");
        int Math = sc.nextInt();

        double avarage = (Beng + Eng + Hist + Geo + Math) / 5 ;

        System.out.println("Your avarage is => "+avarage);

    }
}