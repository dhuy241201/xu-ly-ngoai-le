package Bt_suDung_lop_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {


    public static void checkTriangle(double a, double b, double c) throws Exception{
        if (a>0 && b>0 && c>0 && (a+b>c) && (a+c>b) && (b+c>a)){
            System.out.println("Đây là hình tam giác");
        }else {
            throw new Exception();


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ 1: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ 2: ");
        double canh2 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ 3: ");
        double canh3 = scanner.nextDouble();


        try {
            checkTriangle(canh1, canh2, canh3);
        }catch (Exception exception){
            System.out.println("Đây không phải hình tam giác");;
        }
        System.out.println("Ctr thành công");
    }
}
