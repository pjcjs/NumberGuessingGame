package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
    bir String dizisi sadece String değerler saklayabilir.
    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
    Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/
        //Array olusturmak

        String[] stdNames1 = new String[3];
        //String stdNames2[] = new String[4]; //C style

        System.out.println(Arrays.toString(stdNames1)); //[null, null, null]

        //ornek 1: 5 elemanli notes adinda, int bir arrray olusturunuz ve console’a yazdiriniz
        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); //[0, 0, 0, 0, 0]

//ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
//Array’ler de non primitive (reference) veri tipleri de saklanabilir.
        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers)); //[null, null, null, null, null, null, null, null, null, null]
        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] names = new String[3];
        System.out.println(Arrays.toString(names)); //[null, null, null]
        names[0] = "Ali Can";
        names[2] = "Veli Han";
        names[1] = "Ayse Hanim";

        System.out.println(Arrays.toString(names)); //[Ali Can, Ayse Hanim, Veli Han]


        String[] cities = new String[5];
        cities[0] = "Berlin";
        cities[1] = "Sivas";
        cities[2] = "İstanbul";
        cities[3] = "Ankara";
        cities[4] = "İzmir";
//Toplam harf sayısını bulma, 1. yol
        int totalChar=0;
        for (int i = 0; i < cities.length; i++) {//length array'in uzunlugunu verir, field'dır metot değil
            totalChar+=cities[i].length();
        }
        System.out.println("Total characters: "+totalChar);

        //Toplam harf sayısını bulma, 2. yol
//for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
//for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
//variable ismi olarak da genel kabul w’nun kullanilmasidir.
        int totalChar2=0;
        for(String w:cities){
            totalChar2+=w.length();
        }
        System.out.println("Total characters: "+totalChar2);


    }
}
