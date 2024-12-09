package Study.ioc.use_ioc.java_configuration;

import org.springframework.stereotype.Component;


public class FeedbackService {
    public String receive (String item) {
        return "Khách đánh giá 5 sao :  " + item;
    }
}
