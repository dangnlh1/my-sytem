//package Study.ioc.use_ioc.java_configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppConfig {
//
//
//    @Bean
//    public FeedbackService feedbackService() {
//        return new FeedbackService();
//    }
//
//    @Bean
//    public DeliveryService fasDeliveryService() {
//        return new FastDeliveryService();
//    }
//
//    @Bean
//    public ReceiveService receiveService(){
//        return new ReceiveService();
//    }
//
//    @Bean
//    public OrderProcessor orderProcessor() {
//        return new OrderProcessor(fasDeliveryService(), receiveService(), feedbackService());
//    }
//}
