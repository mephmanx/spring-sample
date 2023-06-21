package io.spring.training.boot.jdbcboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.*;
@SpringBootTest
class JdbcBootApplicationTests {

	public static final String Query = "select count(*) from T_ACCOUNT";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void testNumberOfAccounts() {
		long count = jdbcTemplate.queryForObject(Query, Long.class);
		assertThat(count).isEqualTo(21);
	}
	@Test
	void contextLoads() {
	}

}
