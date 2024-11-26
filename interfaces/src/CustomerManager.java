public class CustomerManager {
    /*(1.yöntem strategy pattern)
    ICustomerDal customerDal;
    public void add() {
        customerDal.Add();    //iş kodları buraya yazılır.
    }
    */


    //2.yöntem(constructor kullanma)
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.Add();    //iş kodları buraya yazılır.
    }



}


