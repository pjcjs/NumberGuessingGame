package d9string_loops;

public class StringManipulations02 {

    public static void main(String[] args) {
        //Ornek 1: Bir String’deki tekrarsiz character’leri ekrana yan yana yazdiriniz.
       // yusuf ==> ysf

        String s = "yusuf";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                result += c;
            }
        }
        System.out.println(result); //ysf

        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }

        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }

        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }

        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }
        System.out.println();

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini ‘*’ kullanarak görünmez yapın
//      1234 6789 1234 6789 ==> **** **** **** 6789
        String cardNum="1234 6789 1234 6789";
        String first= cardNum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println("first = " + first);
        String last= cardNum.substring(15);
        System.out.println("last = " + last);
        String result1= first+last;
        System.out.println("result1 = " + result1);
        String result2=first.concat(last);
        System.out.println("result2 = " + result2);


    }

}
