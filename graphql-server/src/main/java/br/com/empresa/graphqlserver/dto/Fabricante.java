package br.com.empresa.graphqlserver.dto;

import br.com.empresa.graphqlserver.enumerators.CategoriaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Fabricante {

	private Long id;
	
	private String nome;
	
	private String cidade;
	
	private String estado;
	
	private CategoriaEnum categoria;
	
}
