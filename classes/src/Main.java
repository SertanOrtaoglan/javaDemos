public class Main {                            //class'ların ilk ve temel özelliği gruplama yapmaktır.
    public static void main(String[] args) {
        /* İkinci ders ilk örnek- Bir nesne oluşturup(customerManager) operasyonları bu nesnemize uygulayalım;
        CustomerManager customerManager = new CustomerManager();    //class'lar 'reference type(referans tip)'dır. NOT: Bir class'ı kullanabilmek için o class'ın new'lenmiş olması gerekir.(Burada yaptığımız gibi)
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        */ //Çıktı olarak ekrana sırasıyla 'Müşteri eklendi', 'Müşteri silindi' ve 'Müşteri güncellendi' yazılarını verdi.


        /* İkinci ders ikinci örnek(ilk olarak bu şekilde yazdık)- Yeni bir nesne oluşturup referans eşitlemesi yaparsak;
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        */
        //Referans eşitlemesi yapıldıktan sonra soluklaşan ve gri olarak gösterilen CustomerManager customerManager = new CustomerManager();'ın sağ tarafındaki 'new CustomerManager()'ı silip kodumuzu tekrardan yazarsak;
        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        //Kodu çalıştırırsak çıktı olarak yine sırasıyla 'Müşteri eklendi', 'Müşteri silindi' ve 'Müşteri güncellendi' yazılarını alırız. Görüldüğü gibi hiçbir hata olmadan kodumuz çalışıyor. Sonuç olarak bu kısımda ilk yazdığımız 'customerManager'ı new'lememiş olsak bile daha sonradan altına tanımladığımız 'customerManager2'yi new'leyip ardından referansını 'customerManager'a eşitlememiz sayesinde(customerManager = customerManager2;) 'customerManager'a referans atamış oluruz. Böylelikle son kısımda yaptığımız gibi 'customerManager'ı yazıp operasyonları(Add,Remove,Update) nesnemize yani 'customerManager'a uygulayabiliriz. İstersek diğer nesnemize(customerManager2) de operasyonları(Add,Remove,Update) uygulayabiliriz yaparsak;
        customerManager2.Add();
        customerManager2.Remove();
        customerManager2.Update();
        //Görüldüğü gibi kodu çalıştırırsak yine aynı çıktıları bu sefer ikinci nesnemiz olan 'customerManager2' için alırız.

        //3.ders('değer' ve 'referans' tipleri anlamak)
        //value type(değer tipi) örneği
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);            //Kodu çalıştırırsak çıktı olarak '10' değerini alırız.

        //reference type(referans tipi) örneği
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;                  //Dikkat edersek burada referans eşitlemesi yaptığımız için bir üst satırda 'sayilar2'nin sağ tarafı yani 'new'in olduğu kısım gri oldu ve soluklaştı. Bu şu anlama gelir: "Artık 'sayilar2' değişkeni de 'sayilar1'in referansını tutuyor" demekir.
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);      //Kodu çalıştırırsak çıktı olarak '10' değerini alırız.


    }

}
