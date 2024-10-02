package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num=input.nextInt();
        if(num%2==0) {
            System.out.println("Girdiğiniz sayı çifttir.");
        }
        if(num%2!=0) {
            System.out.println("Girdiğiniz sayı tektir.");
        }
    }
}
