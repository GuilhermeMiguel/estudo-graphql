package br.com.empresa.graphqlserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empresa.graphqlserver.entity.FabricanteEntity;

@Repository
public interface FabricanteRepository extends JpaRepository<FabricanteEntity, Long>{

}
