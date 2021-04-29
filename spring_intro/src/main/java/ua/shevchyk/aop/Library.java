package ua.shevchyk.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary{
   // @Override
    public void getBook(Book book){
        System.out.println("We are getting book " + book.getName());
    }

    public void getMagazine(){
        System.out.println("we are getting magazine from library");
    }
//
//    public String returnBook(){
//        System.out.println("Returning book from library");
//        return "Ok";
//    }
}
