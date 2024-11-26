public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) {    //BaseKrediManager'daki 'hesapla(double tutar)' operasyonunu burada aynı imzayla yani birebir aynısını yazdığımız için 'overriding(üzerine yazma)' işlemi yapmış oluruz ve artık 'OgrenciKrediManager' için buradaki 'hesapla(double tutar)' operasyonu çalışacaktır.(Yani biz 'BaseKrediManager'ın 'hesapla(double tutar)' operasyonunu burada 'OgrenciKrediManager' için ezdik demektir.'override' edip üzerine yazmış olduk.)
        return tutar * 1.10;                 //NOT: Java'da bir class'ın herhangi bir operasyonu biz aksini belirtmediğimiz sürece 'overridable(üzerine yazılabilir)'dır. Yani 'üzerine yazılabilir'dir.
    }

}

