public class ProductManager {   //'Ürün manager(ProductManager)' adı üstünde manage eder yani yönetir. "Ekle,Sil,Güncelle,Listele" tarzında operasyonları içerir.
    public void Add(Product product) {    //Ekleme operasyonunu yani 'Add()'i yazarız. Peki ekleyecek ama ne ekleyecek? Bunun için parametre vermemiz gerekiyor yani girdi olarak 'Product' türünde bir 'product' vermesini istedik. Bundan dolayı operasyonu 'Add(Product product)' şeklinde yazdık.
        //JDBC(Parametre olarak girilen 'product'ı burada 'JDBC' kodları yazarak veritabanına kaydedeceğiz. İlerideki konularda bu işlemi daha net bir şekilde öğreneceğiz.)
        System.out.println("Ürün eklendi " + product.getName());   //JDBC bilmediğimiz için kodu şimdilik bu şekilde yazdık.
    }



}
