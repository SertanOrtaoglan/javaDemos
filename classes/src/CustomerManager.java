public class CustomerManager {                         //class'lar genellikle 'PascalCase' yöntemiyle isimlendirilir. Müşteriyi ilgilendiren metotları bu 'CustomerManager' class'ı içerisine yazacağız. Yani operasyonları bu class içerisine koyacağız.
    public void Add() {                                //class içerisindeki bütün operasyonları 'static' olmadan tanımlayacağız. Burada 'Add()' yani 'ekleme' operasyonu tanımladık. Bu operasyon ile müşteri ekleyeceğimizi düşünelim dolayısıyla operasyon içerisine müşteri ekleme kodlarını yazmamız gerekir. İleride bunları yapacağız. Ancak şimdi müşteri ekleme kodlarının önceden yazıldığını varsayalım dolayısıyla direkt olarak ekrana 'müşteri veritabanına eklendi' çıktısını verdirelim.
        System.out.println("Müşteri eklendi");
    }

    public void Remove() {                             //'Müşteri silme' operasyonu olan 'Remove()' operasyonunu tanımladık.
        System.out.println("Müşteri silindi");
    }

    public void Update() {                             //'Müşteri güncelleme' operasyonu olan 'Update()' operasyonunu tanımladık.
        System.out.println("Müşteri güncellendi");
    }







}
