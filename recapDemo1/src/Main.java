public class Main {
    public static void main(String[] args) {
        //en büyük sayıyı bulma(benim yaptığım)
        /*
        int sayi1 = 20;
        int sayi2 = 49;
        int sayi3 = 33;

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("En büyük = " +sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("En büyük = " +sayi2);
        } else {
            System.out.println("En büyük = " +sayi3);
        }
         */


        //en büyük sayıyı bulma(hocanın yaptığı)
        int sayi1 = 559;
        int sayi2 = 26;
        int sayi3 = 27;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2) {
            enBuyuk = sayi2;
        }

        if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük = " +enBuyuk);
    }
}
