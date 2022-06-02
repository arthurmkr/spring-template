package blank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfig {
    @Bean
    SomeService someService(@Value("${param}") String param) {
        return new SomeServiceImpl(param);
    }
}
