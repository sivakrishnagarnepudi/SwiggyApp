package app.service;

import app.model.Address;
import app.model.Customer;
import app.model.Order;
import app.model.Registration;
import java.util.Scanner;

import java.util.UUID;

public class CustomerService {

    public static void main(String[] args) {


//        public Customer getRegistration () {
//

            Customer customer = new Customer();
            Scanner scanner = new Scanner(System.in);
            Registration registration = new Registration();
            System.out.print("Enter Your Name : ");
            registration.name = scanner.nextLine();
            System.out.print("Enter Your mobileNo : ");
            registration.mobileNo = scanner.nextLine();

            System.out.println(registration.otp);
            registration.enterOtp = scanner.nextLine();
            registration.login();
            Address address = new Address();
            address.area = "Bachupally";
            address.street = "Towers";
            address.pincode = 5212230;
            address.flatNo = "5-126";
            customer.registration = registration;
            customer.address = address;

        System.out.println(customer);


//            return customer;
//
        }
        public RestuarantService addToCart () {
            RestuarantService restuarantService = new RestuarantService();
            restuarantService.addRestaurants().dishes.get(0);
            return restuarantService;
        }
//    }
//
}
