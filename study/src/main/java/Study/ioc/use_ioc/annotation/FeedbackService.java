package Study.ioc.use_ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class FeedbackService {
    public String receive (String item) {
        return "Khách đánh giá 5 sao :  " + item;
    }
}
