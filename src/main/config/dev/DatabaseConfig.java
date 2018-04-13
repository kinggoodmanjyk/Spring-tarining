package dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:/dev/application.properties")
public class DatabaseConfig {

	@Autowired
	Environment env;
	
	@Bean
	public Database getDatebase(){
		return new Database(env.getProperty("db.master.url"), env.getProperty("db.master.user"), env.getProperty("db.master.password"));
	}
	
}
