package Lab2;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen N nam: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean dk1 = (N % 400 == 0);
        boolean dk2 = (N % 4 == 0);
        boolean dk3 = (N % 100 == 0);

        //dk1 la true
        if ( N % 400 == 0) {
            System.out.println(N + " La nam nhuan");
        } else if (N%4==1 && N%100==0)
        //dk2 == "false" && dk3 == "true"
            {
            System.out.println(N + " Khong phai nam nhuan");
        } else if (N%4==0 && N%100==1)
        //dk2 == "true" && dk3 == "false"
            {
            System.out.println(N + " Khong phai nam nhuan");
        } else {
            System.out.println(N + " Khong phai nam nhuan");
        }
    }
}
