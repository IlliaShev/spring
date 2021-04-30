package ua.shevchyk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        String bookName = library.returnBook();
        System.out.println("Return book " + bookName);
        context.close();
        System.out.println("Method main ends");
    }

}
