import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //createFile();    (1.ders)
        //getFileInfo();   (2.ders)
        //readFile();      (3.ders)

        //(4.ders)
        readFile();
        writeFile();
        readFile();


    }


    //1.DERS(Yeni bir dosya üretme işlemi)
    public static void createFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //2.DERS(Oluşturduğumuz 'students.txt' dosyası ile ilgili bilgileri okuma işlemi)
    public static void getFileInfo(){
        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()){                                                    //'exists()' operasyonu boolean(true ya da false)'dır. İlgili yolda böyle bir dosya(students.txt) varsa 'true' yoksa 'false' döndürür.
            System.out.println("Dosya adı : " +file.getName());                //'getName()' operasyonu ile dosyamızın ismini(studenst.txt) okuyabiliriz.
            System.out.println("Dosya yolu : " +file.getAbsolutePath());       //'getAbsolutePath()' operasyonu ile 'students.txt' dosyamızın yolunu ekrana yazdırırız.(C:\javademos\files\students.txt)
            System.out.println("Dosya yazılabilir mi : " +file.canWrite());    //'canWrite()' operasyonu ile bu dosyamıza(students.txt) bir şey yazabilir miyiz onu öğreniriz. Bunu öğrenme nedenimiz ise bazı dosyaların yetkisi kaldırılıyor ve sadece okuma yapabiliyoruz dolayısıyla bu 'canWrite()' operasyonu ile dosyaya yazma işlemi yapıp yapamayacağımızı öğreniriz. Bu operasyonumuz da boolean'dır. Yani 'true'(yazma işlemi yapılabilir) ya da 'false'(yazma işlemi yapılamaz) döner.
            System.out.println("Dosya okunabilir mi : " +file.canRead());      //'canRead()' operasyonu da dosyamızın(students.txt) okunabilir olup olmadığını bize söyler. Boolean'dır yani 'true'(okuma işlemi yapılabilir) ya da 'false'(okuma işlemi yapılamaz) döner.
            System.out.println("Dosya boyutu (byte) : " +file.length());       //'length()' operasyonu bize bu dosyamızın(students.txt) boyutunu 'byte' cinsinden verir.
        }
    }


    //3.DERS(Oluşturduğumuz dosyayı okuma işlemi)
    //Normalde bu işlemi önceki derslerimizde 'BufferedReader' class'ı ile yapmıştık. Bu 'BufferedReader' class'ı 'java.io' paketi altında gelen bir class'tır. Bu class dosyayı önce bir belleğe alır ardından bellekte işlemlerini yapar. Bu örneğimizde 'BufferedReader'ı kullanmayacağız onun yerine direkt olarak 'file' nesnesini kullanarak dosya okuma işlemini gerçekleştireceğiz. Böylelikle direkt olarak dosya üzerinden okuma işlemi yapacağız. (Eğer 'BufferedReader' class'ını kullansaydık dosyayı belleğe alıp okuma işlemini bellek üzerinden gerçekleştirmiş olacaktık.)
    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);       //'Scanner' class'ı dosya okuması yapmamıza yarar.
            while (reader.hasNextLine()){             //'hasNextLine()' operasyonu boolean'dır. Yani 'true' ya da 'false' döner. Kısacası okunacak satır varsa okuyabildiği sürece devam eder.
                String line = reader.nextLine();      //'nextLine()' operasyonu ise yeni bir satır var mı diye bakar. Eğer yeni bir satır varsa okunacak bir şey var demektir bu noktada 'nextLine()' operasyonu o satırdaki data'yı okur ve 'hasNextLine()' operasyonu 'true' verdiği sürece okuma işlemine devam eder. 'hasNextLine()' operasyonu 'false' verdiği an (yani okunacak satır kalmazsa) döngüden çıkar.
                System.out.println(line);             //Okuma sonucu gelen data'yı 'line' değişkenine atamıştık. Burada ise 'line' değişkenini ekrana yazdırdık.
            }
            reader.close();                           //'while' döngüsü bittiği için okuma işlemimiz de bitmiş oldu. Dolayısıyla dosya kapatma işlemi yapmamız gerekir.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //4.DERS(Oluşturduğumuz dosyaya yazma işlemi) ('BufferedReader' class'ı ile yapacağız.)
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true));    //Dosya içerisine yeni bir şey eklemek istediğimizde programın default hali üzerine yazma şeklindedir. Yani eklediğimiz "Ahmet"i dosya içerisindeki mevcut data'nın üzerine eklemek yerine eski veriyi komple silip sadece "Ahmet"i ekleyerek yapar. Bu işlemi düzeltmek için path'imizin sonuna 'true' ifadesini ekleriz. Bakarsak 'append : true' gibi bir ifade oluştuğunu görürüz. Bu ifade 'dosyayı ekleme formatında aç' demektir.
            writer.newLine();    //'newLine()' operasyonu yeni bir satır oluşturmaya yarar.
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    //NOT: Okuma işlemini 'BufferedReader' class'ı ile şu şekilde yapabilirdik;
    public static void readFile2(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\javademos\\files\\students.txt"));
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

