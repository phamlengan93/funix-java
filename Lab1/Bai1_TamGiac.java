package Lab1;
import java.util.Scanner;
public class Bai1_TamGiac {
    public int a;
    public int b;
    public int c;
    public int chuvi(){
        int chuvi = this.a + this.b + this.c;
        return chuvi;
    }
    public float tinhDientich() {
        float p = (float) (a+b+c)/2;
        float dientich = (float) Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        return dientich;
    }
    public static void main(String[] args) {
        Bai1_TamGiac TamGiac = new Bai1_TamGiac();
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        int a = Scanner.nextInt();
        TamGiac.a = a;
        System.out.println("Nhap canh b: ");
        int b = Scanner.nextInt();
        TamGiac.b = b;
        System.out.println("Nhap canh c: ");
        int c = Scanner.nextInt();
        TamGiac.c = c;
        int chuvi = TamGiac.chuvi();
        float dientich = TamGiac.tinhDientich();
        System.out.println("Chu vi tam giac: "+chuvi);
        System.out.println("Dien tich tam giac: "+dientich);
    }

}
