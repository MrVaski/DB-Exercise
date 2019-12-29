package pl.edu.wszib.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"pl.edu.wszib.services.impl","pl.edu.wszib.dao.impl"})
public class AppConfiguration {
}
