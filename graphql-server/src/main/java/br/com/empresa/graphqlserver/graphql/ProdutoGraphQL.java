package br.com.empresa.graphqlserver.graphql;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.empresa.graphqlserver.dto.Produto;
import br.com.empresa.graphqlserver.dto.ProdutoRequest;
import br.com.empresa.graphqlserver.service.ProdutoService;

@Component
@RequiredArgsConstructor
public class ProdutoGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver{

	private final ProdutoService produtoService;
	
	/*
	  	http://localhost:8095/graphiql
	  	
	  	o endereço com o recurso /graphiql é a interface que podemos acessar pelo browser para fazer as request
	  	
	  	dependencia no pom --> graphiql-spring-boot-starter
	 
	  	
	  	Já se quisermos fazer as requests diretamente no postman é só chamar
	  	
	  	localhost:8095/graphql
	 
	 */
	
	
	public List<Produto> findProdutos() {
		
		return produtoService.getProdutos();
				
	}
	
	public Produto findProduto(final Long id) {
		
		return produtoService.getProdutoById(id);
	}
	
	public Produto cadastraProduto(final ProdutoRequest produtoRequest) {
		return produtoService.cadastraProduto(produtoRequest);
	}
}