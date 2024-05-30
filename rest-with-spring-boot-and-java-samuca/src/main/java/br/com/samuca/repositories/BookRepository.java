package br.com.samuca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.samuca.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}