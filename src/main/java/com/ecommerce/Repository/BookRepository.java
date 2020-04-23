package com.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
