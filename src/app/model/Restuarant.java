package app.model;

import java.util.List;

public class Restuarant {
    public String name;
    public Address address;
    public List<Dishes> dishes;


    @Override
    public String toString() {
        return "Restuarant{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", dishes=" + dishes +
                '}';
    }
}
