package Lab2;
import java.util.Scanner;
public class StringDemo {
    public static void main(String[]args){
        String chuoi = "Xi nc hao c a cba n";
        int length = chuoi.length();
        int totalSpace = 0;
        for (int i=0; i<length; i++){
            char kyTu = chuoi.charAt(i);
            if (kyTu == ' ')
            {
                totalSpace++;
            }
        }
        System.out.println("So luong khoang trang la: "+totalSpace);

        //xoa khoang trang
        chuoi = chuoi.replaceAll(" ","");
        System.out.println("Chuoi sau khi xoa khoang trang: "+chuoi);

        //chuyen tat ca chu cai ve in hoa
        chuoi=chuoi.toUpperCase();
        System.out.println("Chuoi sau khi chuyen tat ca chu cai ve in hoa: "+chuoi);

    }
}
