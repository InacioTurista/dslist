package com.inacioturist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inacioturist.dslist.dto.GameMinDTO;
import com.inacioturist.dslist.entities.Game;
import com.inacioturist.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		// old way that was made
		/* List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto; */
	}
}