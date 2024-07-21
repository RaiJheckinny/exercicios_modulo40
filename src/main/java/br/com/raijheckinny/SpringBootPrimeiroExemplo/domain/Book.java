package br.com.raijheckinny.SpringBootPrimeiroExemplo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;
    @Column(name = "autor", length = 100, nullable = false)
    private String autor;
    @Column(name = "preco", nullable = false)
    private BigDecimal preco;
    @Column(name = "estoque", nullable = false)
    private BigDecimal estoque;
}
