package d4operator_casting_scannerv;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Operators
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        byte age = input.nextByte();
        System.out.println("Yaşınız: " + age);
        System.out.println("Boyunuzu giriniz: ");
        float height = input.nextFloat();
        System.out.println("Boyunuz: " + height);
        System.out.println("İsminizi giriniz: ");
        String name = input.nextLine();
        System.out.println("İsminiz: " + name);
    }
}
