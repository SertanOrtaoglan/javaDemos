public class Main {
    public static void main(String[] args) {
        //Mükemmel sayı bulma

        //Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılara 'mükemmel sayı' denir.
        //Örnek verirsek '6' sayısı mükemmel sayıdır. Çünkü 6’nın pozitif bölenleri 1,2,3 ve 6’dır. Kendisi hariç(6) diğer bölenlerini toplarsak 1+2+3=6 eder.
        //Başka örnek verirsek mesela '28' de mükemmel sayıdır. Çünkü 28’in pozitif bölenleri 1,2,4,7,14 ve 28’dir. Kendisi hariç(28) diğer bölenlerini toplarsak 1+2+4+7+14=28 eder.

        int number = 28;
        int total = 0;

        for (int i=1; i<number; i++) {
            if (number % i == 0){
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}

