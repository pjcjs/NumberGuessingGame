package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        //Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
        //1==> Pazar, 2 ==> Pazartesi …*

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaçıncı gün olduğunu giriniz: ");
        double numDouble = input.nextDouble();
        int num = (int) numDouble;
        if(numDouble != num) {
            System.out.println("Lütfen bir tam sayı giriniz");
        }else{
            if(num<=0){
                System.out.println("Geçersiz gün sayısı girdiniz.");
        }
        else if(num == 1) {
            System.out.println("Pazar");
        } else if(num == 2) {
            System.out.println("Pazartesi");
        } else if(num == 3) {
            System.out.println("Salı");
        } else if(num == 4) {
            System.out.println("Çarşamba");
        } else if(num == 5) {
            System.out.println("Perşembe");
        } else if(num == 6) {
            System.out.println("Cuma");
        } else if(num == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Geçersiz gün sayısı girdiniz.");
        }
    }
}
}
