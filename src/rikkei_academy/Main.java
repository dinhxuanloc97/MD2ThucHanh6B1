package rikkei_academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam vao :");
        year = scanner.nextInt();
        if (year % 4 ==  0){
            if (year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("La nam nhuan ",year);
                }else {
                    System.out.printf("khong phai nam nhuan", year);
                }
            }else {
                System.out.printf("La nam nhuan ", year);
            }
        }else {
            System.out.printf("khong phai nam nhuan",year);
        }
    }
}