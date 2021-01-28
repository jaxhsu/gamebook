package org.jaxhsu.gamebook.enums.convert;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.jaxhsu.gamebook.enums.GameType;

@Converter
public class GameTypeConvert implements AttributeConverter<GameType, Integer> {

	@Override
	public Integer convertToDatabaseColumn(GameType attribute) {
		return attribute.getCode();
	}

	@Override
	public GameType convertToEntityAttribute(Integer dbData) {
		if (dbData == null) {
			return GameType.OTHER;
		}
		return GameType.of(dbData);
	}

}
