package Lab2;
import java.util.Scanner;
public class KiemTraChanLe {
    public static void main(String[] args){
        System.out.println("Nhap so nguyen N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if ((N % 2) == 0){
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day la so le");
        }
    }
}
