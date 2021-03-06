package blank;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
class ExternalDependencyConfig {
    @Bean
    SomeService someService() {
        return new SomeServiceImpl("test");
    }
}
