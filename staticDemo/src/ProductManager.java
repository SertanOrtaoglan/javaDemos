public class ProductManager {         //'Manager' class'ları asla 'static' olarak tanımlamayız! Ancak aşağıda if bloğu içerisine yazdığımız 'ProductValidator.isValid(product)' gibi yardımcı araçlar(kullan-bırak araçlar) 'static' olarak tanımlanabilir. Şimdiye kadar anlattıklarımızı özetlersek; bir metotu 'static' yaparsak class ismiyle o metotu çağırabiliriz.(nokta koyarak) Örneğimizdeki 'ProductValidator.isValid(product)'da olduğu gibi.
    /*
    public void add(Product product) {
        ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("Eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
     */


    public void add(Product product) {

        if (ProductValidator.isValid(product)) {       //Yukarıda 'ProductValidator' için yaptığımız new'lemeyi sildik. Ardından if bloğundaki şart parantezi içerisinde yer alan 'validator' ifadesini 'ProductValidator' olarak değiştirdik. Ve görüldüğü üzere 'isValid' ifadesinin altı kırmızı ile çizildi yani 'ProductValidation' ile 'isValid'i kullanamıyoruz. İşte bunu düzeltmek için 'ProductValidation' class'ı içerisine gidip 'isValid()' operasyonunu 'static' yapmamız gerekir. Yani operasyonu 'public static boolean isValid(Product product)' şeklinde yazarız.
            System.out.println("Eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }


    //ProductValidator productValidator = new ProductValidator();


}

