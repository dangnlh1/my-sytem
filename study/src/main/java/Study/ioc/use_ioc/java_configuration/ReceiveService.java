package Study.ioc.use_ioc.java_configuration;

import org.springframework.stereotype.Component;


public class ReceiveService {
    public String receive (String item) {
        return "Khách hàng nhận hàng :  " + item;
    }
}
