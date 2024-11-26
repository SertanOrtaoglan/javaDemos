public class Main {
    public static void main(String[] args) {
        /* 'try-catch' bloğu örneği(kendi hata mesajımızı yazdırmak)
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (Exception exception){
            System.out.println("Hata oluştu");      //Çıktı olarak "Hata oluştu" yazısı ekrana yazdırılır.
        }
        */

        /* 'try-catch' bloğu örneği(sistemin hata mesajını yazdırmak)
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (Exception exception){
            System.out.println(exception);          //Çıktı olarak IDE'nin verdiği hata mesajı olan "ArrayIndexOutOfBoundsException" ekrana yazdırılır.
        }
        */


        /*
        //'finally' bloğu örneği
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");     //Örneğimize göre çıktı olarak hem 'catch' bloğunun çıktısı olan "ArrayIndexOutOfBoundsException" ekrana yazdırılır.(yani IDE'nin verdiği hata mesajı) Hem de 'finally' bloğunun çıktısı olan "Ben her türlü çalışırım" ekrana yazdırılır. NOT: İster 'try' bloğu çalışsın ister 'catch' bloğu(ikisinden biri kesin çalışacak) farketmez sonuç olarak 'finally' bloğu her türlü çalışacaktır.
        }                                                      //Bu örneğimizde 'catch' ve 'finally' blokları çalıştı. Örneğimizi 'try' bloğu çalışacak şekilde yazarsak;
        */

        /*
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[2]);
        }catch (Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");     //Bu sefer 'try' ve 'finally' blokları çalışacaktır çünkü kodumuzda herhangi bir hata yoktur. Özetlersek; 'try' veya 'catch' bloğundan hangisi çalışırsa çalışsın 'finally' bloğu bunlara bakmaksızın her türlü çalışır ve çıktısını verir.
        }
        */


        //İKİNCİ DERS(Demo-Exception Hiyerarşisi)
        /*
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");
        }
        */


        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("Loglandı : "+exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");
        }


    }
}



