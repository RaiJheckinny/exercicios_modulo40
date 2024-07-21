package br.com.raijheckinny.SpringBootPrimeiroExemplo.repository;

import br.com.raijheckinny.SpringBootPrimeiroExemplo.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IBookRepository extends CrudRepository<Book, UUID> {
}
