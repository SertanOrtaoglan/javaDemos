public class Product {   //'Product' class'ı ürünün özelliklerini tutar.

    /*
    public Product() {   //'Product' class'ının constructor'ı bu şekilde yazılır. public'den sonra herhangi bir şey yazmadan direkt olarak class'ın adını yazıp '()' ekleriz. Yani 'public Product()' şeklinde yazarız. Aslında bakarsak bunu da bir method yani operasyon olarak 'Yapıcı blok(Yapıcı method)' gibi düşünebiliriz.
        System.out.println("Yapıcı blok çalıştı");
    }
    */

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }




    //Bu ürün özelliklerine 'attribute' ya da 'field' denir.
    private int id;               //'private' ifadesi 'özel' demektir ve class içerisinde değişken başına yazarsak "private yazılan değişken sadece tanımlandığı blokta geçerlidir" anlamına gelir. Değişkenlerin tanımlandığı ve içerisinde olduğu blok bir üstündeki süslü parantez bloğudur. Şu anda bir üstündeki süslü parantez bloğu 'Product' sınıfının içerisi olduğu için sadece 'public class Product'ın süslü parantezleri içerisinde bu 'private' değişkenleri kullanabiliriz. Başka yerden bu private değişkenlere erişemeyiz.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //İlk field'ımız olan 'id'(private int id) için 'getter' ve 'setter'ları elimizle yazacağız diğer field'ları(name,description,price..) IDE'miz ile otomatik oluşturacağız.
    //'getter' bloğu('_id' için)
    public int getId() {            //sadece 'getId()' yapmak 'id' değişkenini okuyabiliriz demektir. Yani 'getter' ile['getId()'] 'id' değişkenine değer atayamayız ancak atanmış bir değer varsa onu okuyabiliriz.(Burada değeri 'return' etmesini istediğimiz için 'void' kullanmayız.)
        return id;
    }

    //'setter' bloğu('_id' için)
    public void setId(int id) {     //'setId()' demek; git bize 'id'nin değerini kur(değeri ata) demektir. Yani bize bir şey vermesine gerek yoktur('return' etmesine) dolayısıyla 'void' kullanacağız. Ayrıca 'set' edilen değer neyse parametre olarak verilmelidir.(int id) Çünkü bu değeri kullanıcıdan girmesini istiyoruz. NOT: 'get'te, 'set'te 'public' olarak yazılır çünkü başka class'lardan buradaki 'private' değişkenlere erişmek istiyoruz. Dolayısıyla bunları 'public' olarak yazarız.
        this.id = id;               //Buradaki 'this' ifadesi bu class'ı('Product' class'ını) belirtiyor demektir. Yani 'this' içerisinde bulunduğumuz class'tır.(Bu örneğe göre 'Product' class'ı) Kısacası 'this.id = id' demek "Product class'ının id'si(this.id) eşittir(=) parametre olarak girilen id(id)" demektir. Fakat biz normalde 'best practice' kullanım olarak 'this' ifadesini kullanmayacaktık bunun yerine yukarıda 'private' olarak tanımladığımız değişkenlerin başına '_(alt çizgi)' karakterini koyup o şekilde yazacaktık. Yani '_id', '_name', '_description' vs. bu şekilde yazacaktık. Bu şekilde kullanmak normalde daha uygundur böylece parametre olarak girilen 'id' ile(int id) yukarıda private olarak tanımladığımız 'id'yi(private int id) birbiriyle karıştırmamış olacaktık ve sonuç olarak 'this' ifadesi ile uğraşmayacaktık. Çünkü bazen programcı 'this' ifadesini yazmayı unutuyor ve sonra karmaşıklık oluyor bunun önüne geçmek adına bu alt çizgi ile olan kullanımı('_id') uygulamamız daha güzel olurdu ancak IDE'miz(Intellij IDEA) 'this' ifadesini kullandığı için biz de 'this'li kullanımı yazacağız. [NOT: Bu alt çizgi kullanarak yazdığımız değişkenler(mesela '_id') 'field' olanlardır.(en başta 'private' olarak tanımladığımız değişkenler)]
    }                               //Bu 'set' operasyonunu yazdıktan sonra artık Main'e geçip düzeltmemizi yapabiliriz. Önceden yazılı olan(değişkenler 'public' olarak tanımlıyken) 'product.id = 1;' ifadesini sileriz ve bunun yerine burada oluşturduğumuz set'li operasyonu('private' olarak tanımladığımız için 'set'li yaptık) 'product.setId(1);' şeklinde yazarız.


    //Buradan itibaren geri kalan tüm field'ları şu şekilde otomatik olarak oluştururuz: İlk olarak yukarıda 'private' olarak tanımladığımız değişkenin adının üstüne yani field'ın adının üstüne geliriz(mesela 'name') ve sağ tık yaparız ardından 'Refactor'e tıklarız daha sonra açılan pencerede en altta 'Encapsulate Fields...'a tıklarız ve yeni bir pencere daha açıldığını görürüz. Bu pencerede hangi fields'ların(yani 'private' olarak tanımladığımız değişkenleri kastediyoruz) 'getter ve setter'larını oluşturmak istiyorsak onları sırasıyla seçeriz. Örneğimizde 'id'yi elimizle oluşturduğumuz için 'id' dışındaki tüm fields'ların(name,description,price,stockAmount,renk,kod) hepsini sırasıyla işaretledik. Ardından en alttaki 'Refactor'e tıkladık ve böylece tüm seçtiğimiz fields'ların 'getter ve setter'larını otomatik olarak oluşturmuş olduk.  NOT: Biz örneğimizde field'ları en başta elimizle kendimiz 'private' olarak tanımladık. Eğer field'ları en başta kendimiz 'private' olarak tanımlamasaydık bu işlemi IDE'mize otomatik olarak yaptırabilirdik. Bu işlemide şu şekilde yaptırırdık: Otomatik olarak 'getter ve setter' tanımlama işleminin son penceresinde açılan 'Encapsulated Fields' Visibility seçeneğinde 'Private'ı işaretlerdik böylece direkt olarak programa field'ların başına 'Private' getirmesini sağlardık.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    //Biz 'kod' adlı field'ımızın hiçbir şekilde yazılabilir olmasını istemiyoruz demiştik. Dolayısıyla 'kod' adlı field'ın 'setter'ını iptal ederiz.(Aşağıda iptal ettik) Okunma yani 'getter' kısmına gelirsek bize 'name' adlı field'ın ilk harfini ve 'id'yi birleştirip döndürmesini(return) istiyoruz. Bu kodu "return this.name.substring(0,1) + id;" şeklinde yazarız. Mesela örnek verirsek 'name' field'ına "Laptop" yazdığımızı ve 'id'yi 1 olarak tanımladığımızı düşünelim. Main'de 'System.out.println(product.getKod())' yazıp kodu çalıştırırsak bize çıktı olarak "L1"i verdiğini görürüz. Sonuç olarak 'setKod()' operasyonunu iptal edip kodu kullanıcının yazmasını engellemiş olduk ve 'getKod()' operasyonu ile sadece 'okuma(ekrana yazdırma)' işlemi yaptırmış olduk.
    public String getKod() {
        return this.name.substring(0,1) + id;           //'substring(0,1)' demek 0.index'i alır 1.index'i dahil etmez demektir.
    }

    /*
    public void setKod(String kod) {
        this.kod = kod;
    }
    */




}

