public class Main {
    public static void main(String[] args) {
        /* (Burada 'Product' constructor'ı parametre almıyor. Yani 'Product' parametresiz constructor'dır. Biz burada nesnenin alacağı değerleri getter ve setter'la sağlıyoruz.)
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        */

        //Yukarıdaki işlemi 'Product' constructor'ı parametre alacak şekilde yaparsak;(Yani 'Product' parametreli constructor'dır.)
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Siyah");



        System.out.println(product.getKod());    //Çıktı "L1" verilir. 'getKod()' operasyonu ile sadece 'okuma yani ekrana yazdırma' işlemini yapmış olduk. Ürünün adının ilk harfi olan "L"(Laptop) ve 'id' değeri "1"i birleştirip çıktı olarak "L1"i verdi.


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}

