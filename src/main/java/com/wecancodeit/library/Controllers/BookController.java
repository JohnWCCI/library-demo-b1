package com.wecancodeit.library.Controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wecancodeit.library.Models.Book;
import com.wecancodeit.library.Repositories.BookRepository;

import jakarta.annotation.Resource;

@Controller
public class BookController {
    
    @Resource
    private BookRepository bookRepository;

    @RequestMapping("/books/{id}")
    public String displaySingleBook(@PathVariable long id, Model model){
        Optional<Book> optBook = bookRepository.findById(id);
      
        if(optBook.isPresent())
        {
          Book value = optBook.get();
            model.addAttribute("book", value);
        }
        return "bookView";
    }

}
