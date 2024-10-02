package d17constructors_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {
        //LocalDate java.time paketinde yer alan bir classtir.
//Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
//Java'da java.time.LocalDate class'i, yerel tarihleri temsil etmek için kullanılır
// ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.

//---------------
//ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır,
// yani sizin bilgisayarınızın saatinden gelir.
        LocalDate tarih = LocalDate.now();
        System.out.println("şu anki tarih: " + tarih);

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
//getMonth(): Bu metod ayı dondurur. (Month enum türünde)
//Java’da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
//Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi
        int ay = tarih.getMonthValue();
        System.out.println("şu anki ay: " + ay);//10

       Month month= tarih.getMonth();
        System.out.println("şu anki ay: " + month);//OCTOBER

        //ornek 3: getYear(): Tarihin yılını alır.
        int yil = tarih.getYear();
        System.out.println("şu anki yıl: " + yil);//2024
        System.out.println(tarih.getDayOfYear());//276

        //ornek 4:getDayOfMonth(): Ayin gününü alır.
        int gun = tarih.getDayOfMonth();
        System.out.println("şu anki gün: " + gun);//2

        DayOfWeek day2 = tarih.getDayOfWeek();
        System.out.println("şu anki gün: " + day2);//WEDNESDAY (Enum)

        //ornek 5:
//ileriki tarihe nasil gidilir?
//plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.

        LocalDate tarih2 = tarih.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println("1 yıl 2 ay 4 gün sonrası: " + tarih2);//2025-12-06

      /*ornek 6:Gecmis tarihe nasil gidilir?
minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/

        System.out.println(tarih.minusYears(1).minusMonths(3).minusDays(1));


//ornek 7: Specific bir tarih objesi nasil olusturulur?
//of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.
        LocalDate tarih3=LocalDate.of(1984, 8, 3);
        System.out.println("tarih3: " + tarih3);//1984-08-03
        LocalDate tarih4=LocalDate.of(2020, Month.AUGUST, 3);

        boolean t1= tarih3.isAfter(tarih4);
        System.out.println(t1);//false
        boolean t2= tarih3.isBefore(tarih4);
        System.out.println(t2);//true





















    }
}
