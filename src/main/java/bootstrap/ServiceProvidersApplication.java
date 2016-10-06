package bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"controller"})
public class ServiceProvidersApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceProvidersApplication.class).web(
				true).run(args);
	}
}
