package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
//Example 1: Convert a two-dimensional Array to a one-dimensional Array.
// int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}};

        //1.adim: Iki boyutlu bir Array’de kac eleman oldugunu bulan kodu yazalim

        int count = 0;
        for(int[] w: numbers){
            count += w.length;
        }
        System.out.println(count); //5
//2.adim: Tek boyutlu Array’i, iki boyutlu Array’in eleman sayisini kullanarak olusturalim
        int[] arr = new int[count];

//3.adim: Iki boyutlu Array’deki elemanlari tek boyutlu Array’e transfer edelim
        int idx = 0;
        for(int[] w: numbers){
            for(int z: w){
                arr[idx] = z;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr)); //[5, 4, 2, 3, 2]

    }
}
