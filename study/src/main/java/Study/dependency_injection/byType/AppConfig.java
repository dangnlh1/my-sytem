package Study.dependency_injection.byType;

import Study.dependency_injection.byName.Address;
import Study.dependency_injection.byName.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Employee employee() {
        return new Employee();
    }
}