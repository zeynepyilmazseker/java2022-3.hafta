public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditmanager;
    public CustomerManager(Customer customer, ICreditManager creditmanager){
        _customer=customer;
        _creditmanager=creditmanager;
    }


    public void add() {
        System.out.println("müşteri eklendi  " + _customer.getId());
    }
    public void save(){
        System.out.println("müşteri kaydedildi  " + _customer.getFirstName());

    }
    public void delete(){
        System.out.println("müşteri silindi  " + _customer.getLastName());
    }
    public void giveCredit(){
        _creditmanager.calculate();
        System.out.println("kredi verildi.");
    }

}
