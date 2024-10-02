package d8stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //replace() methodu 2. parametredeki String’i 1. parametredeki String’e cevirir.
        String s= "Learn Java earn money";
        System.out.println(s.replace("money", "dollar")); //Learn Java earn dollar

        //Ornek 2: “s” String’indeki tum “e” harflerini siliniz.
        //Delete all “e” letters in the String “s”.

        String s2=s.replace("e", "");
        System.out.println(s2); //Larn Java arn mony



    }
}
