package br.com.empresa.graphqlclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.empresa.graphqlclient.enumerators.CategoriaEnum;

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
