package br.com.empresa.graphqlserver.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.empresa.graphqlserver.dto.Fabricante;
import br.com.empresa.graphqlserver.dto.Produto;
import br.com.empresa.graphqlserver.dto.ProdutoRequest;
import br.com.empresa.graphqlserver.entity.ProdutoEntity;
import br.com.empresa.graphqlserver.exceptions.NotFoundException;
import br.com.empresa.graphqlserver.repository.ProdutoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	private FabricanteService fabricanteService;
	
	
	
	public List<Produto> getProdutos() {
		
		var produtos = produtoRepository.findAll()
				.stream()
				.map(this::mapeiaProduto)
				.collect(Collectors.toList());
		
		
		//collect(Collectors.toList());
		if(produtos.isEmpty()) {
			throw new NotFoundException("Não foram encontrados produtos");
		}
		
		return produtos;
		
	}

	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id)
				.map(this::mapeiaProduto)
				.orElseThrow(() -> new NotFoundException("Produto não encontrado")) ;
	}

	public Produto cadastraProduto(ProdutoRequest produtoRequest) {
		var fabricante = fabricanteService.buscaFabricanteById(produtoRequest.getIdFabricante());
		
		ProdutoEntity novoProduto = ProdutoEntity.builder()
				.fabricante(fabricante)
				.lote(produtoRequest.getLote())
				.dataValidade(LocalDate.parse(produtoRequest.getDataValidade(), DateTimeFormatter.ofPattern("yyyy-MM-dd")))
				.nome(produtoRequest.getNome())
				.build();		
		
		novoProduto = produtoRepository.save(novoProduto);
		
		return mapeiaProduto(novoProduto);
		
	}
	
	
	
	private Produto mapeiaProduto(ProdutoEntity prod) {
		return Produto.builder()
		.id(prod.getId())
		.nome(prod.getNome())
		.dataValidade(prod.getDataValidade())
		.lote(prod.getLote())
		.fabricante(
				Fabricante.builder()
					.id(prod.getFabricante().getId())
					.nome(prod.getFabricante().getNome())
					.categoria(prod.getFabricante().getCategoria())
					.estado(prod.getFabricante().getEstado())
					.cidade(prod.getFabricante().getCidade())
					.build()
		)						
		.build();
	}	
	
	
}
