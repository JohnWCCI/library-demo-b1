package com.wecancodeit.library.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.wecancodeit.library.Models.Book;

public interface BookRepository  extends CrudRepository<Book, Long>{
    
}
