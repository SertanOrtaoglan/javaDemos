public class Main {
    public static void main(String[] args) {
        /*(İnterface ilk ders örnek)
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.Add();
        */


        /*
        //İnterface ikinci ders 1.yöntem(Strategy pattern)
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new SqlServerCustomerDal();
        customerManager.add();
        */


        //2.yöntem(constructor kullanma)
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();


    }
}



