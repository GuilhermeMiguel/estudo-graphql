package br.com.empresa.graphqlclient.service;

import br.com.empresa.graphqlclient.dto.Produto;
import br.com.empresa.graphqlclient.dto.ProdutoRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final HttpGraphQlClient httpGraphQlClient;

    public Produto findProduto(Long id) {
        return httpGraphQlClient.documentName("produtoById")
                .variable("id", id)
                .retrieve("findProduto")
                .toEntity(Produto.class)
                .block();
    }

    public List<Produto> findProdutos() {
        return httpGraphQlClient.documentName("produtos")
                .retrieve("findProdutos")
                .toEntityList(Produto.class)
                .block();
    }

    public Produto criaProdutos(ProdutoRequest produtoRequest) {

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.convertValue(produtoRequest, new TypeReference<>() {});

        return httpGraphQlClient.documentName("criaProduto")
                .variables(map)
                .retrieve("cadastraProduto")
                .toEntity(Produto.class)
                .block();
    }

}
