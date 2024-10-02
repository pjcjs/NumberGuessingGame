package d4operator_casting_scannerv;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki rakamların toplamını yazdıran kodu yazınız
        // Örnek: 12345 => 1+2+4+5 = 12
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz: ");
        int number = input.nextInt();
        int firstTwoDigits = number / 1000;
        int lastTwoDigits = number % 100;
        int sum = firstTwoDigits % 10 + firstTwoDigits / 10 + lastTwoDigits % 10 + lastTwoDigits / 10;
        System.out.println("Girdiğiniz sayının ilk iki ve son iki basamağındaki rakamların toplamı: " + sum);


    }
}
