package s2n.mentalMaths.mathQuiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@ComponentScan(basePackages =
		{"s2n.mentalMaths"})
public class MathQuizApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		System.out.println("Math Quiz start main");
		SpringApplication.run(MathQuizApplication.class, args);

	}

}
