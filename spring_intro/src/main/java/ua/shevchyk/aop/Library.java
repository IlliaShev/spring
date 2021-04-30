package ua.shevchyk.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary{
   // @Override
    public void getBook(){
        System.out.println("We are getting book ");
        System.out.println("--------------------");
    }

    public void getMagazine(){
        System.out.println("we are getting magazine from library");
        System.out.println("--------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Returning book from library");
        return "Java for beginners";
    }

    public void returnMagazine(){
        System.out.println("Returning magazine from library");
        System.out.println("--------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Adding book to Library");
        System.out.println("--------------------");
    }

    public void addMagazine(){
        System.out.println("Adding magazine to Library");
        System.out.println("--------------------");
    }
}
