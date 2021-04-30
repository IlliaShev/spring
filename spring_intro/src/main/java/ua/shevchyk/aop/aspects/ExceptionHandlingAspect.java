package ua.shevchyk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
//    @Before("ua.shevchyk.aop.aspects.MyPointCuts.allAddMethods()")
//    public void beforeAddExceptionHandlingAdvice(){
//        System.out.println("beforeGetExceptionHandlingAdvice: Catching exceptions while attempting to get book");
//        System.out.println("--------------------");
//    }
}
