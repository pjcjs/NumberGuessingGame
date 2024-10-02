package d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //do-while döngüsü, döngü bloğundaki kodun en az bir kere çalışacağından
// emin olmak istediğiniz zaman kullanılır. Yani döngüdeki kodlar,
// koşul kontrolü yapılırken bile olsa, en az bir kez çalışacaktır.
        /*        Baslangic degeri
        do {
            calisacak kodlar
            Artirma/azaltma
        } while (loop calisma kurali);*/

        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console’a yazdiriniz.
//Example 1: Write integers from 5(inclusive) to 3(inclusive) to console.
        int i = 5;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >2);
        System.out.println();
        //while loop ile do while loop farki nedir?

//Asagidaki kodu inceleyiniz. Bu kodda WHILE dongusune giremez cunku sart saglanmiyor.
//while-loop da loop'un en basta kirilmasi mumkundur cunku once kural kontrol edilir sonra islem yapilir

        int k=1;
        while (k<1) {
            System.out.println("While Loop");
            k++;
            //Asagidaki kodu inceleyiniz. do-while loop'da loop'un en basta kirilmasi mumkun degildir. Once 1 kere calistirilir (tabi sonsuz donguye sokulmazsa) Sonra kural kontrol edilir.

            int m=1;

            do{
                System.out.println("Do-While Loop");
                m++;
        }while(m<1);
        }

    }
}
