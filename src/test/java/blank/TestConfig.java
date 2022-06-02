package blank;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@TestConfiguration
class TestConfig {
    @Bean
    SomeService someService() {
        return new SomeServiceImpl("test");
    }
}
