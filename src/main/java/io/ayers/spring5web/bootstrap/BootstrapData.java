package io.ayers.spring5web.bootstrap;

import io.ayers.spring5web.domain.Author;
import io.ayers.spring5web.domain.Book;
import io.ayers.spring5web.domain.Publisher;
import io.ayers.spring5web.repositories.IAuthorRepository;
import io.ayers.spring5web.repositories.IBookRepository;
import io.ayers.spring5web.repositories.IPublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;
    private final IPublisherRepository publisherRepository;

    public BootstrapData(IAuthorRepository authorRepository, IBookRepository bookRepository, IPublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author("Eric", "Evans");
        Author author2 = new Author("Rod", "Johnson");
        Publisher publisher1 = new Publisher("Penguin", "123 Mockingbird Lane", "New York", "NY", "00000");

        Book book1 = new Book("Domain Driven Design", "123123");
        Book book2 = new Book("J2EE Development", "2345566");

        author1.getBooks().add(book1);
        author2.getBooks().add(book2);

        book1.getAuthors().add(author1);
        book2.getAuthors().add(author2);

        publisherRepository.save(publisher1);

        book1.setPublisher(publisher1);
        book2.setPublisher(publisher1);

        authorRepository.save(author1);
        authorRepository.save(author2);

        bookRepository.save(book1);
        bookRepository.save(book2);


    }
}
