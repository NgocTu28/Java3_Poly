package service.impl;

import dto.BooksDto;
import java.util.List;
import model.Users;
import repository.BooksRepository;
import util.Xhelper;

public class BooksServiceImpl {

    BooksRepository bookRepository;

    public BooksServiceImpl() {
        bookRepository = new BooksRepository();
    }
    
    public List<BooksDto> findAllBooks(Users user){
        return bookRepository.findAllBook(user);
    }
    
    public List<BooksDto> findAllBookById(Users user, String text){
        if(Xhelper.checkRong(text, "Không được để trống")) return null;
        return bookRepository.findAllBookById(user, text);
    }
    
    public  List<BooksDto> findBookByTitle(Users user, String text){
        if(Xhelper.checkRong(text, "Không được để trống")) return null;
        return bookRepository.findAllBookByTitle(user, text);
    }
    
    public  List<BooksDto> findBookByAuthor(Users user, String text){
        if(Xhelper.checkRong(text, "Không được để trống")) return null;
        return bookRepository.findAllBookByAuthor(user, text);
    }
}
