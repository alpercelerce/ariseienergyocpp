package eu.chargetime.ocpp.jsonclientimplementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JsonClientImplementationApplication {

	private static final Logger logger = LoggerFactory.getLogger(JsonClientImplementationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JsonClientImplementationApplication.class, args);
	}
}
