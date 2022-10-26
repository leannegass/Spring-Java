import com.leanne.repository.HibernateSpeakerRepositoryImpl;
import com.leanne.repository.SpeakerRepository;
import com.leanne.service.SpeakerService;
import com.leanne.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();

    }
/*
    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateSpeakerRepositoryImpl();

    }
*/
}
