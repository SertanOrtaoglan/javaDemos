public class Main {
    public static void main(String[] args) {
        //Metotlar(fonksiyonlar)

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {            //Java'da metot isimleri 'camelCase' yöntemiyle yazılır.
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayı mevcuttur: "+aranacak);     //'mesajVer()' fonksiyonu tek bir string parametresi alır. Yani içine yazdığımız ("Sayı mevcuttur: "+aranacak) ifadesi string bir ifadedir.(String'ler bu şekilde toplanabilirdi unutma!)
        } else {
            mesajVer("Sayı mevcut değildir: "+aranacak);
        }
    }

    public static void mesajVer(String mesaj) {   //Yukarıda son blokta 'if (varMi)' koşulu altında mesajVer("Sayı mevcuttur: "+aranacak); şeklinde bir mesaj oluşturduk. Sonuç olarak yukarıda oluşturduğumuz mesajı burayı gönderdik daha sonra 'mesajVer()' fonksiyonunu burada oluşturup oradan gelen mesajın(string türdeki) burada ekrana yazdırılmasını sağladık. Özetlersek ekrana yazdırma işlemini de farklı bir fonksiyon kullanarak yapmış olduk.
        System.out.println(mesaj);
    }
}

//NOT!!!
//Yukarıda 'if(varMi)' kısmında yaptığımız işlem aslında şudur;
/*
String mesaj = "";
if (varMi) {
     mesaj = "Sayı mevcuttur: " +aranacak;
     mesajVer(mesaj);
} else {
     mesaj = "Sayı mevcut değildir: "+aranacak;
     mesajVer(mesaj);
}
*/
//Yani yukarıda yaptığımız işlem ile buradaki işlem arasında hiçbir fark yoktur. Burada yazdığımız yol biraz daha uzun bir yoldur. Yukarıda yaptığımız ise biraz daha kısaltarak yazılmış yoldur.

