import java.util.Scanner;    //kullanıcıdan veri alabilmek için bu kütüphaneyi çağırdık.

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Uzun Kenar Bilgisini Giriniz: ");  //kullanıcıdan uzun kenar istendiğine dair ekrana bilgi verilir.
        int uzun_kenar= s.nextInt();     //kullanıcıdan girdi alınır.
        System.out.print("Kisa Kenar Bilgisini Giriniz: ");   //kullanıcıdan kısa kenar istendiğine dair ekrana bilgi verilir.
        int kisa_kenar= s.nextInt();  //kullanıcıdan girdi alınır

        dikdortgen1(kisa_kenar,uzun_kenar);
        System.out.println("\n");   //çıkan iki dikdörtgeni ayırmak için arasında boşluk bırakıyoruz.
        System.out.println("\n");   //çıkan iki dikdörtgeni ayırmak için arasında boşluk bırakıyoruz.
        dikdortgen2(kisa_kenar,uzun_kenar);

    }
    public static void dikdortgen1(int kisa, int uzun){    //dikdörtgen isminde method oluşturduk.

        for (int f=1; f<=uzun; f++) {
            System.out.print("* ");   //satır genişliği kadar yan yana * karakteri yazdırıyor.
        }
        System.out.println("");   //satır sonu bir satır aşağı geç


        for (int o=1; o<=kisa-2; o++){   //satır yüksekliği-2 kere bu işlemi tekrarlıyor.
            System.out.print("* ");


            for (int f=1; f<=uzun-2; f++) {
                System.out.print("  ");    //satır genişliği-2 tane yan yana boşluk karakteri yazdırıyor.
            }
            System.out.println("*");    //satır sonundaki yıldızı ekle ve bir satır aşağı geçiyor.
        }

        for (int f=1; f<=uzun; f++) {
            System.out.print("* ");    //satır genişliği kadar yan yana * karakterini yazdırıyor.
        }
    }

    public static void dikdortgen2(int kisa, int uzun){      //dikdörtgen2 isminde method oluşturuyoruz.

        for (int f=1; f<=uzun; f++) {
            System.out.print("* ");    //satır genişliği kadar yan yana * karakteri yazdırıyoruz.
        }
        System.out.println("");    //satır sonu bir satır aşağı geçmesi için yazdırıyoruz.


        for (int o=1; o<=kisa-2; o++){    //satır yüksekliği-2 kere bu işlemi tekrarlıyor.
            System.out.print("* ");
            for (int f=1; f<=uzun-2; f++) {
                System.out.print("* ");    //satır genişliği-2 tane yan yana boşluk karakteri yazdır
            }
            System.out.println("*");   //satır sonundaki yıldızı ekle ve bir satır aşağı geçiyor.
        }

        for (int f=1; f<=uzun; f++) {
            System.out.print("* ");    //satır genişliği kadar yan yana o karakteri yazdırıyoruz.
        }
    }
}
