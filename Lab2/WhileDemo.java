package Lab2;
import java.util.Scanner;
public class WhileDemo {
    public static void main(String[] args){
        System.out.println("Nhap so nguyen N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Day so giam dan la: ");
        while (N>0){
            System.out.print(N+" ");
            N--;
        }
    }
}
