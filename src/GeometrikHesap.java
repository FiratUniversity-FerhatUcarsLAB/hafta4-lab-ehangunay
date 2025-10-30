/*
 * Ad Soyad: [Emirhan GÜNAY]
 * Ogrenci No: [250541013]
 * Tarih: [30.10.2025]
 * Aciklama: Görev 2: Geometrik Hesaplayıcı
 */

// import komutu HER ZAMAN sınıf tanımının DIŞINDA ve ÜSTÜNDE olmalıdır.
import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {

        // 1. Sabit Tanımlama (ZORUNLU)
        // PI değeri değişmeyeceği için 'final' olarak tanımlanır.
        final double PI = 3.14159;

        // 2. Scanner nesnesini kur
        Scanner input = new Scanner(System.in);

        // 3. Başlığı yazdır ve kullanıcıdan yarıçapı al
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double yaricap = input.nextDouble();

        // 4. Hesaplamaları yap
        // Math.pow(taban, us) -> Üs almak için kullanılır (pow = power)
        // Örn: Math.pow(yaricap, 2) -> yarıçapın 2. kuvveti (r^2)

        double daireAlan = PI * Math.pow(yaricap, 2);
        double daireCevre = 2 * PI * yaricap;
        double daireCap = 2 * yaricap;

        // Integer division hatasından kaçınmak (4/3=1) için 4.0/3.0 (ZORUNLU)
        double kureHacim = (4.0 / 3.0) * PI * Math.pow(yaricap, 3);
        double kureYuzeyAlan = 4 * PI * Math.pow(yaricap, 2);


        // 5. Sonuçları formatlı olarak yazdır (printf ve %.2f ZORUNLU)
        // %.2f -> sayıyı 2 ondalık basamakla göster
        // \n -> yeni satıra geç
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani : %.2f cm^2\n", daireAlan);
        System.out.printf("Daire Cevresi : %.2f cm\n", daireCevre);
        System.out.printf("Daire Capi : %.2f cm\n", daireCap);
        System.out.printf("Kure Hacmi : %.2f cm^3\n", kureHacim);
        System.out.printf("Kure Yuzey Alani : %.2f cm^2\n", kureYuzeyAlan);

        // 6. Scanner'ı kapat
        input.close();
    }
}