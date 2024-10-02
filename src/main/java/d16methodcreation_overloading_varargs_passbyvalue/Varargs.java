package d16methodcreation_overloading_varargs_passbyvalue;

import static d16methodcreation_overloading_varargs_passbyvalue.MethodOverloading01.add;

public class Varargs {
    public static void main(String[] args) {
        //Variable arguments - Değişken sayida argümanlar

        int result=add(3,7,10);

    }//main dışı

//    public static int add1(int a, int b) {
//        return a + b;
//    }
//    public static int add2(int a, int b, int c) {
//        return a + b+ c;
//    }

    public static int add3(int... a) {//3 nokta varargs kullanımıdır. Varargs kullanımında parametre sayısı değişebilir.
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }

    /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

Varargs, aşağıdaki kurallara tabidir:

1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
2- Varargs arka planda Array yapisini kullanir
3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
5- Varargs parametre, sıfır argüman alabilir. main ici add(); olabilir*/

}
