package org.jaxhsu.gamebook.domain;

import java.io.File;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileData {
	
	public int level;
	public File file;
}
