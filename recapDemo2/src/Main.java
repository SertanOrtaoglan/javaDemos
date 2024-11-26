public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6}; //Bu array'i bu şekilde yazmakla 'double[] myList = new double[4];' şeklinde yazmak arasında fark yoktur. Şu anki yazımda 'new'leme işlemi arka planda olur ama geçen ders yazdığımızdaki gibi yazımlarda ise 'new'i biz kendimiz yazarız tek fark budur. Sonuç olarak iki yazım arasında bir fark yoktur.(Sonuçta bu yazımda da arka planda bir 'new'leme yapılıyor.)
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);

        //Bu örneğimizde ilk olarak bir array oluşturduk ve bu array'deki sayıları ekrana yazdırdık. Ardından bu array içerisindeki sayıların toplamını ekrana yazdırdık ve son olarak bu array'deki en büyük sayıyı ekrana yazdırdık.

    }
}
