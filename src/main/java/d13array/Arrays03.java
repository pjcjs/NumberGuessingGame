package d13array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
//Example 1: Create an int array and write the elements less than 5.
//      [12, 3, -3, 5, 23] ==> 3, -3

        int[] numbers= {12, 3, -3, 5, 23};

        for(int w:numbers) {
            if(w<5) {
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //Ornek 2: Spesifik bir elemanin Array’de olup olmadigini anlamak icin gereken kodu yaziniz.

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
//binarySearch() methodunu sort() kullanmadan kullanmayiniz
//binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
// “-” ==> isaretinin anlami eleman yok demektir

        String[] names={"A", "T", "K", "E", "B"};

        Arrays.sort(names);
        int result=Arrays.binarySearch(names, "B");
        System.out.println(result); //1

        System.out.println();

        int[] arr= {2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 2)); //1

        System.out.println();

        String[] s= {"A", "C", "B", "D"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s, "A")); //0
        System.out.println(Arrays.binarySearch(s, "E")); //-5

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
//Example 3: Write the code that shows you how many words are in a given sentence.
//String s = “Java is easy. Learn Java earn money.“;

        String s1 = "Java is easy. Learn Java earn money.";
        String[] words = s1.split(" ");
        System.out.println(words.length); //7












    }
}
