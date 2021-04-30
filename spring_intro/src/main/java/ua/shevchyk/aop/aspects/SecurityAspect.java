package ua.shevchyk.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
//    @Before("ua.shevchyk.aop.aspects.MyPointCuts.allAddMethods()")
//    public void beforeAddSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: checking security permission");
//        System.out.println("--------------------");
//    }
}
