package d6if_switch;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gün ismini giriniz: ");
        String dayName = input.nextLine();
        boolean haftaİci = dayName.equalsIgnoreCase("pazartesi") || dayName.equalsIgnoreCase("salı") || dayName.equalsIgnoreCase("çarşamba") || dayName.equalsIgnoreCase("perşembe") || dayName.equalsIgnoreCase("cuma");
        boolean haftaSonu = dayName.equalsIgnoreCase("cumartesi") || dayName.equalsIgnoreCase("pazar");
        if(haftaİci){
            System.out.println("Hafta içi");
        }else if(haftaSonu){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Geçersiz gün ismi girdiniz.");
        }
    }
}
