// Spring Configuration
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
public NotificationChannel emailService() {
return new EmailService(); // Define EmailService as a bean
}

    @Bean
    public NotificationService notificationService(NotificationChannel notificationChannel) {
        return new NotificationService(notificationChannel); // Inject NotificationChannel into NotificationService
    }
}

// Main Class
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.sendNotification("Hello, User!"); // Uses EmailService
    }
}