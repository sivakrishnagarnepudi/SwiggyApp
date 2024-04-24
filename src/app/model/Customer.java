package app.model;

public class Customer {
    public Registration registration;
    public Address address;


    @Override
    public String toString() {
        return "Customer{" +
                "registration=" + registration +
                ", address=" + address +
                '}';
    }
}
