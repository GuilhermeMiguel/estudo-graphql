package br.com.empresa.graphqlserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProdutoRequest {
	
	private String nome;
	
	private Long idFabricante;

	private String dataValidade;
	
	private String lote;
}
