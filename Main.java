import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, turkce, fizik, kimya, tarih, muzik;

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        float toplam = (mat + turkce + fizik + kimya + muzik + tarih);
        double sonuc = toplam / 6;

        String durum = sonuc >= 60 ? "Tebrikler! Sınıfı geçtiniz" : "Üzgünüm, sınıfta kaldınız";
        System.out.println(durum);
    }
}