public class Main {
    public static void main(String[] args) {

        //'for' loop
        for (int i=2; i<10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");


        //'while' loop
        int i = 1;
        while (i<10) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("While Döngüsü Bitti");


        //'do-while' loop
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        } while (j<10) ;

        System.out.println("Do-While Döngüsü Bitti");

        //'do-while' döngüsünün 'while' döngüsünden farkı şudur; while'da koşul sağlanmıyorsa döngü içine girmeden işleme devam eder yani ekrana bir çıktı yazdırmaz ancak do-while'da koşul sağlanmıyorsa bile en az bir kez 'do' bloğu çalışır ve ekrana bir çıktı yazdırır.

    }
}

