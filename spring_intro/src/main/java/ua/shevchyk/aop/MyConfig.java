package ua.shevchyk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ua.shevchyk.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
