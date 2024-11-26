import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        //sehirler.remove(1);              //Bir alt satırda yazdığımız 'remove()' kullanımı ile bu satırda yazdığımız 'remove()' kullanımı arasında bir fark yoktur. İkisi de aynı işlemi gerçekleştirir ve 1.index'te yer alan "İstanbul"u listeden siler.
        sehirler.remove("İstanbul");

        //sehirler.sort();                 //'sort()' operasyonu ArrayList içindeki elemanları sıralamaya yarar. Fakat bu şekilde yani 'sehirler.sort()' olacak şekilde bir kullanım yapmak yerine bir alt satırda yaptığımız kullanım olan 'Collections.sort(sehirler)' kullanımı daha yaygın olarak yapılır.(NOT: 'Collections' olarak java.util'den Class olanı seçeriz.)
        Collections.sort(sehirler);

        for (String sehir : sehirler){     //Bu sefer oluşturduğumuz ArrayList'in türü belli olduğu için(String) buradaki for-each döngümüzde de 'String' türünü kullanırız.
            System.out.println(sehir);
        }


    }
}



