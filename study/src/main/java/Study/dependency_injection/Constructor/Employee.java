package Study.dependency_injection.Constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;

    public Employee(Address address) { // Constructor injection
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Employee lives in: " + address.getCity());
    }
}