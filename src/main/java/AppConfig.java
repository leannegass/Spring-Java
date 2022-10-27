import com.leanne.repository.HibernateSpeakerRepositoryImpl;
import com.leanne.repository.SpeakerRepository;
import com.leanne.service.SpeakerService;
import com.leanne.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.leanne"})
public class AppConfig {
/*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //service.setRepository(getSpeakerRepository());
        return service;
    }


    @Bean(name = "speakerRepository")
    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();

    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateSpeakerRepositoryImpl();

    }
*/
}
