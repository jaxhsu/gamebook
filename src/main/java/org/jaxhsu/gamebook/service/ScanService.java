package org.jaxhsu.gamebook.service;

import org.jaxhsu.gamebook.domain.Game;
import org.jaxhsu.gamebook.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanService {

	@Autowired
	private GameRepository gameRepository;

	public Game insert(Game game) {
		return gameRepository.save(game);
	}

}
