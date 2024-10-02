package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        int result1 = multiply(3, 5);
        System.out.println(result1);//15

        int result2 = firstTwoMultiplyThirdAdd(4, 4, 2);
        System.out.println(result2);//18

        printWord("Java");

    }//main dışı

//ornek 1: Iki sayiyi carpan bir method olusturunuz.
//example 1: Create a method that multiplies two numbers.
    //protected: Bu class’tan erisilebilir.
//Bir de sadece miras alinan class’lardan erisilebilir(extends)

    protected  static int multiply(int a, int b) {
        return a * b;
    }

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return multiply(a, b) + c;
    }
    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
//example 3: Create a method that prints an entered word to the console (void, no return)

    public static void printWord(String word) {
        System.out.println(word);
    }



}
