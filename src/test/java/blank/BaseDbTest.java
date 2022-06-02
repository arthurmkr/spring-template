package blank;

import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

@SpringBootTest
public class BaseDbTest {
    @Container
    private static final PostgreSQLContainer container = new PostgreSQLContainer("postgres:14.3-alpine");

    static {
        container.withInitScript("schema.sql");
        container.start();
        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }
}
