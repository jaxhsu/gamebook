package org.jaxhsu.gamebook.repository;

import java.util.Date;
import java.util.List;

import org.jaxhsu.gamebook.domain.Game;
import org.jaxhsu.gamebook.enums.GameType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class GameRepositoryTest {
	@Autowired
	private GameRepository gameRepository;

	@Test
	public void saveTest() throws Exception {

		Game game = new Game();
		game.setCircle("XX社");
		game.setName("OO遊戲");
		game.setPath("D:/game/file/test");
		game.setReleaseDate(new Date());
		game.setType(GameType.GAME);

		Game result = gameRepository.save(game);
		log.info(result.toString());
		Assert.assertNotNull(game.getId());
	}

	@Test
	public void findAllTest() throws Exception {
		List<Game> games = gameRepository.findAll();
		games.forEach(game -> {
			log.info(game.toString());
		});
	}
	
}
