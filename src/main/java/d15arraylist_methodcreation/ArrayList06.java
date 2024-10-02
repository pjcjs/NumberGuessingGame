package d15arraylist_methodcreation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList06 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
// Example 1: Create an Integer List.Write the two closest integers in this List.
//      [12, 23, 10, 19] ==> 12 ve 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums); // [12, 23, 10, 19]

        //Collections.sort(nums); //Sort() yapmak icin 1.yol:Collections yardimci class'i kullandik
        nums.sort(null); //Sort() yapmak icin 2.yol:sort() method'u kullanildi

        System.out.println(nums); //[10, 12, 19, 23]

        int minDiff=nums.get(1)-nums.get(0); //12-10=2

        for (int i = 1; i < nums.size(); i++) { //1.index'ten baslattik ki, 1.den 0.yi cikaralim
            minDiff=Math.min(minDiff,nums.get(i)-nums.get(i-1));

        }
        System.out.println(minDiff); //2
    }
}
