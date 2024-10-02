package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {

    public static void main(String[] args) {
        //4-Car class'indan object uretelim


        Car c1 = new Car("Toyata", "3.20", 2022, false);
        System.out.println(c1.brand);//Honda
        System.out.println(c1.model);//Accord
        System.out.println(c1.year);//2023
        System.out.println(c1.hybrid);//true

        c1.action();//Honda hizli hareket eder //Toyota hizli hareket eder
        c1.stop();//Honda guvenli bir sekilde durur //Toyota guvenli bir sekilde durur

        //5- Car class’a donup, constructor olusturalim

//10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car c2 = new Car("Nissan", "Qashqai", 2021, true);
        System.out.println(c2.brand);//Nissan
        System.out.println(c2.model);//Qashqai
        System.out.println(c2.year);//2021
        System.out.println(c2.hybrid);//true

        c2.action();//Nissan hizli hareket eder
        c2.stop();//Nissan guvenli bir sekilde durur

       //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
   //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.
        //16- Yeni bir object uretelim
        Car c3 = new Car("Audi", "A4");
        System.out.println(c3);//d16methodcreation_overloading_varargs_passbyvalue.Car@1b6d3586

    }
}
