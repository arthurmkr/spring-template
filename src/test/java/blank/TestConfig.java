package blank;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
class TestConfig {
    @Bean
    SomeService someService() {
        return new SomeServiceImpl("test");
    }
}
