package Lab2;
import java.util.Scanner;
public class ForDemo {
    public static void main(String[] args){
        int tongChan = 0;
        int tongLe = 0;
        System.out.println("Nhap so nguyen N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for ( int i=1; i<=N; i++){
            if(i%2==0){
                tongChan+=i;
            } else {tongLe+=i;};
        }
        System.out.println("Tong cac so chan tu 1 den N la: "+tongChan);
        System.out.println("Tong cac so le tu 1 den N la: "+tongLe);

    }
}
