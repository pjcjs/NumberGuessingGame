package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
//Example 1: From a list with repeated elements, obtain a list with non-repeated elements.
//      [J, a, v, a, v] ==> [J, a, v]

        //Bir interface, bir class'a nasıl davranması gerektiğini tanımlayan bir sözleşmedir.
// Bir class, bir interface'i implement ettiğinde, interface'deki tüm yöntemleri implement etmelidir.

//List'i kullanmak, kodunuzun daha esnek ve uyumlu olmasını sağlar.
//List tipinde bir değişken tanımladığınızda, bu değişkenin farklı List implementasyonlarını
// (örneğin ArrayList, LinkedList, Vector vb.) tutabilmesi mümkündür.


        List<Character> list = new ArrayList<>();
        list.add('J');
        list.add('a');
        list.add('v');
        list.add('a');
        list.add('v');
        System.out.println(list);//[J, a, v, a, v]

        List<Character> list2= new ArrayList<>();
        for(Character w: list){
            if(!list2.contains(w)){
                list2.add(w);
            }
        }
        System.out.println(list2);//[J, a, v]





    }



    }


