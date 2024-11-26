public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = "+manager.getBalance());

        manager.deposit(100);
        System.out.println("Hesap = "+manager.getBalance());
        /*
        manager.withdraw(90);
        System.out.println("Hesap = "+manager.getBalance());

        manager.withdraw(20);
        System.out.println("Hesap = "+manager.getBalance());
         */

        /*
        //main metotuna 'throws Exception' yazmak yerine 'try/catch' bloğu oluşturabiliriz.
        try {
            manager.withdraw(90);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());


        try {
            manager.withdraw(20);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());
        */



        //2.DERS(kendi exception'ımızı yazmak)
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());


        try {
            manager.withdraw(20);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());


    }
}



