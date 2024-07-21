package br.com.raijheckinny.SpringBootPrimeiroExemplo.repository;

import br.com.raijheckinny.SpringBootPrimeiroExemplo.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, UUID> {
}
