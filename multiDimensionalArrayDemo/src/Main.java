public class Main {
    public static void main(String[] args) {
        //multidimensional array(çok boyutlu diziler)
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        //çift boyutlu dizileri matrix gibi düşünürsek içinde gezmek için 'nested for loop(iç içe geçmiş for loop)' kullanmamız gerekir. Yani 'iç içe geçmiş for loop' oluştururuz.
        for (int i=0; i<=2; i++) { //buradaki 'i', array'deki satır'ı belirtiyor.
            System.out.println("-------------------");
            for (int j=0; j<=2; j++){ //buradaki 'j' ise array'deki sütun'u belirtiyor.
                System.out.println(sehirler[i][j]);  //mesela 'sehirler[0][2]' demek '0. satırın 2. sütunu[yani 2. index'i(elemanı)'] demektir.
            }
        }
        //Çıktı alırken bölgeleri görmemiz için döngü içerisine '-------' işaretini ekleriz.
        //Not: İstersek dizinin boyutunu 'String[][][]' şeklinde yazarak arttırabiliriz böylece istediğimiz boyutta dizi oluşturabiliriz.

    }
}
