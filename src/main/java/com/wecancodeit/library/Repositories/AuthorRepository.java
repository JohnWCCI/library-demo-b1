package com.wecancodeit.library.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.wecancodeit.library.Models.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
    
}
