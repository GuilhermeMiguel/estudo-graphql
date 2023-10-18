package br.com.empresa.graphqlclient.controller;

import br.com.empresa.graphqlclient.dto.Produto;
import br.com.empresa.graphqlclient.dto.ProdutoRequest;
import br.com.empresa.graphqlclient.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.findProduto(id));
    }


    @GetMapping()
    public ResponseEntity<List<Produto>> getProdutoProdutos() {
        return ResponseEntity.ok(produtoService.findProdutos());
    }


    @PostMapping()
    public ResponseEntity<Produto> getProdutoProdutos(@RequestBody ProdutoRequest produtoRequest) {
        return ResponseEntity.ok(produtoService.criaProdutos(produtoRequest));
    }

}
