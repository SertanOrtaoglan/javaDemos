public class KidsGameCalculator extends GameCalculator {
    @Override                    //Bu override(üzerine yazma) yapma işini IDE'mize otomatik yaptırınca görüldüğü gibi '@Override' diye bir ifade geliyor. Bu '@Override' ifadesi "annotation(not,notlarla açıklama)" bir ifade demektir. Yani bize operasyonu override ettiğine dair not göstermiş oluyor. Bu ifade kod okunurluğunu arttırır.('GameCalculator'ı extends eden diğer class'lardaki 'hesapla()' operasyonu üzerine burada olduğu gibi '@Override' yazabiliriz. Yani yazıp yazmamak bize kalmış bir şeydir. Burada 'hesapla()' operasyonunu yazma işlemini IDE'ye yaptırdığımız için '@Override' ifadesi otomatik olarak geldi. Diğer extends eden class'larda(ManGameCalculator,WomanGameCalculator) 'hesapla()' operasyonunu elimizle kendimiz yazdığımız için '@Override' ifadesini de kendimiz yazarak ekleyebiliriz.)
    public void hesapla() {
        System.out.println("Puanınız : 100");
    }


}

