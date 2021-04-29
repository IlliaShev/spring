package ua.shevchyk.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Philosophy2")
    private String name;

    public String getName() {
        return name;
    }
}
