public class Main {
    public static void main(String[] args) {
        char grade = 'F';     //control+shift+alt+L = kodumuzu düzgün formatta yazar.

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
//İki farklı durum için aynı çıktıyı vermek istiyorsak şöyle yazarız;
/* case 'A':
   case 'B':
       System.out.println("Geçtiniz");
*/
//Yani durumları alt alta yazarız ve çıktı vermek istediğimiz ifadeyi yazıp kodu tamamlarız. Şimdi harf notu olarak 'B' veya 'C' girildiğinde bize çıktı ekranında "Geçtiniz" yazısını verecektir.

