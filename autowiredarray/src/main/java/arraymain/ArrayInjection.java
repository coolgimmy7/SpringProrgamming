package arraymain;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArrayInjection {

	@Bean
	public TestBean testBean() {
		return new TestBean(new String[] { "hi", "how", "are", "you" });
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ArrayInjection.class);

		TestBean bean = context.getBean(TestBean.class);
		System.out.println(Arrays.toString(bean.getStringArray()));
	}}