package org.jaxhsu.gamebook.repository;

import java.util.List;

import org.jaxhsu.gamebook.domain.User;
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
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void saveTest() throws Exception {
		User user = new User();
		user.setName("鄭飛龍");
		user.setUrl("http://merryyou.cn");
		User result = userRepository.save(user);
		log.info(result.toString());
		Assert.assertNotNull(user.getId());
	}

	@Test
	public void findAllTest() throws Exception {
		List<User> users = userRepository.findAll();
		users.forEach(user -> {
			log.info(user.toString());
		});
	}
}
