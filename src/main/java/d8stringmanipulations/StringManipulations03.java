package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        //Regular Expressions (Regex)

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

i)En az 8 karakter olsun
ii)Space karakteri password'de olmasin
iii)En az bir tane buyuk harf olsun
iv)En az bir tane kucuk harf olsun
v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String pwd= input.nextLine();

        boolean lengthControl= pwd.length()>7;
        boolean spaceControl= pwd.replaceAll("[^ ]", "").length()==0;
        //        boolean spaceControl= pwd.replaceAll("[^ ]", "").isEmpty();
        //       boolean spaceControl= !pwd.contains(" ");
        boolean upperCaseControl= pwd.replaceAll("[^A-Z]", "").length()>0;
        boolean lowerCaseControl= pwd.replaceAll("[^a-z]", "").length()>0;
        boolean digitControl= pwd.replaceAll("[^0-9]", "").length()>0;

        boolean isValid= lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;
        if(isValid){
            System.out.println("Şifre geçerlidir.");
        }else{
            System.out.println("Şifre geçersizdir.");
        }

    }
}
