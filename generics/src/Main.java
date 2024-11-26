import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* (Normal Arraylist)
        ArrayList sehirler = new ArrayList();
        sehirler.add("Ankara");
        sehirler.add("istanbul");
        sehirler.add(1);
         */

        /* (Tip güvenli ArrayList)
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
         */


        /* (Burada kendi oluşturduğumuz 'MyList' class'ı, 'ArrayList' class'ının işlevini görmektedir.)
        MyList<String> sehirler = new MyList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
         */


        MyList<Customer> sehirler = new MyList<Customer>();
        sehirler.add(new Customer());
        sehirler.add(new Customer());


    }
}


