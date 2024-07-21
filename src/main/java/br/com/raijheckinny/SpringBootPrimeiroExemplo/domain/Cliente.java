package br.com.raijheckinny.SpringBootPrimeiroExemplo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Table (name = "TB_CLIENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue
    private UUID id;

    private Long cpf;
    private Long tel;
    private String email;
    private Integer numero;
    private String cidade;
    private String estado;

}
