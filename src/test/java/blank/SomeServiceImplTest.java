package blank;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SomeServiceImplTest extends BaseDbTest {
    @Autowired
    SomeService service;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void helloWorld() {
        assertThat(jdbcTemplate).isNotNull();
        insertRecord("123");

        List<String> objects = getRecords();

        assertThat(objects).containsAll(List.of("123"));

        insertRecord("456");

        objects = getRecords();

        assertThat(objects).containsAll(List.of("123", "456"));
    }

    @NotNull
    private List<String> getRecords() {
        return jdbcTemplate.query("select * from some_table", new SingleColumnRowMapper<>(String.class));
    }

    private void insertRecord(final String value) {
        jdbcTemplate.execute("INSERT INTO some_table(field1) VALUES ('" + value + "')");
    }
}