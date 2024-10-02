package d7ternary_string;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s = "Java is easy";
        int sLength = s.length();
        System.out.println(sLength); // 12
        char firstChar = s.charAt(0);
        System.out.println(firstChar); // J
        char lastChar = s.charAt(sLength - 1);
        System.out.println(lastChar); // y
        String sub1= s.substring(0, 4);
        System.out.println(sub1); // Java
        //is kelimesini alınız
        String sub2 = s.substring(5, 7);
        //easy kelimesini alınız
        String sub3 = s.substring(8, 12);
        System.out.println("sub3 = " + sub3);
        String sub4 = s.substring(8);
        System.out.println("sub4 = " + sub4);
//Ornek 6: “s” String’inde easy kelimesinin var olup olmadigini kontrol ediniz.
//Example 6: Check if the word easy exists in the String “s”.
//contains() method’u herhangi bir karakterin veya karakterlerin String’de var olup olmadigini kontrol eder.
//contains() methodu true veya false return eder. boolean
        boolean isExist = s.contains("easy");
        System.out.println(isExist); // true

        //StartWith() methodu bir String’in istenen harf veya harfler ile baslayip baslamadigini kontrol eder.
        boolean isStart = s.startsWith("J");
        System.out.println(isStart); // true
        //EndsWith() methodu bir String’in istenen harf veya harfler ile bitip bitmedigini kontrol eder.
        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd); // true
    }
}
