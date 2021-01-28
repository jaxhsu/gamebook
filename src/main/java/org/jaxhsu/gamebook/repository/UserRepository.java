package org.jaxhsu.gamebook.repository;

import org.jaxhsu.gamebook.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}