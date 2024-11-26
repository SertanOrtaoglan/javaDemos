public class Main {
    public static void main(String[] args) {
        /*
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        */


        /*
        GameCalculator gameCalculator = new GameCalculator() {
            @Override                     //GameCalculator'ı new'lemeye çalışınca bu kısmı IDE'miz otomatik olarak getirdi. ALt kısımda bu kodu silip tekrar new'lemeyi deneyelim.
            public void hesapla() {

            }
        }
        */


        /*
        GameCalculator gameCalculator = new GameCalculator();    //Görüldüğü gibi abstract class olarak tanımladığımız base class'ımız olan 'GameCalculator'ı bu şekilde new'leyerek kullanmak mümkün değildir.(Sağ taraftaki 'new GameCalculator()'ın altını kırmızı ile çizdi yani kullanıma izin verilmiyor demektir.)
        */




        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();


    }
}




