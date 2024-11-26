import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        int[] sayilar = new int[]{1,2,3};
        sayilar = new int[4];
        System.out.println(sayilar[0]);
        */

        //'ArrayList'in temel kullanımı
        ArrayList sayilar = new ArrayList();
        //System.out.println(sayilar.size());    //Çıktı olarak '0' verir. Çünkü ArrayList'i oluşturduk ancak henüz içerisine bir eleman eklemediğimiz için ArrayList'in boyutu '0'dır.
        //ArrayList'e eleman ekleme
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());      //Çıktı olarak '3' verir. Çünkü ArrayList'e 3 eleman eklediğimiz için ArrayList'in boyutu '3'tür.

        /* (ArrayList'te 'get()' operasyonu)
        System.out.println(sayilar.get(2));      //'Ankara'yı çıktı olarak verir. Çünkü oluşturduğumuz 'ArrayList'in 3.elemanı(2.index) 'Ankara'dır.
        System.out.println(sayilar.get(0));      //'1'i çıktı olarak verir. Çünkü oluşturduğumuz ArrayList'e eklediğimiz ilk eleman(0.index) '1'dir.
        */

        /* (ArrayList'te 'set()' operasyonu)
        sayilar.set(0,100);
        System.out.println(sayilar.get(0));      //Çıktı olarak '100'ü ekrana yazdırır. Yani başta ArrayList'in ilk elemanı(0.index) olarak tanımladığımız '1' değeri artık '100' oldu.
        sayilar.set(2,50);
        System.out.println(sayilar.get(2));      //Çıktı olarak '50'yi ekrana yazdırır. Yani başta ArrayList'in 3.elemanı(2.index) olarak tanımladığımız "Ankara" değeri artık '50' oldu.
        */

        /* (ArrayList'te 'remove()' operasyonu)
        sayilar.remove(0);
        System.out.println(sayilar.get(1));      //Çıktı olarak 'Ankara'yı alırız.
        sayilar.remove(1);
        System.out.println(sayilar.get(1));      //Çıktı olarak 'Ankara'yı alırız.
        */

        /* (ArrayList'te 'clear()' operasyonu)
        sayilar.clear();
        System.out.println(sayilar);             //Çıktı olarak '[]' yani içi boş bir parantez alırız. Çünkü 'clear()' operasyonu ArrayList içerisindeki tüm elemanları silmeye yarar.
        */

        //ArrayList'te for-each döngüsü kullanımı
        for (Object i : sayilar){                //Tür olarak 'Object' yazarız. (ArrayList içerisine String,Integer vb. türler eklenebildiği için tür 'Object' olarak yazılır.)
            System.out.println(i);
        }


    }
}


