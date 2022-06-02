package blank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@Import(TestConfig.class)
@SpringBootTest
@TestPropertySource(locations= "classpath:application-test.properties")
class SomeServiceImplTest {
    @Autowired
    SomeService service;

    @Test
    void helloWorld() {
        assertThat(service.getParam()).isEqualTo("test");
    }
}