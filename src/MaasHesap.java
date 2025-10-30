/*
 * Ad Soyad: [Emirhan GÜNAY]
 * Ogrenci No: [250541013]
 * Tarih: [30.10.2025]
 * Aciklama: Görev 3: Maaş Hesaplama Sistemi
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        // 1. Sabit Tanımlamaları (Önemli Noktalar - ZORUNLU)
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Hesaplamalar için diğer sabitler (Okunabilirlik için)
        final int MESAI_BOLEN = 160;
        final double MESAI_KATSAYI = 1.5;
        final int AYLIK_CALISMA_SAATI = 176;
        final int AYLIK_CALISMA_GUNU = 22;

        // 2. Scanner nesnesini kur
        Scanner input = new Scanner(System.in);

        // 3. Kullanıcıdan Bilgileri Al (Görev 3 - Alınacak Bilgiler)
        System.out.println("=== MAAŞ HESAPLAMA SISTEMI ===");

        // Önce 'nextLine()' alarak 'Scanner Bug' sorununu yaşamıyoruz.
        System.out.print("Calisan adi soyadi girin: ");
        String adSoyad = input.nextLine(); // "Ayse Demir" gibi boşluklu metin almak için nextLine()

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt(); // Bu bilgi hesaplamalarda istenmiyor, ama girişte isteniyor.

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        // 4. Hesaplamaları Yap (Görev 3 - Hesaplamalar)

        // 4.1. Gelirler
        double mesaiUcreti = (brutMaas / MESAI_BOLEN) * mesaiSaati * MESAI_KATSAYI;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 4.2. Kesintiler
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisiKesintisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisiKesintisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisiKesintisi + damgaVergisiKesintisi;

        // 4.3. Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 5. İstatistikleri Hesapla (Görev 3 - İstatistikler)
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / AYLIK_CALISMA_SAATI;
        double gunlukNetKazanc = netMaas / AYLIK_CALISMA_GUNU;


        // 6. Çıktıyı Formatlı Yazdır (Görev 3 - Örnek Çıktı)
        // Para birimleri için %.2f (2 ondalık), yüzdeler için %.1f (1 ondalık)

        System.out.println("\n====================================");
        System.out.println("           MAAS BORDROSU");
        System.out.println("====================================");

        System.out.printf("Calisan: %s\n", adSoyad);

        System.out.println("\nGELIRLER:");
        System.out.printf("Brut Maas : %.2f TL\n", brutMaas);
        // Mesai saatini (%d) dinamik olarak ekrana yazdıralım
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR : %.2f TL\n", toplamGelir);

        System.out.println("\nKESINTILER:");
        // Örnek çıktıdaki gibi yüzdeleri (%.1f%%) gösterelim
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL\n", (SGK_ORANI * 100), sgkKesintisi);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL\n", (GELIR_VERGISI_ORANI * 100), gelirVergisiKesintisi);
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL\n", (DAMGA_VERGISI_ORANI * 100), damgaVergisiKesintisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI : %.2f TL\n", toplamKesinti);

        System.out.printf("\nNET MAAS : %.2f TL\n", netMaas);
        System.out.println("====================================");

        // İstatistikler slaytını (12/22) da yazdıralım
        System.out.println("\nISTATISTIKLER:");
        System.out.println("------------------------");
        System.out.printf("Kesinti Orani : %.1f%%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc : %.2f TL\n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc : %.2f TL\n", gunlukNetKazanc);
        System.out.println("====================================");

        // 7. Scanner'ı kapat
        input.close();
    }
}