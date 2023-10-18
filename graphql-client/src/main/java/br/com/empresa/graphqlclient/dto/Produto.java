package br.com.empresa.graphqlclient.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produto {
    private Long id;

    private String nome;

    private Fabricante fabricante;

    private LocalDate dataValidade;

    private String lote;
}
