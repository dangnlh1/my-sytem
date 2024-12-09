package Study.dependency_injection.Constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Employee employee(Address address) { // Tự động tiêm qua constructor
        return new Employee(address);
    }
}
