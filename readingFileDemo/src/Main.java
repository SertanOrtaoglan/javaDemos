import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */

        /*
        //Dosya kapatma işlemi
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        */


        //"Checked exception"lar ile çalışmak(2.ders = dosya içerisindeki sayıların toplamını bulma)
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;    //('line=satır'dır. yani dosya içerisindeki satırları belirtiyor.)
            while ((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {    //try bloğu içerisindeki 'new FileReader()' için hata fırlatma uyarısıdır.
            throw new RuntimeException(e);
        } catch (IOException e) {              //try bloğu içerisindeki while döngüsünde yazdığımız 'reader.readLine()'daki 'readLine()' için hata fırlatma uyarısıdır. Burada 'catch(Exception e)' diyip işi kolay yoldan çözebilirdik.('Exception' class'ı tüm hepsinin base'i olduğu için)
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {          //Hemen üstündeki try bloğu içerisindeki 'reader.close()'daki 'close()' için hata fırlatma uyarısıdır.
                throw new RuntimeException(e);
            }
        }


    }
}




