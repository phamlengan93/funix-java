package Lab2;
import java.util.Scanner;
public class DoWhileDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.println("Nhap so nguyen N: ");
            N = scanner.nextInt();
        } while (N<=0);
        System.out.println("N = "+N);

    }



}
