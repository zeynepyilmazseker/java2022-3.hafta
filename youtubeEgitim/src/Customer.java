public class Customer {
    public Customer(){
        System.out.println("müşteri nesnesi başlatıldı");
    }

    private int id;
    private String firstName;
    private String lastName;
    private String nationalIdendity;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdendity() {
        return nationalIdendity;
    }

    public void setNationalIdendity(String nationalIdendity) {
        this.nationalIdendity = nationalIdendity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

