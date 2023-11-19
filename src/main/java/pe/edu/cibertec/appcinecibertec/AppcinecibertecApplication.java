package pe.edu.cibertec.appcinecibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AppcinecibertecApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppcinecibertecApplication.class, args);
	}

	/*
	@Bean
	public WebMvcConfigurer webMvcConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("administracion/**")
						.allowedMethods("GET","POST","PUT","DELETE")
						.allowedOrigins("*");
			}
		};
	}*/

}
