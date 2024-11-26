public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        //Yukarıdaki örneğin aynısını array kullanarak yapalım.

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4] = "Ali"; (array'i 4 elemanlı tanımladığımız için fazladan eleman yazıp kodu bu şekilde çalıştırırsak buradaki eleman 5. eleman(fazla eleman) olduğundan bize 'ArrayIndexOutOfBoundsException(Dizi index'i sınırların dışında hatası)' hata mesajını fırlatır.

        for (int i=0; i<ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------------");

        //yukarıda yaptığımız 'for' döngüsünü aynen şu şekilde de yapabiliriz;

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        //Bu döngüye 'foreach' döngüsü denir. Yukarıdaki 'for' döngüsünden farkı yoktur. Bu 'foreach' döngüsünü daha çok kullanırız.



    }
}

