package test;
import java.util.Scanner;
public class HinhChuNhat {
    public int dai;
    public int rong;
    public int tinhChuvi(){
        int chuvi = (this.dai + this.rong) * 2;
        return chuvi;
    }
    public int tinhDientich(){
        int dientich = this.dai * this.rong;
        return dientich;
    }
    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai: ");
        int chieudai = scanner.nextInt();
        hcn.dai = chieudai;
        System.out.print("Nhap vao chieu rong: ");
        int chieurong = scanner.nextInt();
        hcn.rong = chieurong;
        int chuvi = hcn.tinhChuvi();
        int dientich = hcn.tinhDientich();
        System.out.println("Chu vi hinh chu nhat = "+ chuvi);
        System.out.println("Dien tich hinh chu nhat = "+ dientich);
    }

}

