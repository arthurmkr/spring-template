package blank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@DisableExternalDependency
@DisableDbDependency
class SomeServiceImplTest {
    @Autowired
    SomeService service;

    @Test
    void helloWorld() {
        assertThat(service.getParam()).isEqualTo("test");
    }
}