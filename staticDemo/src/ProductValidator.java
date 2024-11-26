public class ProductValidator {

    static  {
        System.out.println("Static Yapıcı blok çalıştı");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }



    public static boolean isValid(Product product) {         //Bu operasyonu 'static' olarak tanımladığımız için artık başka bir class'ta bu operasyona erişmek için 'ProductValidator.isValid()' yazmamız yeterlidir. Yani class adını yazdıktan sonra nokta koyup ardından operasyon adını yazmamız yeterli olacaktır.(NOT: Eğer burada operasyonu 'static' olarak tanımlamasaydık başka bir class'ta bu operasyona erişmek için 'ProductValidator.isValid()' yazmamız bir anlam ifade etmezdi sonuç olarak operasyona erişemezdik. Yani 'static' ifadesi sayesinde başka bir class'ta önce 'nokta(.)' koyup ardından operasyon adını yazarak o operasyona ulaşabiliyoruz.)
        if(product.price>0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public void bisey(){

    }


    //'Inner Class' için örnek
    public static class BaskaBirClass {
        public static void sil() {

        }
    }






}

