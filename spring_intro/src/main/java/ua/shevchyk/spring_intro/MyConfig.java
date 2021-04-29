package ua.shevchyk.spring_intro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.shevchyk.spring_intro")
@PropertySource("classpath:application.properties")
public class MyConfig {
}
