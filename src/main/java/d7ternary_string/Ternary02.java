package d7ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        int a = 123;
        String sonuc = a > 99 && a < 1000 ? "3 basamakli" : "3 basamakli degil";
        System.out.println(sonuc);
    }
}
