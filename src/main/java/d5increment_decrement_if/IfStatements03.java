package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = scan.nextInt();

        if(num>0) {
            System.out.println("Pozitif");
        } else if(num<0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Notr");
        }
    }
}
