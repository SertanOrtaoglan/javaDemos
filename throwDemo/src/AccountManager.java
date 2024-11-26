public class AccountManager {
    private double balance;


    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    /* 'withdraw()' operasyonunu ilk olarak bu şekilde yazdık.
    public void withdraw(double amount){
        balance = getBalance() - amount;
    }
    */
    //Bakiye eksiye düşemez bundan dolayı 'withdraw()' operasyonunu iki farklı yolla değiştirebiliriz. İlk yol olarak;
    /*
    public void withdraw(double amount){
        if (balance >= amount){
            balance = getBalance() - amount;
        } else {
            System.out.println("Hesaptan para çekilemedi. Bakiye yetersiz");
        }
    }
     */

    //İkinci yol olarak ise 'throw'u kullanabiliriz. Bunu şu şekilde yaparız;
    /*
    public void withdraw(double amount) throws Exception {
        if (balance >= amount){
            balance = getBalance() - amount;
        } else {
            throw new Exception("Bakiye yetersiz");
        }
    }
     */


    //2.DERS(kendi exception'ımızı yazmak)

    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance >= amount){
            balance = getBalance() - amount;
        } else {
            throw new BalanceInsufficentException("Bakiye yetersiz");
        }
    }


    public double getBalance() {
        return balance;
    }



}


