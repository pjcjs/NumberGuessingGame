package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/

        //charAt() methoduna index verince size karakteri getirir.
        //break keyword'u, bir döngüyü veya bir switch ifadesini erken
        // bir şekilde sonlandırmak için kullanılır.

        String s = "Tramvay";

        for (int i = 0;     i < s.length(); i++) { // i <= s.length() -1

            if (s.charAt(i) == 'a') {
                break;
            }
            System.out.print(s.charAt(i)); //Tr

        }
        System.out.println();
        //Ornek 2: Verilen bir String’de kucuk harfleri console’a yazdirmayan kodu yaziniz.
        //“Pwd12?Ab” ==> P12?A


        String s1="Pwd12?Ab";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)>='a' && s1.charAt(i)<='z') {
                continue;
            }
            System.out.print(s1.charAt(i)); //P12?A
        }
        //2. yol

        for (int i=0; i<s1.length(); i++) {
            char ch=s1.charAt(i);
            if (ch>='a' && ch<='z') {
                continue;
            }else {
                System.out.print(ch); //P12?A
            }
        }
//ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
//example 3: Write the code that reverses a given String

//           String t = "Ali Can";  ==> "naC ilA"
//Loop olustururken baslangic ve bitis degeri cok onemlidir

//son index her zaman length()-1’tir

        String t = "Ali Can";
        for (int i = t.length()-1; i >= 0; i--) {
            System.out.print(t.charAt(i)); //naC ilA
        }
    




    }
}