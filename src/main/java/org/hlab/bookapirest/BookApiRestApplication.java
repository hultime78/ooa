package org.hlab.bookapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class,MongoDataAutoConfiguration.class,
		DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class
})
public class BookApiRestApplication {

	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(
				BookApiRestApplication.class
		);

		app.run(args);
	}

}
