public class Main {
    public static void main(String[] args) {
        /* (NOT)
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        */
        //Sayının asal olup olmadığını bulma
        int number = 25;
        boolean isPrime = true;          //ilk olarak sayımızın asal olduğunu varsayalım bu yüzden 'true' dedik.(Asal sayı şudur: 1 ve kendisinden başka tam sayı böleni olmayan sayıya asal sayı denir.)

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı");
            return;
        }


        for (int i=2; i<number; i++) {   //Bir 'for' döngüsü oluşturduk ve i değerini 2 ile başlattık. Ardından 'i<number' diyip 'i++' yazdık. Yani 2'den başlayıp sayının değeri kaç ise o değere kadar(sayının kendi değeri dahil değil) i'yi 1 arttırarak döngüye devam et demiş olduk.(Mesela number = 25 olsun diyelim, i = 2'den başlayıp i<number'a yani i = 24'e kadar sırasıyla i değerini 1 arttırarak döngüye devam edecektir. Sonuç olarak 2'den 24'e kadar bir döngü kurmuş olduk.) NOT: Burada döngüdeki i'yi 2'den başlatıp koşulda number'i dahil etmememizin sebebi(yani 'i<number' dememizin sebebi) asal sayı olma kuralının 1'e ve kendisine tam bölünmesi olduğu içindir. Yani 2'den başlayıp girilen sayının('number=25' diyelim) bir düşük değerine kadar olan sayılardan(2'den 24'e kadar 24'te dahil) birinin girilen number'ı(yani '25'i) tam bölmesi demek o sayının asal olmaması demektir.
            if (number % i == 0) {       //Burada ise 2'den 24'e kadar olan tüm sayıların(i), verilen number değeri olan 25'e tam bölünüp bölünmediğine bakacağız. Eğer herhangi bir sayı 25'i tam bölerse(yani 'number % i == 0'sa) o zaman 'girilen number sayısı asal değildir' diyeceğiz.(Çünkü asal sayı sadece 1'e ve kendisine tam bölünür başka hiçbir sayıya tam bölünmez.) Bunun için alt satıra geçip 'isPrime = false' deriz.
                isPrime = false;         //İlk başta sayıyı asal kabul edip 'true' demiştik yani number değeri sadece 1'e ve kendisine bölünüyor dedik fakat kontrol ettikten sonra number değerinin başka bir sayıya daha tam bölündüğünü tespit ettik dolayısıyla 'isPrime' değerini 'false' olarak değiştirmiş olduk. Çünkü ilk başta varsaydığımız asal sayı olma kuralını sağlamadı!
            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");   //Kodumuzu çalıştırırsak 'number = 25' için çıktıyı 'Sayı asal değildir' olarak alırız. Çünkü 25 sayısı asal değildir. Yani 1 ve kendisinden başka sayılara da tam bölünür.(Örneğin 5'e)
        }

        //NOT: number değerini 2 girersek('number = 2' şeklinde) bize çıktı olarak 'Sayı asaldır'ı verdiğini görürüz. Nedeni ise şudur: number değerini '2' girdiğimizi düşünelim buradan ilk olarak for döngümüze gelip bakarsak i değeri 2'den başlıyor(i = 2) ve koşul olarak 'i<number' demişiz yani i değerimiz ilk olarak 2'den başladığı için girilen number değeri en az '3' olmalıdır. Dolayısıyla bu durumda olduğu gibi 'number = 2' girersek for döngüsündeki koşulumuz 'i<number'(2<2) sağlanmadığı için(koşulun sağlanması için number en az '3' olmalı) bu for döngüsüne hiçbir zaman girmeyiz(number = 2) ve sonuç olarak for döngüsüne giremediğimiz için direkt olarak 'if(isPrime)' kod bloğu çalışır ve bize çıktı olarak 'Sayı asaldır'ı verir.(if bloğu çalışır çünkü ilk başta varsayılan olarak 'boolean isPrime = true;' demiştik yani for döngüsüne uğramadan aşağıya inersek 'if' ve 'else'den, varsaydığımız değer olan 'true'yu karşılayan koşul 'if' olduğu için 'if(isPrime)' kod bloğu çalışır ve çıktı olarak 'Sayı asaldır'ı ekrana yazdırır.)
        //NOT2: Bu örnekte istisna değer olarak 'number = 1' girilebilir. Eğer 'number = 1' girilirse aynı 'number = 2'de olduğu gibi for döngüsüne uğramayacağımız için ilk başta varsaydığımız durum yani 'true' için 'if(isPrime)' kod bloğu çalışır ve 'number = 1' için 'Asal sayıdır' çıktısını verir. Fakat bu YANLIŞTIR! Çünkü 1 sayısı asal bir sayı değildir. Bir sayısının sadece bölen kendisi olduğu için asal sayı kabul edilmemektedir. Dolayısıyla en küçük asal sayı 2 olarak kabul edilmektedir.
        //Sonuç olarak 'number = 1' girilirse kodumuzda bug oluşur. Çünkü kodumuz varsayılan olarak 'Sayı asaldır' çıktısı verecektir ve bu yanlıştır. Bunu düzeltmek için bir if bloğu oluşturup 'Sayı asal değildir' çıktısını verelim. Kodun en başına if koşulunu yazarak bu işlemi yapalım. Bu işlemi yaptıktan sonra 'number = 1' yazıp kodu çalıştırırsak bize hem 'Sayı asal değildir' hem de 'Sayı asaldır' çıktılarını verdiğini görürüz. Görüldüğü gibi hala bug vardır. Sebebi şudur: 'number = 1' için ilk başta yazdığımız if bloğunu çalıştırıp 'Sayı asal değildir' çıktısını verdi. Ardından aşağıdaki kod satırlarına devam edip for döngüsünü geçerek(çünkü 'number = 2'de olduğu gibi koşulu sağlamıyor) en son satırdaki 'if(isPrime)' koşulunu çalıştırdı(çünkü varsayılan olan değerimiz 'true' olduğu için) ve çıktı olarak 'Sayı asaldır'ı da vermiş oldu. Sonuç olarak hem 'Sayı asal değildir' hem de 'Sayı asaldır' çıktılarını ekrana yazdırdı. Bu durumu düzeltmek için ilk koşulumuz olan 'if(number == 1)' bloğuna 'return' kodunu eklememiz gerekir. Böylece eğer girilen sayı 1 ise(number == 1) aşağıdaki kod satırlarına uğramaksızın direkt olarak 'Sayı asal değildir' çıktısını ekrana döndürecektir.('return' ifadesi sayesinde bunu yaptırırız.)
        //Ayrıca girilen sayının negatif olma durumu vardır. Bu da istemediğimiz bir şey olduğu için bu durumu da bir if bloğu ile 'Geçersiz sayı' çıktısını vererek düzeltiriz. Örnek verip denersek 'number = -21' girdik diyelim. Kodu çalıştırırsak ekrana yine iki çıktı değeri 'Geçersiz sayı' ve 'Sayı asaldır'ı verdiğini görürüz. Bu durum yine 'if(number<1)' koşulunu çalıştırıp o kod bloğundan çıktıktan sonra alttaki kod satırlarını çalıştırmasından kaynaklanır. Yani 'if(number<1)' koşulunu çalıştırdı 'Geçersiz sayı' yazdırdı ardından for döngüsüne geldi koşulu sağlamadığı için for döngüsüne girmeden direkt olarak alt satıra indi ve alt satırdaki varsayılan durum olan 'if(isPrime)' koşulunu da çalıştırıp ekrana ayrıyetten 'Sayı asaldır'ı da yazdırdı. Bu durumu düzeltmek için yine 'return' komutunu kullanırız. Ve yukarıda 'if(number<1)' koşulunun olduğu kod bloğu içerisine 'return' ifadesini ekleriz. Böylelikle girilen sayı eğer 1'den küçük bir değerse yani negatifse bize sadece 'Geçersiz sayı' çıktısını vermesini sağlarız.(Altta bulunan for döngüsüne ve diğer kod satırlarına uğramasını engellemiş oluruz.)

    }
}

