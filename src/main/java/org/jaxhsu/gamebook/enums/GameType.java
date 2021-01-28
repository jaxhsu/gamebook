package org.jaxhsu.gamebook.enums;

import lombok.Getter;

public enum GameType {
	GAME(0), HGAME(1), OTHER(2);

	@Getter
	private final int code;

	GameType(int code) {
		this.code = code;
	}

	public static GameType of(int code) {
		for (GameType gameType : GameType.values()) {
			if (gameType.getCode() == code) {
				return gameType;
			}
		}
		return GameType.OTHER;
	}

//	public String toString() {
//		for (GameType gameType : GameType.values()) {
//			if (gameType.getCode() == code) {
//				return gameType.name();
//			}
//		}
//		return "";
//	}
}
