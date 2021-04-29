package ua.shevchyk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        Book book = context.getBean("book", Book.class);
        //SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        library.getBook(book);
        library.getMagazine();
        //library.returnBook();
        //schoolLibrary.getBook();
        context.close();
    }
}
