package org.jaxhsu.gamebook.domain;

import java.util.Date;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jaxhsu.gamebook.enums.GameType;
import org.jaxhsu.gamebook.enums.convert.GameTypeConvert;

import lombok.Data;

@Entity
@Table(name = "t_game")
@Data
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** 類型 */
	@Convert(converter = GameTypeConvert.class)
	private GameType type;
	/** 遊戲名稱 */
	private String name;
	/** 遊戲位置 */
	private String path;
	/** 發售日 */
	private Date releaseDate;
	/** 社團名 */
	private String circle;
	/** 是否啟用 */
	private Boolean enabled = false;

}
