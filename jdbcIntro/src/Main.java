import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        //deleteData();
        

    }


    //'SElECT(READ)' işlemi
    public static void selectData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();    //5.video dersi(DbHelper yazımı)
        Statement statement = null;          //6.video dersi(Sql Select ifadelerinin çalıştırılması)
        ResultSet resultSet;                 //6.video dersi(Sql Select ifadelerinin çalıştırılması)
        try {
            /* 5.video dersi(DbHelper yazımı)
            connection = helper.getConnection();
            //System.out.println("Bağlantı oluştu");
             */

            /* 6.video dersi(Sql Select ifadelerinin çalıştırılması)
            statement = connection.createStatement();    //Gönderilecek sorgu bu bağlantıya yani 'helper.getConnection()'a gidecek.
            resultSet = statement.executeQuery("SELECT Code,Name,Continent,Region  FROM country");    //Parantez içerisine yazılan Sql cümleciğini(statement) çalıştırır ve sonucu(yani gelen data'yı) 'resultSet'e gönderir. Dolayısıyla bizim bu 'resultSet'i ekrana yazdırmamız gerekir.
            while (resultSet.next()){      //tek tek iterate eder(yani tek tek gezer)
                System.out.println(resultSet.getString("Name"));     //Burada 'getString()' operasyonu ile 'resultSet'e gelen datadaki(yani tablodaki) 'Name' alanında bulunan değerleri ekrana yazdırdık.('Name' field'ında bulunan değerler String olduğu için 'getString()' operasyonunu kullandık.)
            }
             */

            //7.video dersi(ResultSet'in nesnelere aktarılması)
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Code,Name,Continent,Region  FROM country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){
                countries.add(new Country(resultSet.getString("Code"),resultSet.getString("Name"),resultSet.getString("Continent"),resultSet.getString("Region")));
            }
            System.out.println(countries.size());    //'239' çıktısını alırız. Yani 'countries' ArrayList'inde 239 tane eleman vardır.
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }


    //'INSERT(CREATE)' işlemi
    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            /* 'Insert(ekleme)' işleminin yapılması(SQL statement'daki değerleri direkt olarak kendimiz yazarak)
            connection = helper.getConnection();
            statement = connection.prepareStatement("insert into city (Name, CountryCode, District, Population) values('Düzce', 'TUR', 'Düzce', 50000)");    //Buradaki 'prepareStatement()' operasyonu 'sql sorgusu hazırla' anlamına gelir.
            statement.executeUpdate();              //'executeUpdate()' operasyonu sonucu veritabanında etkilenen kayıt sayısı('1 row affected' gibi) int cinsinden verilir. Yani bu operasyon veritabanında yukarıdaki sorgudan kaç kayıt etkileniyorsa onun sayısını integer cinsinden bize verir. Sonuç olarak yukarıda yazdığımız sql statement'ı yani sorgusunu çalıştırıp veritabanına ekleme işlemini gerçekleştirir.
            System.out.println("Kayıt eklendi");    //Kodu çalıştırdıktan sonra 'Kayıt eklendi' çıktısını aldık. Veritabanına gidip bakarsak kayıtın eklendiğini görürüz.(ID:4080,Name:Düzce,CountryCode:TUR,District:Düzce,Population:50000)
             */

            //'Insert(ekleme)' işleminin yapılması(SQL statement'daki değerleri kullanıcıdan alarak)
            connection = helper.getConnection();
            String sql = "insert into city (Name, CountryCode, District, Population) values(?,?,?,?)";     //values'a '?' koymak buraya vereceğimiz değerlerin sırasıyla 'Name, CountryCode, District, Population'ın değerleri olacaktır anlamına gelir. Name(1), CountryCode(2), District(3), Population(4)
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");     //'Name' kolonu String olduğu için değerini 'setString()' operasyonu ile atadık.
            statement.setString(2,"TUR");         //'CountryCode' kolonu String olduğu için değerini 'setString()' operasyonu ile atadık.
            statement.setString(3,"Türkiye");     //'District' kolonu String olduğu için değerini 'setString()' operasyonu ile atadık.
            statement.setInt(4, 70000);           //'Population' kolonu Integer olduğu için değerini 'setInt()' operasyonu ile atadık.
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");                  //Kodu çalıştırdıktan sonra 'Kayıt eklendi' çıktısını aldık. Veritabanına gidip bakarsak kayıtın eklendiğini görürüz.(ID:4081,Name:Düzce 2,CountryCode:TUR,District:Türkiye,Population:70000)
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();     //Yukarıda yazdığımız statement'ı(sorguyu) kapatma işlemini yaptık.
            connection.close();
        }
    }


    //'UPDATE' işlemi
    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            /* Tek bir field'ı(kolonu) update etme işlemi
            connection = helper.getConnection();
            String sql = "update city set Population = 80000 where id = 4081";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");        //Kodu çalıştırdıktan sonra 'Kayıt güncellendi' çıktısını aldık. Veritabanına gidip bakarsak kayıtın güncellendiğini görürüz.(ID:4081,Name:Düzce 2,CountryCode:TUR,District:Türkiye,Population:80000)
             */

            /* Birden fazla field'ı(kolonu) update etme işlemi
            connection = helper.getConnection();
            String sql = "update city set Population = 80000, District ='Düzce' where id = 4081";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");        //Kodu çalıştırdıktan sonra 'Kayıt güncellendi' çıktısını aldık. Veritabanına gidip bakarsak kayıtın güncellendiğini görürüz.(ID:4081,Name:Düzce 2,CountryCode:TUR,District:Düzce,Population:80000)
             */

            //Update etme işlemini kullanıcıdan değer alarak yapmak
            connection = helper.getConnection();
            String sql = "update city set Population = 100000, District ='Türkiye' where id = ?";     //Koşulumuza '?' koyduk böylelikle bu değeri kullanıcıdan alacağız.
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081);       //'id' kolonu Integer olduğu için değerini 'setInt()' operasyonu ile atadık. Buradaki '1' değeri '1.soru işaretinin değeri budur' anlamına gelir.
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");        //Kodu çalıştırdıktan sonra 'Kayıt güncellendi' çıktısını aldık. Veritabanına gidip bakarsak kayıtın güncellendiğini görürüz.(ID:4081,Name:Düzce 2,CountryCode:TUR,District:Türkiye,Population:100000)
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }


    //'DELETE' işlemi
    public static void deleteData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            //Delete etme işlemini kullanıcıdan değer alarak yapmak
            connection = helper.getConnection();
            String sql = "delete from city where id = ?";     //Koşulumuza '?' koyduk böylelikle bu değeri kullanıcıdan alacağız.
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081);         //'id' kolonu Integer olduğu için değerini 'setInt()' operasyonu ile atadık. Buradaki '1' değeri '1.soru işaretinin değeri budur' anlamına gelir.
            statement.executeUpdate();
            System.out.println("Kayıt silindi");              //Kodu çalıştırdıktan sonra 'Kayıt silindi' çıktısını aldık. Veritabanına gidip bakarsak kayıtın silindiğini görürüz.(Tablodaki son id:4080'dir yani id:4081 silinmiştir.)
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }



}




