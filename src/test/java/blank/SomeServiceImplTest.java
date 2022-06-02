package blank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@Import(TestConfig.class)
@SpringBootTest
class SomeServiceImplTest {
    @Autowired
    SomeService service;

    @Test
    void helloWorld() {
        assertThat(service.getParam()).isEqualTo("test");
    }
}