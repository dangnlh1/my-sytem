package Study.dependency_injection.byName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address") // Tìm bean theo tên
    private Address address;

    public void showDetails() {
        System.out.println("Employee lives in: " + address.getCity());
    }
}
