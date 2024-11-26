public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        /*
        String yeniMesaj = mesaj.substring(0,2);     //'substring()' operasyonu bir değeri 'return' eder.
        System.out.println(yeniMesaj);
        */

        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);

        //'Variable arguments' örneği
        int toplam = topla2(2,3,4,5,6,10);      //'topla2' fonksiyonuyla gönderdiğimiz sayıları program arka planda dizi(array)'ye çevirir.
        System.out.println(toplam);                     //Bir üst satırda 'topla2' fonksiyonuna yazdığımız sayıları(2,3,4,5,6,10) aşağıda olan 'topla2(int... sayilar)' operasyonumuza göndermiş olduk. Operasyon gerekli işlemleri yapıp 'toplam'ı bize return etti ve operasyon sonucu gelen 'toplam'ı burada bir 'int toplam' değişkeni oluşturup ona atadık. Daha sonra bu 'int toplam' değişkenini ekrana yazdırdık böylece gönderdiğimiz sayıların toplamını almış olduk.(30) NOT: 'topla2' operasyonunda tanımlı olan 'toplam' değişkeni ile main'de yani burada tanımladığımız 'toplam' değişkeninin bir alakası yoktur. İkisi farklı işlemler yapar. Karıştırmayalım!
                                                        //NOT: 'topla2()' operasyonunu bu şekilde yani boş olarak gönderseydik sonucu yani 'toplam'ı, '0' olarak ekrana yazdırırdı. Çünkü hiçbir integer değer girmedik ve aşağıda olan 'topla2()' operasyonu hiçbir int değer girmediğimiz için for döngüsüne giremeden direkt olarak 'toplam'ı 0 olarak return etti.(Çünkü operasyonun başında 'int toplam = 0' demiştik) Ve main'de tanımladığımız 'toplam' değişkeni 'topla2()' operasyonundan gelen 0 değerini ekrana yazdırdı.
    }

    public static void ekle() {                      //'void' fonksiyonu herhangi bir değeri 'return' etmez. 'void' olan operasyonları bir değişkene atayamayız!
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }


    public static int topla(int sayi1, int sayi2) {       //Bu fonksiyon 'integer' türünde bir değer 'return' eder yani döndürür.
        return sayi1+sayi2;
    }


    public static String sehirVer() {
        return "Ankara";
    }


    //'Variable arguments' ile çalışmak

    public static int topla2(int... sayilar) {         //'Variable arguments' demek fonksiyona ne kadar istiyorsak o kadar parametre(argüman) göndermek demektir. Mesela bu örneğimiz için 'topla2()' fonksiyonuna birden fazla integer göndereceğim demek istiyorsak parantez içerisine '(int...)' yazarız. Yani göndermek istediğimiz türü belirtip ardından üç nokta(...) koyarız. Böylece fonksiyona 'bir veya birden fazla 'int' türünde sayı göndereceğim' demiş olduk.
        int toplam = 0;                                //Bize bu fonksiyon ile gönderilen 'sayilar' main'de yazdığımız gibi ayrı ayrı gönderiliyor(2,3,4,5,6,10) ama java arka planda bu gönderilen sayıları 'int[] array'e dönüştürüyor. Sonuç olarak bir for döngüsüyle bu array içerisinde gezebiliriz. Ve gönderilen 'sayilar'ı toplayıp sonucu burada yaptığımız gibi return ettirebiliriz.
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }


}

