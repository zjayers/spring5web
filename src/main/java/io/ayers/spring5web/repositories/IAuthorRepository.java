package io.ayers.spring5web.repositories;

import io.ayers.spring5web.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author, Long> {
}
