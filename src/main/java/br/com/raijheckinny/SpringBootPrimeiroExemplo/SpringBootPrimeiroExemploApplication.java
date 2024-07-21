package br.com.raijheckinny.SpringBootPrimeiroExemplo;

import br.com.raijheckinny.SpringBootPrimeiroExemplo.domain.Book;
import br.com.raijheckinny.SpringBootPrimeiroExemplo.domain.Cliente;
import br.com.raijheckinny.SpringBootPrimeiroExemplo.repository.IBookRepository;
import br.com.raijheckinny.SpringBootPrimeiroExemplo.repository.IClienteRepository;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.raijheckinny.SpringBootPrimeiroExemplo.repository")
@ComponentScan(basePackages = "br.com.SpringBootPrimeiroExemplo.raijheckinny")
public class SpringBootPrimeiroExemploApplication implements CommandLineRunner {

	public static final Logger log = (Logger) LoggerFactory.getLogger(SpringBootPrimeiroExemploApplication.class);

	@Autowired
	private IClienteRepository repositoryCliente;
	@Autowired
	private IBookRepository repositoryBook;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartAplication...");
		Cliente cliente = createCliente();
		repositoryCliente.save(cliente);

		Book book = createBook();
		repositoryBook.save(book);

	}

	private Book createBook() {
		return Book.builder()
				.titulo("Harry potter")
				.autor("J. K. Rowling")
				.preco(BigDecimal.valueOf(96.9))
				.estoque(BigDecimal.valueOf(999))
				.build();
	}

	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("SP")
				.cpf(121212134L)
				.email("teste@gmail.com")
				.numero(232323)
				.tel(2322223232L)
				.build();
	}
}
