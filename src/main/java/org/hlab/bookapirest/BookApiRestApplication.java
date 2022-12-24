package org.hlab.bookapirest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class
		,SecurityAutoConfiguration.class})
public class BookApiRestApplication {
	static Logger log= LoggerFactory.getLogger(BookApiRestApplication.class);


	public static void main(String... args) {
		new SpringApplicationBuilder()
				.bannerMode(Banner.Mode.OFF)
				.sources(BookApiRestApplication.class)
				.run(args);
	}
	@Value("${server.ip}")
	String server_ip;

	@Bean
	CommandLineRunner values(){
		return  args -> {
			log.info("The server ip is:  "+server_ip);
		};
	}


}
