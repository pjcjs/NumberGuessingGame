package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static <Arraylist> void main(String[] args) {
        /*ArrayList, dinamik boyutlu bir array'dir; eleman ekleyip çıkarırken boyutu otomatik olarak ayarlanır.
 Gerçek hayatta bir alışveriş listesi gibi düşünülebilir.
 Alışveriş listesi, ürün isimlerini içerir ve bu isimler String türündedir.*/
        //ArrayList nasil olusturulur?
        //1. Adim: ArrayList olusturmak icin "ArrayList" class'indan bir obje olusturulur.
        //2. Adim: ArrayList'in data turu<> icine yazilir. ArrayList'de sadece non-primitive data tipleri kullanilabilir.
        //3. Adim: ArrayList'in adi ve bir deger atanir.
        //4. Adim: ArrayList'e deger eklemek icin add() method'u kullanilir.
        //5. Adim: ArrayList'i yazdirmak icin System.out.println() method'u kullanilir.
        //6. Adim: ArrayList'ten bir elemani yazdirmak icin get() method'u kullanilir.
        //7. Adim: ArrayList'teki bir elemani silmek icin remove() method'u kullanilir.
        //8. Adim: ArrayList'teki bir elemani degistirmek icin set() method'u kullanilir.
        //9. Adim: ArrayList'in uzunlugunu bulmak icin size() method'u kullanilir.
        //10. Adim: ArrayList'in bos olup olmadigini kontrol etmek icin isEmpty() method'u kullanilir.
        //11. Adim: ArrayList'teki bir elemanin index'ini bulmak icin indexOf() method'u kullanilir.
        //12. Adim: ArrayList'teki bir elemanin son index'ini bulmak icin lastIndexOf() method'u kullanilir.
        //13. Adim: ArrayList'teki bir elemanin olup olmadigini kontrol etmek icin contains() method'u kullanilir.
        //14. Adim: ArrayList'teki tum elemanlari silmek icin clear() method'u kullanilir.
        //15. Adim: ArrayList'teki elemanlari kopyalamak icin clone() method'u kullanilir.
        //16. Adim: ArrayList'teki elemanlari siralamak icin sort() method'u kullanilir.
        //17. Adim: ArrayList'teki elemanlari tersten yazdirmak icin reverse() method'u kullanilir.
        //18. Adim: ArrayList'teki elemanlari birleştirmek icin addAll() method'u kullanilir.
        //19. Adim: ArrayList'teki elemanlari belirli bir index'ten itibaren silmek icin removeAll() method'u kullanilir.
        //20. Adim: ArrayList'teki elemanlari belirli bir index'ten itibaren silmek icin retainAll() method'u kullanilir.
        //21. Adim: ArrayList'teki elemanlari belirli bir index'ten itibaren silmek icin subList() method'u kullanilir.
        //22. Adim: ArrayList'teki elemanlari belirli bir index'ten itibaren silmek icin toArray() method'u kullanilir.
        //23. Adim: ArrayList'teki elemanlari belirli bir index'ten itibaren silmek icin trimToSize() method'u kullanilir.

        /*
1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler
non-primitive'leri (reference'lari) depolar
2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
4)ArrayList'ler eleman sayisinda esnektirler.
5) Array'leri Java niye iptal etmedi?
    a) Array'ler cok daha hizlidir
    b) Array'ler memory'de cok az yer kaplarlar
    c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
 doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
 bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
*/
        //ArrayList nasil olusturulur?
//ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi
        ArrayList<Integer> ages = new ArrayList<>(); //Java 7 ve sonrasi -type inference -tip cikarimi

        //add() metodu, ArrayList’e yeni bir eleman eklemek için kullanılır ve
// eklenen elemanı listenin sonuna yerleştirir.

        ages.add(9);
        ages.add(12);
        ages.add(5);

        System.out.println(ages); //[9, 12, 5]
        //List’te araya eleman eklemek icin index numarasini yazariz
        ages.add(1, 28);

        System.out.println(ages); //[9, 28, 12, 5]

        ages.add(3, 7);
        System.out.println(ages); //[9, 28, 12, 7, 5]

        ages.add(11);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11]

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11, 1, 2, 3]

        ages.addAll(0, newAges);
        System.out.println(ages); //[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]

        //size() metodu, ArrayList’teki öğelerin sayısını döndürür. (int return eder)

        int totalElement=ages.size();
        System.out.println(totalElement); //12

        //get() metodu, ArrayList’teki belirli bir öğeyi döndürür. (int return eder)
        //get(int index) metodu, ArrayList’te belirli bir konumdaki ogeye erismek icin kullanilir.

        int element = ages.get(3);
        System.out.println(element); //9

        //set(int index, E element) metodu, ArrayList’te belirtilen indeksteki öğeyi verilen yeni öğeyle değiştirir.
// Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.

        Integer a = ages.set(1, 25);
        System.out.println(a); //2




    }
}
