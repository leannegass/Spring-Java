import com.leanne.repository.HibernateSpeakerRepositoryImpl;
import com.leanne.service.SpeakerService;
import com.leanne.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();

    }
/*
    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateSpeakerRepositoryImpl();

    }
*/
}
