package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
//example 1: Print the sum of the digits of a given integer to the console

//           578 ==> 5+7+8=20 ==> Output 20 olmalidir

        int num = 578;
        int sum = 0;
        int rakam = 0;

        for (int i = num; i != 0; i /= 10) {
            rakam = i % 10;
            sum += rakam;
        }
        System.out.println("Sum of the digits of the number " + num + " is " + sum);

//Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
//Example 2: Write the code that returns the non-repeating characters in a String.
// Yusuf ==> Ysf

            String s = "Yusuf";
            String result = "";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(s.indexOf(ch)==s.lastIndexOf(ch)) {
                    result += ch;
                }
            }
            System.out.println(result); //Ysf


    }
}
