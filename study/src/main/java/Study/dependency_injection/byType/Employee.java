package Study.dependency_injection.byType;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
    private Address address; // Tự động tiêm dựa trên kiểu dữ liệu

    public void showDetails() {
        System.out.println("Employee lives in: " + address.getCity());
    }
}
