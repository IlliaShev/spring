package ua.shevchyk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*(ua.shevchyk.aop.Book))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: attempt to get book");
    }

    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: attempt to return book");
    }
}