package org.jaxhsu.gamebook.controller;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.jaxhsu.gamebook.domain.FileData;
import org.jaxhsu.gamebook.service.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api")
public class ScanController {

	@Autowired
	public ScanService scanService;

	@PostMapping("firstscan")
	public String first(@RequestBody Map<String, Object> param) {
		log.debug("first scan...param=" + param);

		// 參數
		String filePath = "D:/tmp";
		File dirFile = new File(filePath);
		// 暫存
		List<FileData> list = new LinkedList<FileData>();
		// 掃描
		scanFile(list, new FileData(0, dirFile));
		// 排序
		list.stream().sorted(Comparator.comparing(FileData::getLevel).reversed()).forEach(data -> {
			System.out.println("LEVEL=" + data.getLevel() + " ,FILE_PATH" + data.getFile().getAbsolutePath());
		});

		return "first scan";
	}

	
	public void scanFile(List<FileData> list, FileData data) {
		try {
			int level = data.getLevel();
			File file = data.getFile();
			if (file.isDirectory()) {
				for (File f : file.listFiles()) {
					scanFile(list, new FileData(level + 1, f));
				}
			} else if (file.isFile()) {
				// System.out.println("LEVEL=" + level + " ,FilePath=" +
				// file.getAbsolutePath());
				list.add(new FileData(level, file));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}