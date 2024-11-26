public class Main {
    public static void main(String[] args) {
        /* (İlk Kısım)
        EmailLogger logger = new EmailLogger();
        logger.log("Log mesajı");
        */

        /* (İkinci Kısım)
        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger: loggers){
            logger.log("Log mesajı");
        }
        */

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}




