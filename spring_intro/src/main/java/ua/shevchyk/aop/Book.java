package ua.shevchyk.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Philosophy2")
    private String name;

    @Value("Will Smith")
    private String author;

    @Value("2011")
    private int yearOfPublication;
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
