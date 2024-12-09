package Study.dependency_injection.Setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Address address;

//    @Autowired // Tự động tiêm qua setter
    public void setAddress(Address address) {
        this.address = address;
    }

    public void showDetails() {
        System.out.println("Employee lives in: " + address.getCity());
    }
}