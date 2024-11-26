import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        //System.out.println(sozluk);                 //{computer=bilgisayar, book=kitap, table=masa} şeklinde çıktı alırız.

        //System.out.println(sozluk.get("table"));    //'masa' çıktısını alırız. ['get()' operasyonu anahtarın("table") değerini("masa") çıktı olarak verir.]

        /*
        sozluk.remove("table");
        System.out.println(sozluk.get("table"));      //'null' çıktısını alırız. 'null' karşılığının olmaması anlamına gelir.(Yani referansının olmaması demektir.)
        */

        /*
        sozluk.clear();
        System.out.println(sozluk.get("table"));      //'sozluk' içerisindeki tüm her şeyi(anahtar,değer) sildiğimiz için yine çıktı olarak 'null' alırız.
        */

        //System.out.println(sozluk.size());          //Çıktı olarak '3'ü alırız. Yani HashMap içerisinde kaç tane eleman varsa onun sayısını çıktı olarak alırız. 'anahtar,değer(key,value)' olacak şekilde 3 tane eleman vardır.


        /* Sözlükteki tüm elemanları tek tek dolaşmak istersek;(sadece 'anahtarlar' için)
        for (String item : sozluk.keySet()) {
            System.out.println(item);    //Çıktı olarak 'computer,book,table'ı alt alta olacak şekilde ekranda görürüz. Döngümüzde 'sozluk.keySet()' dediğimiz için sadece 'anahtarları' ekrana yazdırmış olduk.
        }
        */

        /* Sözlükteki tüm elemanları tek tek dolaşmak istersek;(sadece 'değerler' için)
        for (String item : sozluk.values()) {
            System.out.println(item);    //Çıktı olarak 'bilgisayar,kitap,masa'yı alt alta olacak şekilde ekranda görürüz. Döngümüzde 'sozluk.values()' dediğimiz için sadece 'değerleri' ekrana yazdırmış olduk.
        }
        */

        // Sözlükteki tüm elemanları tek tek dolaşmak istersek;('anahtar,değer' olarak)
        for (String item : sozluk.keySet()) {
            System.out.println("Anahtar:"+item + " Değer:"+sozluk.get(item));   //Burada 'item' bize anahtarları verir. 'sozluk.get(item)' ise klasik 'get()' operasyonu olduğu için bize 'item'ların(anahtarların) 'değerlerini' çıktı olarak verir.
        }


    }
}




