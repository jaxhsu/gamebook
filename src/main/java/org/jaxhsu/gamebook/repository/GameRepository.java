package org.jaxhsu.gamebook.repository;

import org.jaxhsu.gamebook.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Integer> {

}
