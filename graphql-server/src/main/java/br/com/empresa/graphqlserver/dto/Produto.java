package br.com.empresa.graphqlserver.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Produto {

	private Long id;
	
	private String nome;
	
	private Fabricante fabricante;

	private LocalDate dataValidade;
	
	private String lote;
	
}
