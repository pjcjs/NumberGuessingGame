package d15arraylist_methodcreation;

import java.util.Arrays;
import java.util.List;

public class ArrayList07 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);
        System.out.println(myList); // [1, 3, 4, 9, 7]

        //1- Arrays.asList() ile oluşturulan liste, sabit boyutludur. Array gibi calismaya baslar.
// Bu, listenin boyutunu değiştiremezsiniz; yani yeni eleman ekleyemez veya çıkaramazsınız.
//Listin eleman sayisini degistiren methodlari kullanamazsiniz.
//2- Arrays.asList() ile oluşturulan liste, bazı liste işlemlerini desteklemez.
// Örneğin, remove(), add(), clear() gibi yöntemler desteklenmez. Ama set() veya size() kullanabilirsiniz

         //myList.add(5); //UnsupportedOperationException
        //myList.remove(1); //UnsupportedOperationException
        //myList.clear(); //UnsupportedOperationException
    }
}
