public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3) {    //Yukarıdaki operasyon ile aynı isimde bir operasyon daha oluşturduk.['topla()' operasyonu] Fakat yukarıdaki operasyondan farklı olarak bu sefer girdi olarak 3 parametre(sayi) verdik. Bu yaptığımız işlemde bir hata yoktur ve operasyon sorunsuz çalışır. Çünkü operasyon isimleri aynı olmasına rağmen(her ikisi de 'topla()' operasyonu) aldıkları parametre sayısı farklıdır. Yukarıda oluşturduğumuz 'topla()' operasyonu 2 parametre(int sayi1, int sayi2) alırken bu satırda oluşturduğumuz 'topla()' operasyonu 3 parametre(int sayi1, int sayi2, int sayi3) alır. İşte bu şekilde operasyon ismi aynı olup(her ikisinin de adı 'topla()'dır.) farklı sayıda parametre alan metotlara 'method Overloading'(aşırı yüklenmiş metot) denir. Yani 'topla()' operasyonumuz aşırı yüklenmiş bir metotdur. NOT: 'method Overloading'de sıralama da önemlidir yukarıda yazılan 'topla(int sayi1, int sayi2)'de sırasıyla 2 tane 'int' türünde sayı istiyordu bu satırda yazdığımız 'topla(int sayi1, int sayi2, int sayi3)'de ise yine sırasıyla 'int' türünde bu sefer 3 tane sayı istiyordu. Yani sonuç olarak iki operasyon sırasıyla aynı türden(int) sayı istiyor. Eğer farklı bir sayı türünü parametre olarak verseydik(mesela 'double sayi3' deseydik) metot bu işlemi yapmamıza izin vermezdi. Yani sonuç olarak parametre olarak verdiğimiz sayı türlerinin aynı olması gereklidir.
        return sayi1+sayi2+sayi3;
    }



}
