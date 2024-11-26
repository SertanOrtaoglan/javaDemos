public interface IEntityRepository<T extends IEntity> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);


}

//IEntityRepository<T> burada T olarak veritabanı nesneleri(entity'ler) yazılır. (Product,Customer vb.) Yani 'generic constraints(kısıtlar)' vardır. Bu kısıtı uygulamak için 'IEntity' adında bir interface oluştururuz. Ardından veritabanı nesnelerimiz olan 'Product' ve 'Customer' class'larında bu interface'i implement ederiz. Sonuç olarak burada veritabanı nesneleri olan 'Product' ve 'Customer' nesnelerini, 'IEntity'(interface) grubuna katmış olduk.(Burada interface'in gruplama özelliğinden yararlanmış olduk.) Yani bu iki class'ta(Product ve Customer) birer veritabanı nesnesidir(entity) demiş olduk.
//Dolayısıyla yukarıdaki IEntityRepository<T> içerisine kısıtı belli etmek için 'T extends IEntity' ifadesini yazarız. Yani interface'i "public interface IEntityRepository<T extends IEntity>" şeklinde yazarız. Böylelikle 'IEntityRepository'i implemente edecek kişi 'T'(tip) olarak 'IEntity' interface'ini implemente eden class'ı(Product veya Customer) vermek zorundadır.