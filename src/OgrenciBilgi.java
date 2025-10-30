/*
 * Ad Soyad: [Emirhan Günay]
 * Ogrenci No: [250541013]
 * Tarih: [30.10.2025]
 * Aciklama: Görev 1: Öğrenci Bilgi Sistemi
 */

import java.util.Scanner; // Kullanıcıdan veri almak için GEREKLİ

public class OgrenciBilgi {
    public static void main(String[] args) {

        // 1. Scanner nesnesini kur: Klavye girişlerini okumak için.
        Scanner input = new Scanner(System.in);

        // 2. Başlığı yazdır
        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // 3. Kullanıcıdan bilgileri sırayla al
        // Değişken isimleri anlamlı olmalı (ad, soyad, ogrenciNo vb.)
        System.out.print("Adinizi girin: ");
        String ad = input.next(); // String (metin) almak için .next()

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt(); // int (tam sayı) almak için .nextInt()

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble(); // double (ondalıklı sayı) almak için .nextDouble()

        // 4. Başarı durumunu belirle (Operatör kullanımı)
        // Örnekte statik olarak "Basarili Ogrenci" yazılmış,
        // ama biz bir mantık kuralı ekleyerek daha doğru bir program yapalım.
        String durum;
        if (gpa >= 2.00) {
            durum = "Basarili Ogrenci";
        } else {
            durum = "Basarisiz Ogrenci";
        }

        // 5. Alınan bilgileri formatlı olarak ekrana yazdır
        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        // printf() kullanımı (ZORUNLU)
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", ogrenciNo);
        System.out.printf("Yas: %d\n", yas);

        // GPA için %.2f kullanımı (ZORUNLU)
        // %.2f -> "Sayıyı virgülden sonra 2 basamak göster" demektir.
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.printf("Durum: %s\n", durum);

        // 6. Scanner'ı kapatmak iyi bir alışkanlıktır.
        input.close();
    }
}