package org.jaxhsu.gamebook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String url;

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name='" + name + '\'' + ", url='" + url + '\'' + '}';
	}
}