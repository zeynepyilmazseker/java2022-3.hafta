public class CreditManager {
    public double calculate(double krediMiktari) {
        double total = krediMiktari * 1.18 + krediMiktari;
        System.out.println("toplam ödenecek miktar :" + total);


        return total;
    }

    public void save(Customer customer) {
        customer.setFirstName("zeynep");
        System.out.println(customer.getFirstName() + "  kredi verildi");


    }
}

