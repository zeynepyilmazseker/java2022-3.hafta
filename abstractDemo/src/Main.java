public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.baseDataManager=new MySqlServerDatabaseManager();
        customerManager.getCustomer();


    }
}