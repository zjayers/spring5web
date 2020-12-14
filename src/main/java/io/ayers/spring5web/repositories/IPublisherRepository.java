package io.ayers.spring5web.repositories;

import io.ayers.spring5web.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface IPublisherRepository extends CrudRepository<Publisher, Long> {
}
