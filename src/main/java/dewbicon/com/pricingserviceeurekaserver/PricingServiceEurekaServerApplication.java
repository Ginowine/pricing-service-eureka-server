package dewbicon.com.pricingserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PricingServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricingServiceEurekaServerApplication.class, args);
	}

}
