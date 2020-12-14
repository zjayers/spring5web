package io.ayers.spring5web.repositories;

import io.ayers.spring5web.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book, Long> {
}
