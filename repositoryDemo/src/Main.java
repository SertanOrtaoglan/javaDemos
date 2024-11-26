public class Main {
    public static void main(String[] args) {

        //2.DERS(Oluşturduğumuz generic metotu kullanma)
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);

    }
}

