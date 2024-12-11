package Study.dependency_injection.Setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;

//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Employee lives in: " + address.getCity());
    }
}