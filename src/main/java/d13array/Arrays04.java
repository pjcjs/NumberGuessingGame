package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
//Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.
//     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] newArr = new int[arr.length];

        System.out.println(Arrays.toString(arr));//[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newArr));//[0, 0, 0, 0, 0, 0]

        int firstIndex = 0;

        for(int w:arr){
            if(w!=0){
                newArr[firstIndex]=w;
                firstIndex++;
            }
        }System.out.println(Arrays.toString(newArr));//[2, 3, 12, 0, 0, 0]




    }
}
