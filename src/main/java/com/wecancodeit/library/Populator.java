package com.wecancodeit.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wecancodeit.library.Models.Author;
import com.wecancodeit.library.Models.Book;
import com.wecancodeit.library.Models.Campus;
import com.wecancodeit.library.Repositories.AuthorRepository;
import com.wecancodeit.library.Repositories.BookRepository;
import com.wecancodeit.library.Repositories.CampusRepository;

import jakarta.annotation.Resource;



@Component
public class Populator implements CommandLineRunner {

    @Resource
    private CampusRepository campusRepo;
    @Resource
    private AuthorRepository authorRepo;
    @Resource
    private BookRepository bookRepo;

    @Override
    public void run(String... args) throws Exception {

        Campus columbus = new Campus("Columbus");
        Campus cleveland = new Campus("Cleveland");
        campusRepo.save(columbus);
        campusRepo.save(cleveland);

        Author sierra = new Author("Kathy","Sierra");
        Author bates = new Author("Burt", "Bates");
        Author beck = new Author("Kent", "Beck");
        Author fowler = new Author("Martin", "Fowler");
        Author martin = new Author("Micah", "Martin");
        authorRepo.save(sierra);
        authorRepo.save(bates);
        authorRepo.save(beck);
        authorRepo.save(fowler);
        authorRepo.save(martin);

        Book headfirstJava = new Book("Head First Java", "A great book to learn Java with", columbus, sierra, bates);
        Book tddByExample = new Book("TDD By Example", "The first book on TDD and still one of the best", columbus, beck);
        Book refactoring = new Book("Refactoring", "The first book to catalog the many refactorings available to address code smells", columbus, fowler);
        Book agileCSharp = new Book("Agile Principles, Patterns and Practices in C#", "A classic book refactored for C#", cleveland, martin);
        bookRepo.save(headfirstJava);
        bookRepo.save(tddByExample);
        bookRepo.save(refactoring);
        bookRepo.save(agileCSharp);

    }
}
