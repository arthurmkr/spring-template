package blank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = TestConfig.class, properties = {
        "spring.main.allow-bean-definition-overriding=true"
})
@TestPropertySource(locations = "classpath:application-test.properties")
class SomeServiceImplTest {
    @Autowired
    SomeService service;

    @Test
    void helloWorld() {
        assertThat(service.getParam()).isEqualTo("test");
    }
}