package d6if_switch;

public class Switch03 {
    public static void main(String[] args) {

      /*Yeni switch ifadesi, daha esnek ve güçlü bir yapı sunarak, geleneksel switch-case
yapısının daha temiz ve ifade edilebilir hale getirilmesini sağlar.

Ayrıca, daha önceki switch yapısı değer döndürmezken, yeni switch ifadesi bir değer döndürebilir
 ve bu değer doğrudan bir değişkene atanabilir.

Yeni switch ifadesinin ana özellikleri:

Case değerleri: Birden fazla case ifadesini tek bir işlemle birleştirme imkanı.
Arrow (->) Operatörü: Geleneksel break yerine kullanılarak, kodun daha okunabilir olmasını sağlar.*/

        int gun = 3;
        String gunAdi = switch (gun) {
            case 1 -> "Pazartesi";
            case 2 -> "Salı";
            case 3 -> "Çarşamba";
            case 4 -> "Perşembe";
            case 5 -> "Cuma";
            case 6 -> "Cumartesi";
            case 7 -> "Pazar";
            default -> "Geçersiz gün";
        };
        System.out.println(gunAdi);

    }
}
