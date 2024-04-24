package app.model;

public class Address {
    public String street;
    public String area;
    public int pincode;
    public String flatNo;


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", pincode=" + pincode +
                ", flatNo='" + flatNo + '\'' +
                '}';
    }
}
