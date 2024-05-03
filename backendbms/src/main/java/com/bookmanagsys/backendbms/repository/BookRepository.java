package com.bookmanagsys.backendbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmanagsys.backendbms.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
