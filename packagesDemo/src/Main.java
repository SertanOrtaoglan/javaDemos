import matematik.DortIslem;  //IDE'miz otomatik olarak ekledi eğer bunu silersek 'DortIslem' class'ını burada kullanamayız!
import matematik.Logaritma;  //Aşağıda 'Logaritma' class'ını new'leyince burada IDE'miz otomatik olarak 'Logaritma' class'ını import ediyor.('matematik' paketi içerisinde oluşturduğumuz 'Logaritma' class'ını)
//import matematik.*;        //'matematik' paketi içerisindeki tüm her şeyi import etmiş oluruz.

import java.util.Scanner;    //başka bir paketi kullanma örneği('built-in' paketleri)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     //burada 'Scanner' class'ını oluşturduk.

        System.out.println("Adınız:");

        String isim = scanner.nextLine();             //burada kullanıcıdan girdi alırız.

        System.out.println("Merhaba "+isim);



        //2.ders(kendi paketlerimizi oluşturmak)
        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);


        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();

        //NOT: Biz yukarıda 'matematik' paketi içerisindeki 'DortIslem' ve 'Logaritma' class'larını ayrı ayrı new'lediğimiz için IDE'mizde en tepede import etme işlemini 'import matematik.DortIslem;' ve 'import matematik.Logaritma;' olacak şekilde ikisini ayrı ayrı otomatik olarak import etti. Bunun yerine(yani ikisini ayrı ayrı import etmek yerine) 'import matematik.*;' yazıp 'matematik' paketi içerisindeki her şeyi(class,interface vb. ne varsa) import edebiliriz. Böylelikle paket içerisindeki her şeyi(mesela paket içindeki class veya class'ları) teker teker new'leyip import etmemize gerek kalmaz tek bir yazımla yani '*' kullanarak paket içerisindeki her şeyi import edebiliriz.

    }
}



