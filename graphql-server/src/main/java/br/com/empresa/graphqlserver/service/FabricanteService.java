package br.com.empresa.graphqlserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.graphqlserver.entity.FabricanteEntity;
import br.com.empresa.graphqlserver.exceptions.NotFoundException;
import br.com.empresa.graphqlserver.repository.FabricanteRepository;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	public FabricanteEntity buscaFabricanteById(Long id) {
		return fabricanteRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Fabricante não encontrado"));
	}
}
