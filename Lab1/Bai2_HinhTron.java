package Lab1;
import java.util.Scanner;
public class Bai2_HinhTron {
    public int R;
    public float PI = 3.14f;
    public float chuvi(){
        float chuviC = (float) (2*PI*R);
        return chuviC;
    }
    public float dientich(){
        float dientichS = (float) (PI*R*R);
        return dientichS;
    }

public static void main(String[] args) {
    Bai2_HinhTron HinhTron = new Bai2_HinhTron();
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Nhap ban kinh: ");
    int R = Scanner.nextInt();
    HinhTron.R = R;
    float chuvi = HinhTron.chuvi();
    float dientich = HinhTron.dientich();
    System.out.println("Chu vi: " + chuvi);
    System.out.println("Dien tich: " + dientich);
}
}
