package ua.shevchyk.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ua.shevchyk.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* ua.shevchyk.aop.Library.*(..))")
//    private void allMethodsFromLibrary(){}
//
//    @Pointcut("execution(public void ua.shevchyk.aop.Library.returnMagazine(..))")
//    private void returnMagazineFromLibrary(){}
//
//    @Pointcut("allMethodsFromLibrary()&&!returnMagazineFromLibrary()")
//    private void allMethodsExceptReturnMagazineFromLibrary(){}
//
//
//    @Before("allMethodsExceptReturnMagazineFromLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromLibrary(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromLibrary: writing log #5");
//    }


//    @Pointcut("execution(* ua.shevchyk.aop.Library.get*())")
//    private void allGetMethodsFromLibrary(){}
//
//    @Pointcut("execution(* ua.shevchyk.aop.Library.return*())")
//    private void allReturnMethodsFromLibrary(){}
//
//    @Pointcut("execution(* ua.shevchyk.aop.Library.add*())")
//    private void allAddMethodsFromLibrary(){}
//
//    @Pointcut("allGetMethodsFromLibrary()||allReturnMethodsFromLibrary()||allAddMethodsFromLibrary()")
//    private void allGetAndReturnAndAddMethodsFromLibrary(){}
//
//    @Before("allGetMethodsFromLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allAddMethodsFromLibrary()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: writing log #3");
//    }
//
//    @Before("allGetAndReturnAndAddMethodsFromLibrary()")
//    public void beforeGetReturnAddLoggingAdvice(){
//        System.out.println("beforeGetReturnAddLoggingAdvice: writing log #4");
//    }




//    @Before("ua.shevchyk.aop.aspects.MyPointCuts.allAddMethods())")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
//
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("methodSignature = " + methodSignature);
//        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
//        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
//        System.out.println("methodSignature.getName() = " + methodSignature.getName());
//
//        if(methodSignature.getName().equals("addBook")){
//            Object[] args = joinPoint.getArgs();
//            for(Object obj: args){
//                if(obj instanceof Book){
//                    Book myBook = (Book) obj;
//                    System.out.println(myBook.getAuthor() + " " + myBook.getName() + " " + myBook.getYearOfPublication());
//                } else if(obj instanceof String){
//                    System.out.println(obj);
//                }
//            }
//        }
//
//        System.out.println("beforeGetBookAdvice: logging attempt to get book/magazine");
//        System.out.println("--------------------");
//    }


//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: attempt to return book");
//    }
}
