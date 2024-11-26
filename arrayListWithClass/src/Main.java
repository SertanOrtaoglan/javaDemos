import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        /*
        customers.add(new Customer(1,"Sertan", "Ortaoğlan"));
        customers.add(new Customer(2,"Engin", "Demiroğ"));
        customers.add(new Customer(3,"Derin", "Demiroğ"));

        customers.remove((new Customer(1,"Sertan", "Ortaoğlan")));      //Bu şekilde silmeyi denersek silme işlemi gerçekleşmez.
        */

        //Silme işleminin yapılması
        Customer sertan = new Customer(1,"Sertan", "Ortaoğlan");
        customers.add(sertan);
        customers.add(new Customer(2,"Engin", "Demiroğ"));
        customers.add(new Customer(3,"Derin", "Demiroğ"));

        customers.remove(sertan);     //Kodu çalıştırırsak 'sertan' objesi listeden silinir.


        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }


    }
}



