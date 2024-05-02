package br.com.rafaelmoura.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rafaelmoura.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game, Integer> {
    
}
