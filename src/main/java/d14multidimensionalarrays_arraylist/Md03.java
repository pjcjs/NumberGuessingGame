package d14multidimensionalarrays_arraylist;

public class Md03 {
    public static void main(String[] args) {
        //Ornek 1: int turunde bir Multidimensional Array’deki
        // en kucuk ve en buyuk elemanin toplamini bulunuz.

        int[][] ages = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int min = ages[0][0];
        int max = ages[0][0];

        for(int[] w: ages){
            for(int z: w){
                min = Math.min(min, z);
                max = Math.max(max, z);
            }
        }
        System.out.println(min); //4
        System.out.println(max); //43

        System.out.println(min + max); //47

    }
}
