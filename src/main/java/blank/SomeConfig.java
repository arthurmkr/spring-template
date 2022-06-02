package blank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {
    @Bean
    SomeService someService() {
        return new SomeServiceImpl("prod");
    }
}
