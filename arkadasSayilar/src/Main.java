public class Main {
    public static void main(String[] args) {
        //Arkadaş sayı bulma

        //İki sayı birbirinin kendisi hariç pozitif bölenleri toplamına eşitse bu sayılara 'arkadaş sayılar' denir.

        //En küçük arkadaş sayı çifti 200 ve 284’tür. Bu iki sayı arkadaş sayıdır çünkü 220’nin kendisi hariç pozitif bölenlerinin toplamı 284’e, 284’ün kendisi hariç pozitif bölenlerinin toplamı 220’ye eşittir. Gösterirsek;
        //220’nin kendisi hariç pozitif bölenlerinin toplamı : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        //284’ün kendisi hariç pozitif bölenlerinin toplamı : 1 + 2 + 4 + 71 + 142 = 220
        //Sonuç olarak bu iki sayı yani 220 ve 284 arkadaş sayılardır.

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i=1; i<sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for (int i=1; i<sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }

        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("bu iki sayı arkadaştır");
        } else {
            System.out.println("bu iki sayı arkadaş değildir");
        }
    }
}


